package com.ims.actor;

public class Admin {
    int id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    String buildingNumber;
    String streetName;
    String city;
    int pincode;


    Admin(){  // Unparameterised Constuctor
        System.out.println("This is Unparameterised Constuctor !!");
    }

    Admin(int id, String name, String buildingNumber, String streetName, String city, int pincode){  //Parameterised Constuctor
        this();
        this.id = id;
        this.name = name;
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.city = city;
        this.pincode = pincode;


    }

    void checkProfileDashboard(){
        System.out.println("Please select an option : ");
        System.out.println("Press 1 for Viewing Profile Details");
    }
}
