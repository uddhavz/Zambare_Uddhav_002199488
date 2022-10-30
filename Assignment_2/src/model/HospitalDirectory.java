/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author UddhavZ
 */
public class HospitalDirectory {
    private HashMap<Integer, Hospital> hospitals;

    public HospitalDirectory() {
        hospitals = new HashMap<Integer, Hospital>();
    }
    
    public int generateHospitalId() {
        int id;
        do {
            id = (int) ((Math.random() * (999 - 900)) + 100);
        } while (hospitals.keySet().contains(id));
        System.out.println("Hospital ID:"+id);

        return id;
    }

    public Hospital getHospital(int id) {
        return hospitals.get(id);
    }
    
    public List<Hospital> getHospitals() {
        return new ArrayList(hospitals.values());
    }

    public List<Integer> getHospitalIds() {
        return new ArrayList(hospitals.keySet());
    }
    
    public int addHospital(Hospital hospital) {
        int id = this.generateHospitalId();
        hospital.setHospitalId(id);
        this.hospitals.put(id, hospital);
        return id;
    }
    
    public void replacehospital(Hospital hospital){
        this.hospitals.put(hospital.getHospitalId(), hospital);
    }
    
    public void removeHospital(int id) {
        this.hospitals.remove(id);
    }

    @Override
    public String toString() {
        return "HospitalDirectory{" + "hospitals=" + hospitals + '}';
    }
    
}
