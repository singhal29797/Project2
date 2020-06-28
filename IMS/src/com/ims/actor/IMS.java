package com.ims.actor;
public class IMS {
    public static void main(String[] args){

        // this code was written for Unparametarised constructor.
        //Admin admin1 = new Admin();


        // this code was written for Parametarised constructor.
        Admin admin = new Admin(1606810292, "Shivam", "201 - PNB", "PNB -Road", "Meerut", 250004);
        System.out.println(admin.id);
        System.out.println(admin.getName());
        System.out.println(admin.buildingNumber);
        System.out.println(admin.streetName);

        System.out.println(admin.city);
        System.out.println(admin.pincode);
        System.out.println("Assignment Done");


        // this code was written for default constructor.
        /* admin.id = 1606810292;
        admin.name = "Shivam Singhal";
        admin.buildingNumber = "201 sec-3";
        admin.streetName = "PNB - Road";
        admin.city = "Meerut";
        admin.pincode = 250004;

        System.out.println(admin.id);
        System.out.println(admin.name);
        System.out.println(admin.buildingNumber);
        System.out.println(admin.streetName);
        System.out.println(admin.city);
        System.out.println(admin.pincode);*/
    }
}