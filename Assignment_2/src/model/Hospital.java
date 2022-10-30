/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author UddhavZ
 */
public class Hospital {
    
    private int hospitalId;
    private String name;
    private int establishedIn;
    private String email;
    private long contact;
    House house;
    
    public Hospital() {
        house = new House();
    }   
    public Hospital(String name, String establishedIn, String email,
            String contact,String hNo, String community,
            String city, String zipCode) throws ParseException {
    
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        sdf.setLenient(false);
        this.establishedIn = Integer.parseInt(establishedIn);
        this.email = email;
        this.contact = Long.parseLong(contact);
        house = new House();
        house.setHouseNumber(Integer.parseInt(hNo));
        house.setCommunity(community);
        house.setCity(city);
        house.setZip(Integer.parseInt(zipCode));
        
    }
    
    public Hospital(String name, int establishedIn, String email, long contact, int hNo, String community, String city, int zipCode)
            throws ParseException {
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        sdf.setLenient(false);
        this.establishedIn = establishedIn;
        this.email = email;
        this.contact = contact;
        house = new House();
        house.setHouseNumber(hNo);
        house.setCommunity(community);
        house.setCity(city);
        house.setZip(zipCode);
    } 

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEstablishedIn() {
        return establishedIn;
    }

    public void setEstablishedIn(int establishedIn) {
        this.establishedIn = establishedIn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
    
    @Override
    public String toString() {
        return "Hospital{" + "id=" + hospitalId + ", name=" + name + ", establishedIn=" + establishedIn + ", contact=" + contact + ", house=" + house + '}';
    }
    
}
