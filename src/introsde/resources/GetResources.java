package introsde.rest.ehealth.resources;

import introsde.mail.ws.MailServiceImplService;
import introsde.mail.ws.MailService;


import introsde.models.*;
import introsde.helper.*;

//import introsde.client.adapterClient.*;
//import introsde.client.dataBaseClient.*;


import java.util.*;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PathParam;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import java.lang.Exception;



@Stateless // only used if the the application is deployed in a Java EE container
@LocalBean // only used if the the application is deployed in a Java EE container
@Path("/get")
public class GetResources {
    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    int id;
    String UERRELLE = UriHelper.getStorageServicesURL();

    // EntityManager entityManager; // only used if the application is deployed in a Java EE container

    /*
    private static AdapterService getAdapter(){
        AdapterServiceImplService adapterServiceImpl = new AdapterServiceImplService();
        return adapterServiceImpl.getAdapterServiceImplPort();
    }

    private static DataBaseService getDataBaseService(){
        DataBaseServiceImplService dataBaseServiceImplService = new DataBaseServiceImplService();
        return dataBaseServiceImplService.getDataBaseServiceImplPort();
    }
    */

    // Application integration

    @POST
    @Path("/person/{idPerson}/measure")
    @Produces({ MediaType.APPLICATION_JSON })
    @Consumes({ MediaType.APPLICATION_JSON })
    public GoalResponse checkGoal(@PathParam("idPerson") int idPerson, CustomMeasure m) {


        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(UERRELLE + "internal/people/" + idPerson + "/goals");
        Builder builder = webTarget.request(MediaType.APPLICATION_JSON);
        Response res = builder.get();
        List<Goal> gl = res.readEntity(new GenericType<List<Goal>>(){});

        try{
        System.out.println(m);
        System.out.println(m.getMeasureValue());
        System.out.println(m.getMeasureDefinition().getMeasureType());
        System.out.println(m.getMeasureDefinition().getIdMeasureDefinition());
        int mid = m.getMeasureDefinition().getIdMeasureDefinition();
        Goal theGoal = null;
        int passed = 0;
        for(Goal g : gl){
            if (g.getIdMeasureDefinition() == mid){
            System.out.println(g.getIdMeasureDefinition() + " " + g.getOperator() + " " + g.getValue());
            theGoal = g;
        }
            }
        if (theGoal!=null){
            if(theGoal.getOperator().equals("lt") && Integer.parseInt(theGoal.getValue()) > Integer.parseInt(m.getMeasureValue())){
                passed = 1;
            } else if (theGoal.getOperator().equals("gt") && Integer.parseInt(theGoal.getValue()) < Integer.parseInt(m.getMeasureValue())){
                passed = 1;
            } else {
                passed = 0;
            }
        }
        if (passed==1){
            MailServiceImplService mailImplService = new MailServiceImplService();
            MailService mailService = mailImplService.getMailServiceImplPort();
            String content = "Patient : " + idPerson + " " + " archieved " + m.getMeasureDefinition().getMeasureType() + " " + theGoal.getOperator() + " " + theGoal.getValue();
            System.out.println("Response:" + mailService.sendMail("kingokongo46@hotmail.it","PATIENT GOAL ARCHIVED!", content + "\n cong Doc. Andrea"));
            System.out.println("GOAL PASSED");
            return new GoalResponse("T",getSong());
        } else{
            System.out.println("GOAL NOT PASSED");
            return new GoalResponse("F",getQuotation());
        }
    }catch(Exception e){
        e.printStackTrace();
        }
        return new GoalResponse("ERROR",getQuotation());
    }

    @POST
    @Path("/person/{idPerson}/dailygoals")
    @Produces({ MediaType.APPLICATION_JSON })
    @Consumes({ MediaType.APPLICATION_JSON })
    public Score getScore(@PathParam("idPerson") int idPerson,List<DailyGoal> dgl){


        String maxScore = String.valueOf(dgl.size()*100);
        int reached = 0;
        DailyGoal useless = null;
        for (DailyGoal d : dgl){
            if (d.getValue()!=null && d.getValue().equals("T")){
                reached = reached + 1;
            }
        useless = saveOrUpdateDailyGoal1(idPerson,d);
        }


        return new Score(maxScore,String.valueOf(reached*100));
    }

    public Quote getQuotation(){
        Client client3 = ClientBuilder.newClient();
        WebTarget webTarget3 = client3.target(UERRELLE + "external/quote");
        Builder builder3 = webTarget3.request(MediaType.APPLICATION_JSON);
        Response res3 = builder3.get();
        Quote quote = res3.readEntity(Quote.class);
        return quote;
    }

    public Song getSong(){
        Client client4 = ClientBuilder.newClient();
        WebTarget webTarget4 = client4.target(UERRELLE + "external/song");
        Builder builder4 = webTarget4.request(MediaType.APPLICATION_JSON);
        Response res4 = builder4.get();
        Song song = res4.readEntity(Song.class);
        return song;
    }

    public DailyGoal saveOrUpdateDailyGoal1(int idPerson, DailyGoal dg){
    dg.setIdPerson(idPerson);
    Client client2 = ClientBuilder.newClient();
    //http://127.0.1.1:5700/sdelab/internal/people/1/dailygoals
    System.out.println(UERRELLE + "internal/people/" + idPerson + "/dailygoals");
    WebTarget webTarget2 = client2.target(UERRELLE + "internal/people/" + idPerson + "/dailygoals");
    Builder builder2 = webTarget2.request(MediaType.APPLICATION_JSON);
    Response res2 = builder2.post(Entity.json(dg));
    DailyGoal gr = res2.readEntity(DailyGoal.class);
    return gr;
}

}
