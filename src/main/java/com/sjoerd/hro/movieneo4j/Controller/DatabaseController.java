/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjoerd.hro.movieneo4j.Controller;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

/**
 *
 * @author Sjoerd Thijsse
 */
public final class DatabaseController {

    public static final String DB_PATH = "D:/testDB.db";
    public static GraphDatabaseService graphDb;

    public DatabaseController() {

    }

    private void registerShutdownHook(final GraphDatabaseService graphDb) {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                graphDb.shutdown();
            }
        });
    }

    public void startDatabase() {
        graphDb = new GraphDatabaseFactory().newEmbeddedDatabase(DB_PATH);
        this.registerShutdownHook(graphDb);
    }

    public void restartDatabase() {
        graphDb.shutdown();
        this.startDatabase();
    }

    public void stopDatabase() {
        graphDb.shutdown();
    }

}
