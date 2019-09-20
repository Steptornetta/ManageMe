/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageme;

/**
 *
 * @author Tornetta
 */
public class RealEstateManager {
    
    private int RealEstateManagerID;
    private String fName;
    private String lName;
    private int managedproperties;

    public RealEstateManager(int RealEstateManagerID, String fName, String lName, int managedproperties) {
        this.RealEstateManagerID = RealEstateManagerID;
        this.fName = fName;
        this.lName = lName;
        this.managedproperties = managedproperties;
    }

    public int getRealEstateManagerID() {
        return RealEstateManagerID;
    }

    public void setRealEstateManager(int RealEstateManagerID) {
        this.RealEstateManagerID = RealEstateManagerID;
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

    public int getManagedproperties() {
        return managedproperties;
    }

    public void setManagedproperties(int managedproperties) {
        this.managedproperties = managedproperties;
    }
    
    
}
