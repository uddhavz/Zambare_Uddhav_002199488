/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author UddhavZ
 */
public class ManagementSystem {
    
    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;
    DoctorDirectory doctorDirectory;
    HospitalDirectory hospitalDirectory;
    HashMap<String, City> cities;

    public ManagementSystem() {
        this.patientDirectory = new PatientDirectory();
        this.personDirectory = new PersonDirectory(); 
        this.hospitalDirectory = new HospitalDirectory(); 
        this.doctorDirectory = new DoctorDirectory();
        this.cities = new HashMap<String, City>();
    }
    
    public int addPatient(Patient patient) {
        return patientDirectory.addPatient(patient);
    }
    
    public int addDoctor(Doctor doctor) {
        return doctorDirectory.addDoctor(doctor);
    }
    
    public int addPerson(Person person) {
        if(cities.get(person.getHouse().getCity())==null){
            cities.put(person.getHouse().getCity(),new City(person.getHouse().getCity()));
        }
        cities.get(person.getHouse().getCity()).getCommunity(person.getHouse().getCommunity()).addCommunityHouse(person.getHouse());
        return personDirectory.addPerson(person);
    }
    
    public int addHospital(Hospital hospital) {
        if(cities.get(hospital.getHouse().getCity())==null){
            cities.put(hospital.getHouse().getCity(),new City(hospital.getHouse().getCity()));
        }
        cities.get(hospital.getHouse().getCity()).getCommunity(hospital.getHouse().getCommunity()).addCommunityHouse(hospital.getHouse());
        return hospitalDirectory.addHospital(hospital);
    }
    
    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }
    
    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }
    
    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public List<City> getCities() {
        return new ArrayList<>(cities.values());
    }  
    public City getCity(String cityName) {
        if(cities.get(cityName)==null){
            cities.put(cityName, new City(cityName));
        }
        return cities.get(cityName);
    }  
}
