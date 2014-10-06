/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjoerd.hro.movieneo4j;

import com.sjoerd.hro.movieneo4j.Controller.*;
import com.sjoerd.hro.movieneo4j.Model.*;
import java.io.File;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.index.IndexHits;
import static scala.collection.GenSeqViewLike.Filtered$class.index;
//import com.sjoerd.hro.movieneo4j.View.*;

/**
 *
 * @author Sjoerd Thijsse
 */
public class main {

    static DatabaseController dbController = new DatabaseController();
    static ActorController actorController = new ActorController();
    static MovieController movieController = new MovieController();

    static Actor actor = new Actor("Aaron Paul", "1994-02-01");
    static Movie movie = new Movie("Breaking Bad", "2006-31-03", 2006);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        deleteFileOrDirectory(new File(DatabaseController.DB_PATH));

        dbController.startDatabase();

        actorController.createActorWithLabel(actor, "actor");
        movieController.createMovie(movie);

        actorController.test();


    }

    private static void deleteFileOrDirectory(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File child : file.listFiles()) {
                    deleteFileOrDirectory(child);
                }
            }
            file.delete();
        }
    }

}
