package com.github.janikibichi.mqtt;

import static spark.Spark.*;
import spark.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.gson.Gson;
import spark.Request;
import spark.Response;

public class CallbackController{
    public CallbackController(){}

    public static Object handleMpesa(Request req, Response res){
        return doMpesa(req, res);
    }

    private static Object doMpesa(Request req, Response res){
        System.out.println("Mpesa checkout value: "+req.body());

        Mpesa mpesa = new Gson().fromJson(req.body(), Mpesa.class);

        System.out.println("Here is the status "+mpesa.getStatus());

        return mpesa;
    }
}