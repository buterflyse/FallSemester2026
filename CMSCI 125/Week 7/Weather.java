/*
Name: Buterflyse
Date: 10/30/2026
Class: Comp. Sci. 125
Description: This program holds the constructor method information to create an object in a pilot that allows you to hold information about the weather such as the temp, weather conditions, and whether the temp is in Fahrenheit or Celcius.
This program allows you to also change certain parts of the saved information per instance.
 */

public class Weather {

    //Creating instance variables:
    private int temp;
    private String sky;
    private boolean isFahrenheit;


    //Constructor Method Setup:

    // -- Default constructor
    public Weather(){
        temp = 70;
        sky = "sunny";
        isFahrenheit = true;
    }

    // -- Editable Constructor method:
    public Weather(int newTemp, String newSky, boolean newFahrenheit){
        if(newTemp > -50 && newTemp < 150){
            temp = newTemp;
        }
        if(newSky.equals("sunny") || newSky.equals("snowy") || newSky.equals("cloudy") || newSky.equals("rainy")){
            sky = newSky;
        }
        isFahrenheit = newFahrenheit;
    }

    //Creating Mutators

    // -- Allows you to change your temperature to celcius if not already
    public void toCelcius(){
        if(isFahrenheit){
            isFahrenheit = false;
            temp = (temp-32) * 5/9;
        }
    }

    // -- allows you to set a new temp provided it is within an appropriate range
    public void setTemp(int newTemp){
        if(newTemp > -50 && newTemp < 150){
            temp = newTemp;
        }
    }

    // -- Allows you to set new weather conditions provided it is one of the approved conditions.
    public void setSky(String newSky){
        if(newSky.equals("sunny") || newSky.equals("snowy") || newSky.equals("cloudy") || newSky.equals("rainy")){
            sky = newSky;
        }
    }


    //Creating Accessors

    // returns the temperature of your selected instnance
    public int getTemp(){
        return temp;
    }

    // -- allows you to see the weather conditions of your selected instnance
    public String getSky(){
        return sky;
    }

    // -- Allows you to see if the weather makes any sense
    public boolean isConsistent(){
        if(temp > 32 && sky.equals("snowy")) {
            return false;
        } else if (temp < 32 && sky.equals("rainy")) {
            return false;
        } else {
            return true;
        }
    }

    // -- provides all of the information about the weather of your selected instnance
    public String toString(){
        String fahr;
        if(isFahrenheit){
            fahr = "Fahrenheit";
        } else {
            fahr = "Celsius";
        }
        return "The temp is " + temp + " degrees " + fahr + " and the sky is " + sky;
    }

    //-- Checks to see if your weather is being measured in Fahrenheit
    public boolean isFahrenheit(){
        return isFahrenheit;
    }
}
