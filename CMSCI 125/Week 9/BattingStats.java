/*
Name: Buterflyse
Date: 11/14/2026
Class: CMSCI 125
Description: This constructor class holds a constructor method that allows a user to save their baseball teams amount of hits per player and at bats per player. It contains methods that allow you to analyze the data provided by the user in the BattingStatsDriver class.
 */

import java.util.Arrays;

public class BattingStats {

    // INSTANCE VARIABLES:
    private int plrCount;
    private int[] plrHits;
    private int[] atBats;

    //CONSTRUCTOR METHOD: takes in two int array parameters of the same length.
    public BattingStats(int[] newPlrHits, int[] newAtBats){
        if(newPlrHits.length == newAtBats.length){
            plrHits = Arrays.copyOf(newPlrHits, newPlrHits.length);
            atBats = Arrays.copyOf(newAtBats, newAtBats.length);
            plrCount = newPlrHits.length;
        } else {
            System.out.println("ERROR: your lists have different lengths.");
        }
    }

    //toString REPLACEMENT METHOD: returns each player number, their hits, and their at bats.
    public String toString(){
        String output = "";
        for(int i = 0; i < plrCount; i++){
            output = output + "Player " + i + " has " + plrHits[i] + " hits and " + atBats[i] + " at-bats ";
        }
        return output;
    }

    //equals REPLACEMENT METHOD: checks that the provided object instance is a BattingStats object and that all of its contents are the same.
    public boolean equals(Object newObject){
        if(newObject instanceof BattingStats newBattingStats){
            if(newBattingStats.plrCount == this.plrCount  && Arrays.equals(this.atBats,newBattingStats.atBats) && Arrays.equals(this.plrHits, newBattingStats.plrHits)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //ACCESSOR: returns the sum of all of the team hits
    public int getTeamHits(){
        int total = 0;
        for(int i = 0; i < plrCount; i++){
            total += plrHits[i];
        }
        return total;
    }

    //ACCESSOR: returns all of the players batting averages (hits / at bats)
    public double[] getBattingAverages(){
        double[] output;
        output = new double[plrCount];
        for(int i = 0; i < plrCount; i++){
            double temp = (double) plrHits[i] / atBats[i];
            output[i] = temp;
        }
        return output;
    }

    //ACCESSOR: returns the amount of players that have a batting average above 0.300.
    public int getHighAvgPlrs(){
        double[] temp = Arrays.copyOf(getBattingAverages(), getBattingAverages().length);
        int count = 0;
        for(int i = 0; i < temp.length; i++){
            if(temp[i] > .300){
                count += 1;
            }
        }
        return count;
    }


}
