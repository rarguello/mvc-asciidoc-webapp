package com.ricardoarguello;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * HelloController test.
 *
 * @author Ricardo Arguello <ricardo.arguello@gmail.com>
 */
@Path("hello")
public class HelloController {

    @Inject
    private Models models;

    @GET
    @Controller
    @Produces("text/html")
    @View("hello.adoc")
    public void hello(@QueryParam("user") String user) {
        models.put("user", user);
    }
}
