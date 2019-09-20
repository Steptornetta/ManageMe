/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageme;

import java.io.Serializable;

/**
 *
 * @author Tornetta
 */
public class Apartment implements Serializable{
    
    private String AptName;
    private int AptID;
    private int AptAge;
    private int Rooms; 

    public Apartment() {
    }

    
    
    
    public Apartment(String AptName, int AptID, int AptAge, int Rooms) {
        this.AptName = AptName;
        this.AptID = AptID;
        this.AptAge = AptAge;
        this.Rooms = Rooms;
    }



    public String getAptName() {
        return AptName;
    }

    public void setAptName(String AptName) {
        this.AptName = AptName;
    }

    public int getAptID() {
        return AptID;
    }

    public void setAptID(int AptID) {
        this.AptID = AptID;
    }

    public int getAptAge() {
        return AptAge;
    }

    public void setAptAge(int AptAge) {
        this.AptAge = AptAge;
    }

    public int getRooms() {
        return Rooms;
    }

    public void setRooms(int Rooms) {
        this.Rooms = Rooms;
    }

    @Override
    public String toString() {
        return "Apartment{" + "AptName=" + AptName + ", AptID=" + AptID + ", AptAge=" + AptAge + ", Rooms=" + Rooms + '}';
    }    
}
