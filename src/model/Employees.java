/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Employees {
    String name;
    List<day> days = new ArrayList<>();

    public Employees(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<day> getDays() {
        return days;
    }

    public void setDays(List<day> days) {
        this.days = days;
    }

    
    
    
    
}
