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
public class Tenant implements Serializable {
    
    private int TenantID;
    private String fName;
    private String lName;
    private int Rent;

    public Tenant(int TenantID, String fName, String lName, int Rent) {
        this.TenantID = TenantID;
        this.fName = fName;
        this.lName = lName;
        this.Rent = Rent;
    }

    public int getTenantID() {
        return TenantID;
    }

    public void setTenantID(int TenantID) {
        this.TenantID = TenantID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getRent() {
        return Rent;
    }

    public void setRent(int Rent) {
        this.Rent = Rent;
    }

    @Override
    public String toString() {
        return "Tenant{" + "TenantID=" + TenantID + ", fName=" + fName + ", lName=" + lName + ", Rent=" + Rent + '}';
    }

    public boolean decideToInsert(Tenant t1) {
        boolean decision = false;
        return false;
        
    }
    

}
