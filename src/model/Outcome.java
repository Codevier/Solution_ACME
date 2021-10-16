/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuario
 */
public class Outcome {
    String Employee1;
    String Employee2;
    int hour;

    public Outcome(String Employee1, String Employee2, int hour) {
        this.Employee1 = Employee1;
        this.Employee2 = Employee2;
        this.hour = hour;
    }

    public String getEmployee1() {
        return Employee1;
    }

    public void setEmployee1(String Employee1) {
        this.Employee1 = Employee1;
    }

    public String getEmployee2() {
        return Employee2;
    }

    public void setEmployee2(String Employee2) {
        this.Employee2 = Employee2;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    
    
    
    
}
