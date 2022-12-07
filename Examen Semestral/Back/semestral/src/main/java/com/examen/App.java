package com.examen;

import static spark.Spark.*;
import org.json.JSONObject;

public class App {
    public static void main(String[] args) {

        pyramid py = new pyramid();

        get("/Student", (req, res) -> "Hello World by Student");

        get("/pyramid", (req, res) -> {
            res.type("application/json");

            pyramids myPr = new pyramids();
            String[] impr = Formater("75,95, 64, 1,   75,  95, 64,  17, 47, 82,  18, 35, 87");
            myPr.addPyramid(impr);

            JSONObject jsonobj = new JSONObject(py);
            return jsonobj;
        });

        get("/hello", (req, res) -> "Hello World");
        get("/", (req, res) -> "Hello World");

        post("/hello", (req, res) -> {
            res.type("application/json");
            return req.body();
        });

    }

    static String[] Formater(String datos) {

        String[] conv = datos.split(",");
        int cant2 = 0, cant3 = 0;
        for (int fila = 1; fila < conv.length; fila++) {
            cant2 += fila;
            if (cant2 >= conv.length) {
                fila = conv.length;
            }
            cant3 += 1;
        }
        String[] ArrayEnd = new String[cant3];

        int cant = 0;
        for (int fila = 1; fila < conv.length; fila++) {
            String[] recor = new String[fila];
            for (int colum = 0; colum < fila; colum++) {
                if (cant < conv.length) {
                    recor[colum] = conv[cant].trim();
                    cant += 1;
                } else {
                    recor[colum] = "0";
                }
            }
            ArrayEnd[fila - 1] = recor.toString();
            if (cant >= conv.length) {
                fila = conv.length;
            }
        }
        return ArrayEnd;
    }

}
