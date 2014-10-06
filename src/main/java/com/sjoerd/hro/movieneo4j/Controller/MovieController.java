/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sjoerd.hro.movieneo4j.Controller;

import com.sjoerd.hro.movieneo4j.Model.Actor;
import com.sjoerd.hro.movieneo4j.Model.Movie;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;

/**
 *
 * @author Sjoerd Thijsse
 */
public class MovieController {
    
    DatabaseController dbController = new DatabaseController();
    Node node;
    
    public void createMovie(Movie movie){
        try (Transaction tx = DatabaseController.graphDb.beginTx()) {

            node = DatabaseController.graphDb.createNode();
            node.setProperty("name", movie.getName());
            node.setProperty("date", movie.getDate());
            node.setProperty("year", movie.getYear());
            
            tx.success();
        }
    }
    
    public void readMovie(Movie movie){
        
    }
    
    public void updateMovie(Movie movie){
        
    }
    
    public void deleteMovie(Movie movie){
        
    }
    
    public void linMovieToActor(Movie movie, Actor actor){
        
    }
    
    public Movie findMovie(Movie movie){
        return movie;
    }
    
}
