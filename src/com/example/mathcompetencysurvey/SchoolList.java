package com.example.mathcompetencysurvey;
import java.util.ArrayList;
public class SchoolList {
    private ArrayList<School> school = new ArrayList<>();
    private ArrayList<Address> address = new ArrayList<>();

    // operations
    public void addSchool(School sc, Address ad) {
        schools.add(sc);
        address.add(ad);
    }

    public void display() {
        for (int i=0; i< school.size(); i++){
            System.out.print("Name of school " + (i+1) + ": ");
            System.out.println(school.get(i).getName());

            System.out.print("Address for school " + (i+1) + ": ");
            //System.out.println(school.get(i).getAddress());
            System.out.println(address.get(i).print());
        }
    }
    public ArrayList<School> getSchool() {
        return school;
    }
    public void setSchool(ArrayList<School> school) {
        this.school = school;
    }
    public ArrayList<Address> getAddress() {
        return address;
    }
    public void setAddress(ArrayList<Address> address) {
        this.address = address;
    }
}

