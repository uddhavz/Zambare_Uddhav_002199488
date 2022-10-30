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
public class DoctorDirectory {
    
    private HashMap<Integer, Doctor> doctors;
    private HashMap<Integer, Integer> personDoctorId;
   
    public DoctorDirectory() {
        doctors = new HashMap<Integer, Doctor>();
        personDoctorId = new HashMap<Integer, Integer>(); 
    }
    
    public Doctor getDoctor(int id) {
        return doctors.get(id);
    }
    
    public List<Doctor> getDoctors() {
        return new ArrayList<>(doctors.values());
    }
    
    public int getDoctorId(int id) {
        return personDoctorId.get(id);
    }
    
    public List<Integer> getDoctorIDs() {
        return new ArrayList(doctors.keySet());
    }
    
    public List<Integer> getPersonIDs() {
        return new ArrayList(personDoctorId.keySet());
    }
    
    public int generateDoctorId(){
        int id;
        do{ 
          id = (int)((Math.random() * (8999 - 8000)) + 8000); 
        }while(doctors.keySet().contains(id));
        System.out.println("Doctor ID:"+id);
        return id;
    }

    public int addDoctor(Doctor doctor) {
        int id = this.generateDoctorId();
        doctor.setDoctorID(id);
        this.doctors.put(id, doctor);
        this.personDoctorId.put(doctor.getPersonId(), id);
        return id;
    }
    
    public void removeDoctor(int id) {
        this.personDoctorId.remove(this.doctors.get(id).getPersonId());
        this.doctors.remove(id);
    }

    @Override
    public String toString() {
        return "DoctorDirectory{" + "doctors=" + doctors+'}';
    }
    
}
