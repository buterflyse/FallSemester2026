/*
Name: Buterflyse
Date: 11/13/2026
Class: CMSCI 125
Description: This Constructor class contains a constructor that saves a list of random grades for the provided amount of students. It contains methods to return the grade list, create a new list of grades, and get various aspects of the data.
 */

//IMPORTS:
import java.util.Arrays;
import java.util.Random;


public class Grades {

    //Instance Variables:
    private int[] gradeList;

    //CONSTRUCTOR METHOD: Takes in an amount of students
    public Grades(int studentPopulation){
        gradeList = new int[studentPopulation];
        for(int i = 0; i < studentPopulation; i++){
            Random r = new Random();
            int newNum = r.nextInt(0, 101);
            gradeList[i] = newNum;
        }
    }

    //ACCESSOR: returns the array of grades.
    public int[] getTestGrades() {
        return gradeList;
    }

    //MUTATOR: allows you to reset the grade list to a manually generated list.
    public void setTestGrades(int[] newGradeList){
        int newLength = newGradeList.length;
        gradeList = new int[newLength];
        for(int i = 0; i < newLength; i++){
            gradeList[i] = newGradeList[i];
        }
    }

    //toString METHOD REPLACEMENT
    public String toString(){
        return "The test scores for " + gradeList.length +" students are the following: " + Arrays.toString(gradeList);
    }

    // equals METHOD REPLACEMENT
    public boolean equals(Object newObject){
        if(newObject instanceof Grades newGrades){
            if(Arrays.equals(newGrades.getTestGrades(), this.gradeList)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //ACCESSOR: returns the sorted grades from worst to best
    public int[] sortGrades(){
        int[] newArray = Arrays.copyOf(gradeList, gradeList.length);
        Arrays.sort(newArray);
        return newArray;
    }

    //ACCESSOR: returns the highest grade
    public int highestGrade(){
        int[] newArray = Arrays.copyOf(gradeList, gradeList.length);
        Arrays.sort(newArray);
        return newArray[newArray.length-1];
    }

    //ACCESSOR: returns the mean of all of the grades in the array
    public double averageGrade(){
        int sum = 0;
        for(int i = 0; i < gradeList.length; i++){
            sum = sum + gradeList[i];
        }
        double mean = (double) sum/gradeList.length;
        return mean;
    }

    //ACCESSOR: returns the meadian of all the grades in the array
    public double medianGrade(){
        int[] newArray = Arrays.copyOf(gradeList, gradeList.length);
        Arrays.sort(newArray);
        if(newArray.length % 2 == 0){
            int first = newArray[newArray.length/2];
            int second = newArray[first+1];
            return (first + second) / 2.0;
        } else {
            return newArray[newArray.length/2];
        }
    }

    //ACCESSOR: returns the mode of all the grades in the array
    public int modeGrade(){
        int[] counters;
        int init = 0;
        counters = new int[gradeList.length];
        for(int i = 0; i < gradeList.length; i++){
            int count =0;
            for(int j = 0; j < gradeList.length; j++){
                if(gradeList[i] == gradeList[j]){
                    count = count+1;
                }
            }
            counters[i] = count;
            if(counters[i] > init){
                init = i;
            }
        }
        return gradeList[init];
    }
}
