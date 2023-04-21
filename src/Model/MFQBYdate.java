/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;


/**
 *
 * @author Trong The
 */
public class MFQBYdate implements Serializable {
    private String ID;

    public MFQBYdate(String ID, String name, 
            Double quantily, Boolean IAndE, 
            String Regions, String time) {
        this.ID = ID;
        this.name = name;
        this.quantily = quantily;
        this.IAndE = IAndE;
        this.Regions = Regions;
        this.time = time;
    }
    private String name;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getQuantily() {
        return quantily;
    }

    public void setQuantily(Double quantily) {
        this.quantily = quantily;
    }

    public Boolean getIAndE() {
        return IAndE;
    }

    public void setIAndE(Boolean IAndE) {
        this.IAndE = IAndE;
    }

    public String getRegions() {
        return Regions;
    }

    public void setRegions(String Regions) {
        this.Regions = Regions;
    }

  

   
    private Double quantily;
    private Boolean IAndE;
    private String Regions;
    private String time;
    

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
}
