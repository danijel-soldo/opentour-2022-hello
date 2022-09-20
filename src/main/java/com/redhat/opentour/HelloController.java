package com.redhat.opentour;

import io.javalin.http.Context;

public class HelloController {

    public static void sayHello(Context ctx) {
        ctx.result("Hello world!");
    };

}
