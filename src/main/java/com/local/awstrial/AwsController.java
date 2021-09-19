package com.local.awstrial;

import org.joda.time.LocalTime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;

@Path("/baseContext")
@Produces(MediaType.APPLICATION_JSON)
public class AwsController {

    @GET
    @Path("/health")
    @Produces(MediaType.APPLICATION_JSON)
    public Response healthCheck() {
        LocalTime localTime = new LocalTime();
        return Response.accepted().entity("Hello from AWS, CurrentTime is" + localTime.toString()).build();
    }
}
