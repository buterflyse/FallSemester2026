/*
Name: Buterflyse
Date: 11/14/2026
Class: CMSCI 125
Description: This class is a driver for the BattingStats constructor method, it is used to test all of the BattingStats methods.
 */

import java.util.Arrays;

public class BattingStatsDriver {
    public static void main(String[] args){

        //Arrays with enough information for 2 separate teams:
        int[] team1Hits = {51, 110, 113, 190, 152, 159, 133, 33, 112};
        int[] team1AtBats = {500, 502, 501, 580, 540, 545, 506, 200, 500};
        int[] team2Hits = {113, 78, 143, 133, 159, 138, 162, 133, 182};
        int[] team2AtBats = {500, 501, 501, 500, 515, 503, 510, 500, 540};

        //Creating 3 BattingStats objects to test various methods.
        BattingStats team1Stats = new BattingStats(team1Hits, team1AtBats);
        BattingStats team2Stats = new BattingStats(team2Hits, team2AtBats);
        BattingStats team3Stats = new BattingStats(team1Hits, team1AtBats);

        //testing toString method replacement:
        System.out.println(team1Stats.toString());

        //testing equals method replacement with success and fail cases:
        System.out.println(team1Stats.equals(team2Stats));
        System.out.println(team1Stats.equals(team3Stats));

        //testing all accessors:
        System.out.println(team1Stats.getTeamHits());
        System.out.println(Arrays.toString(team2Stats.getBattingAverages()));
        System.out.println(team1Stats.getHighAvgPlrs());
        System.out.println(team2Stats.getHighAvgPlrs());
    }
}
