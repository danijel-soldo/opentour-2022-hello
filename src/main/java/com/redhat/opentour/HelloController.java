package com.redhat.opentour;

import static java.lang.String.format;

import io.javalin.http.Context;

public class HelloController {

    private static final String LOCATION = System.getenv().getOrDefault("LOCATION", "planet earth");

    public static void sayHello(Context ctx) {
       // ctx.result(format("Hello uu SHOW world ajmeeee from %s!", LOCATION));
        ctx.result(format("Hello Bosch Architecture Week!"));
    };

}
