/*
Name: Buterflyse
Date: 10/30/2026
Class: Comp. Sci. 125
Description: This is the a constructor class that tracks the name of a tv channel, channel number, and if it is a cable channel.
This Constructor allows you to get the Name of the channel, change the channel number, or get all of the information stored in an instance of the constructor method.
 */

public class TelevisionChannel {

    //Instance Variables:
    private String name;
    private int number;
    private boolean cable;

    //Constructor Method Setup:

    // -- default constructor
    public TelevisionChannel(){
        name = "";
        number = 0;
        cable = false;
    }

    // -- editable constructor method
    public TelevisionChannel(String newName, int newNumber, boolean newCable){
        name = newName;
        cable = newCable;
        if(newNumber>0){
            number = newNumber;
        }
    }

    //Accessor Methods:

    //-- returns name string
    public String getName(){
        return name;
    }
    //-- displays Channel name, number, and if its a cable channel or not.
    public String toString(){
        return "Channel name: " + name + ", Channel number: " + number + ", Cable channel: " + cable;
    }

    //Mutator Methods:

    //-- changes channel number provided it's bigger than 0
    public void setNumber(int newNumber){
        if(newNumber > 0){
            number = newNumber;
        }
    }


}
