/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjoerd.hro.movieneo4j.Controller;

import com.sjoerd.hro.movieneo4j.Model.*;
import org.neo4j.cypher.javacompat.ExecutionEngine;
import org.neo4j.cypher.javacompat.ExecutionResult;
import org.neo4j.graphdb.DynamicLabel;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;

/**
 *
 * @author Sjoerd Thijsse
 */
public class ActorController {

    DatabaseController dbController;
    Node node;

    public ActorController() {
        dbController = new DatabaseController();

    }

    public void test() {
        ExecutionEngine engine = new ExecutionEngine(DatabaseController.graphDb);

        ExecutionResult result;
        try (Transaction ignored = DatabaseController.graphDb.beginTx()) {
            result = engine.execute("match (n:actor) return n, n.name, n.birthbay");
            System.out.println(result.dumpToString());
            System.out.println(result.columns());
        }
    }

    public void createActor(Actor actor) {
        try (Transaction tx = DatabaseController.graphDb.beginTx()) {

            node = DatabaseController.graphDb.createNode();
            node.setProperty("name", actor.getName());
            node.setProperty("birthday", actor.getBirthDay());

            tx.success();
        }
    }

    public void createActorWithLabel(Actor actor, String label) {
        try (Transaction tx = DatabaseController.graphDb.beginTx()) {
            Label lbl = DynamicLabel.label(label);

            node = DatabaseController.graphDb.createNode(lbl);
            node.setProperty("name", actor.getName());
            node.setProperty("birthDay", actor.getBirthDay());

            tx.success();
        }
    }

    public void readActor(Actor actor) {
        try (Transaction tx = DatabaseController.graphDb.beginTx()) {

            tx.success();
        }
    }

    public void updateActor(Actor actor) {
        try (Transaction tx = DatabaseController.graphDb.beginTx()) {

            tx.success();
        }
    }

    public void deleteActor(Actor actor) {
        try (Transaction tx = DatabaseController.graphDb.beginTx()) {

            tx.success();
        }
    }

    public void linkActorToMovie(Actor actor, Movie movie) {
        try (Transaction tx = DatabaseController.graphDb.beginTx()) {

            tx.success();
        }
    }

    public Actor findActor(Actor actor) {
        return actor;
    }

}
