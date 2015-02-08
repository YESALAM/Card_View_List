package com.techonlogic.yesalam.cardviewlist;

/**
 * Created by yesAlam on 22/01/15.
 */
public class BusData {

    String from ;
    String to ;
    String fare ;
    String dist ;
    String bus;

    public BusData(String from,String to,String fare,String dist,String bus){
        this.from = from;
        this.to = to;
        this.fare = fare;
        this.dist = dist;
        this.bus = bus;
    }

    public String getFrom(){return from;}
    public String getTo() {return to;}
    public String getFare(){return fare;}
    public String getDist() {return dist;}
    public String getBus() {return bus;}


}
