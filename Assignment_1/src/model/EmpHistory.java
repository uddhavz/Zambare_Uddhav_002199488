/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author UddhavZ
 */
public class EmpHistory {
    
    private ArrayList<Emp> history;
    
    public EmpHistory(){
        this.history = new ArrayList<Emp>();
    }
    
    public ArrayList<Emp> getHistory(){
        return history;
    }
    
    public void setHistory(ArrayList<Emp> history){
        this.history = history;
    }
    
    public Emp addNewEmp(){
        Emp newEmp = new Emp();
        history.add(newEmp);
        return newEmp;
    }
    
    public void deleteEmp(Emp emp){
        history.remove(emp);
    }
    
    
}
