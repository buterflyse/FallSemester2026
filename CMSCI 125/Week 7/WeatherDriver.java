/*
Name: Buterflyse
Date: 10/30/2026
Class: Comp. Sci. 125
Description: This is the Driver file for the Weather.java file, here I test all of the functions of the Weather.java file.
 */

public class WeatherDriver {
    public static void main(String[] args){

        //Creating new weather object:
        Weather weather = new Weather(60 , "sunny", true);

        //Testing accessors:
        System.out.println(weather.getSky());
        System.out.println(weather.getTemp());
        System.out.println(weather.isFahrenheit());
        System.out.println(weather.isConsistent());
        System.out.println(weather.toString());

        //Testing Mutators:
        weather.toCelcius(); //changing weather to celcius
        weather.setSky("rainy"); //changing weather conditions to rainy
        weather.setTemp(10); //changing the temp to 10 degrees

        //Observing differences:
        System.out.println(weather.toString());



    }
}
