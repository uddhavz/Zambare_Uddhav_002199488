/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author UddhavZ
 */
public class Doctor extends Person{
    
    private int doctorID;

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }
    
    @Override
    public String toString() {
        return "Doctor{" + "doctorID=" + doctorID + '}';
    }
}
