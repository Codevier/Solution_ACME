/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution_acme;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import model.Employees;
import model.Outcome;
import model.day;

/**
 *
 * @author Usuario
 */
public class Solution_ACME {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fichero = null;
        PrintWriter pw = null;
        String directorioRaiz = System.getProperty("user.dir");
        Gson gson = new Gson();
        try {
            archivo = new File(directorioRaiz + "\\src\\input\\test.txt");
            //JSONObject obj = new JSONObject(archivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            String datos = "";
            while ((linea = br.readLine()) != null) {
                datos += linea;
            }
            List<Employees> listaEmpleados = new ArrayList<>();
            List<Outcome> result = new ArrayList<>();
            Type listType = new TypeToken<ArrayList<Employees>>() {
            }.getType();
            listaEmpleados = gson.fromJson(datos, listType);
            for (int i = 0; i < listaEmpleados.size(); i++) {
                for (int j = i + 1; j < listaEmpleados.size(); j++) {
                    String Emp1 = listaEmpleados.get(i).getName();
                    String Emp2 = listaEmpleados.get(j).getName();
                    int hours = 0;
                    for (day day1 : listaEmpleados.get(i).getDays()) {
                        for (day day2 : listaEmpleados.get(j).getDays()) {
                            if (day1.getName().equals(day2.getName())) {
                                double in1,in2,fin1,fin2;
                                in1=day1.getInicio();
                                in2=day2.getInicio();
                                fin1=day1.getFin();
                                fin2=day2.getFin();
                                if(in1<in2){
                                    if(in2<fin1)
                                        hours+=1;                                       
                                }
                                else{
                                    if(in1<fin2)
                                        hours+=1;
                                    
                                }
                                break;
                            }
                        }
                    }
                    Outcome out = new Outcome(Emp1, Emp2, hours);
                    result.add(out);

                }

            }
            String JSON = gson.toJson(result);
            fichero = new FileWriter(directorioRaiz + "\\src\\output\\output.txt");
            pw = new PrintWriter(fichero,true);
            pw.println(JSON);

        } catch (JsonSyntaxException | IOException e) {
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (IOException e2) {
            }
        }
    }

    // TODO code application logic here
}
