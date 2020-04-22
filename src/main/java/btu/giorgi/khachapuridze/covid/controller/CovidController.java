package btu.giorgi.khachapuridze.covid.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import btu.giorgi.khachapuridze.covid.model.Covid;

public class CovidController {

    @GET
    @Path("/covid")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Covid> getStatistic() {
        List<Covid> statisticList=new ArrayList<>();
        statisticList.add(new Covid("US",7654,1344,443));
        statisticList.add(new Covid("Span",1200,288,432));
        statisticList.add(new Covid("Italy",10393,5847,837));

        return statisticList;
    }
    @GET
    @Path("/covid")
    @Produces(MediaType.APPLICATION_JSON)
    public Covid CountryStatistic(String country) {
        List<Covid> statisticList= new ArrayList<>();

        for (Covid item: statisticList) {

            if (item.getCountry() == country) {
                return item;
            }
        }

        return null;
    }
    @GET
    @Path("/covid")
    @Produces(MediaType.APPLICATION_JSON)
    public int TotalConfirmed() {
        List<Covid> statisticList= new ArrayList<>();
        int total = 0;
        for (Covid item: statisticList) {
            total += item.getConfirmed();
        }
        return total;
    }
    @GET
    @Path("/covid")
    @Produces(MediaType.APPLICATION_JSON)
    public int TotalDeathget() {
        List<Covid> statisticList= new ArrayList<>();
        int totalDeath = 0;
        for (Covid item: statisticList) {
            totalDeath += item.getDeaths();
        }
        return totalDeath;
    }
    @GET
    @Path("/covid")
    @Produces(MediaType.APPLICATION_JSON)
    public int TotalRecoveryget() {
        List<Covid> statisticList= new ArrayList<>();
        int totalRecovered = 0;
        for (Covid item: statisticList) {
            totalRecovered += item.getRecovered();
        }
        return totalRecovered;
    }


}

