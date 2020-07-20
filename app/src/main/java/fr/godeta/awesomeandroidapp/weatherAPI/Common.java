package fr.godeta.awesomeandroidapp.weatherAPI;

import android.app.Activity;

import androidx.annotation.NonNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common extends Activity {
    /*public String API_KEY = getResources().getString(R.string.weather_API_key);
    public String API_LINK = getResources().getString(R.string.weather_API_link);
*/
    public static String API_KEY = "099e940ce07582a3843844c30bde0f63";
    public static String API_LINK = "http://api.openweathermap.org/data/2.5/weather";
    //car appel de l'api : api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={your api key}


    @NonNull
    public static String apiRequest(String lat, String lng){
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric",lat,lng,API_KEY));
        return sb.toString();
    }

    public static String unixTimeStampToDateTime(double unixTimeStamp){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long)unixTimeStamp*1000);
        return dateFormat.format(date);
    }

    public static String getImage(String icon){
        return String.format("http://openweathermap.org/img/w/%s.png",icon);
    }

    public static String getDateNow(){
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
