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
public class day {
    String name;
    double inicio;
    double fin;

    public day(String name, double inicio, double fin) {
        this.name = name;
        this.inicio = inicio;
        this.fin = fin;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInicio() {
        return inicio;
    }

    public void setInicio(double inicio) {
        this.inicio = inicio;
    }

    public double getFin() {
        return fin;
    }

    public void setFin(double fin) {
        this.fin = fin;
    }

    

    
    
    
    
}
