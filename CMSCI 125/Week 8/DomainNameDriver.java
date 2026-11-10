/*
Name: Buterflyse
Date: 11/6/2026
Description: This is the class meant to test all of the functions of DomainName.java
 */
public class DomainNameDriver {
    public static void main(String[] args){
        DomainName dn1 = new DomainName(); //creating default DomainName object
        System.out.println(dn1.getDomain()); //testing accessor for domain
        dn1.setDomain("www.google.com"); //testing mutator for domain
        System.out.println(dn1.toString()); // testing replaced toString method

        DomainName dn2 = new DomainName("www.google.com"); // creating non-default DomainName object
        System.out.println(dn2.equals(dn1)); // testing replaced equals method
        System.out.println(dn2.hasW3()); // testing hasW3 method
        System.out.println(dn2.getExtension()); // testing getExtension method
        System.out.println(dn2.getName()); //testing getName accessor method

        dn2.setDomain("rememberme"); // changing to test fail cases
        System.out.println(dn2.equals(dn1)); //testing equals fail case
        System.out.println(dn2.hasW3()); //testing hasW3 fail case
        System.out.println(dn2.getExtension()); // testing getExtension fail case
        System.out.println(dn2.getName()); // testing getName fail case
    }
}
