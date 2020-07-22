package fr.godeta.awesomeandroidapp.weatherAPI.Model;

//le package model sert à modéliser les données que l'on peut recevoir depuis l'api voir :
// https://youtu.be/wAV2Uqv9KLo?list=PLJ3ip4gnA2mZZ_SfWP9NhTJgWwZrNs8T2&t=695

//json editor https://jsoneditoronline.org/#left=local.sayawa&right=local.zosaxe

public class Coord {
    private double lat;
    private double lon;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public Coord(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }
}
