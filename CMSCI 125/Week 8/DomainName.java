/*
Name: Buterflyse
Date: 11/6/2026
Description: This is the class that defines the Domain Name object for the DomainName driver, this program contains 1 instance variables and accessors to access it as well as mutators to change it.
 */
public class DomainName {
    //Instance Variables:
    private String domain;

    //Constructor Setup:

    //Default Constructor:
    public DomainName(){
        domain = "www.default.com";
    }
    //Non-Default Constructor:
    public DomainName(String newDomain){
        domain = newDomain;
    }


    //MUTATORS:
    public void setDomain(String newDomain) {
        domain = newDomain;
    }


    //Accessors:
    public String getDomain(){
        return domain;
    }


    //toString replacement:
    public String toString(){
        return "Domain: " + domain;
    }

    //equals replacement: takes in DomainName object
    public boolean equals(Object other){
        if(other instanceof DomainName otherDomain){
            if(this.domain.equals(otherDomain.getDomain())){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //Accessors: Checking for specific characters or returning them

    //checks to see if your domain name starts with a www
    public boolean hasW3(){
        String first3 = domain.substring(0,3);
        if(first3.equals("www")){
            return true;
        } else {
            return false;
        }
    }

    //returns the extension of your domain name if at least 1 dot is found
    public String getExtension(){

        if( domain.contains(".")){
            int dotPosition = domain.lastIndexOf('.');
            String extension = domain.substring(dotPosition+1, domain.length());
            return extension;
        } else {
            return "unknown";
        }
    }

    //gets everything between each of the dots of more than 1 dots is found
    public String getName(){
        int counter = 0;
        for(int i = 0; i < domain.length(); i++){
            if(domain.charAt(i) == '.'){
                counter += 1;
            }
        }

        if(counter >= 2){
            int firstDot = domain.indexOf('.');
            int secondDot = domain.lastIndexOf('.');
            String name = domain.substring(firstDot +1, secondDot);
            return name;
        } else {
            return "unknown";
        }
    }
}
