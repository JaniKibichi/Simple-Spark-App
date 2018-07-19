package com.github.janikibichi.mqtt;

import static spark.Spark.*;
import spark.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.gson.Gson;
import spark.Request;
import spark.Response;

public class Callback{
    Logger logger = LoggerFactory.getLogger(Callback.class);

    public Callback(){
        //set up spark java and specify public files
        int maxThreads = 80;
        int minThreads = 2;
        int timeOutMillis = 30000;
        port(8990);
        threadPool(maxThreads,minThreads,timeOutMillis);

        options("/*", (request, response) -> {

            String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
            if (accessControlRequestHeaders != null) {
                response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
            }

            String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
            if (accessControlRequestMethod != null) {
                response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
            }

            return "OK";
        });

        //CORS
        before((request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
            response.header("Access-Control-Request-Method", "GET,POST,PUT,UPDATE,DELETE,OPTIONS");
            response.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
            response.type("application/json");
        });

        //ROUTES
        //handle home route
        post("/confirmation","application/json", (req, res) -> {
            return CallbackController.handleMpesa(req, res);
        });

        //catch ALL
        get("*", "application/json", (req, res)-> { return "This request is not supported. \n"; });
    }
    public static void main(String args[]){
        new Callback();
    }
}