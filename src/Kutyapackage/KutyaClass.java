/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kutyapackage;

/**
 *
 * @author Tomi
 */
public class KutyaClass {
    
    private String fajta;
    private String nem;
    private  int eletkor;
    private String nev;

    public KutyaClass(String sor) {
        String[] d = sor.split(";");
        this.fajta = d[0];
        this.nem = d[1];
        this.eletkor = Integer.parseInt(d[2]);
        this.nev = d[3];
    }

    public String getFajta() {
        return fajta;
    }

    public String getNem() {
        return nem;
    }

    public int getEletkor() {
        return eletkor;
    }


    public String getNev() {
        return nev;
    }
    
    
    
    
}
