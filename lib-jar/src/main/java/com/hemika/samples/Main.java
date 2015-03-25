package com.hemika.samples;

import com.mongodb.MongoClient;

import java.net.UnknownHostException;

/**
 *
 */
public class Main {
    public static void main(String[] args) throws UnknownHostException {
        MongoClient mongo = new MongoClient( "localhost" , 27017 );
    }
}
