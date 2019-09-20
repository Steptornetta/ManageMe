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
public class Teacher extends Tenant {
    
    int familiymembers;
    String coursetaught;
    int yearsteaching;

    public Teacher(int familiymembers, String coursetaught, int yearsteaching, int TenantID, String fName, String lName, int Rent) {
        super(TenantID, fName, lName, Rent);
        this.familiymembers = familiymembers;
        this.coursetaught = coursetaught;
        this.yearsteaching = yearsteaching;
    }
    
    @Override
    public int getRent()
    {
        int teacherRent = super.getRent() + 7500;
        
        if(yearsteaching > 2 || familiymembers > 2)
        {
            teacherRent = teacherRent/2;
            return teacherRent;
        }
        
        else
        {
            teacherRent = teacherRent +500;
            return teacherRent;
        }
        
    }
    
    public int getFamiliymembers() {
        return familiymembers;
    }

    public void setFamiliymembers(int familiymembers) {
        this.familiymembers = familiymembers;
    }

    public String getCoursetaught() {
        return coursetaught;
    }

    public void setCoursetaught(String coursetaught) {
        this.coursetaught = coursetaught;
    }

    public int getYearsteaching() {
        return yearsteaching;
    }

    public void setYearsteaching(int yearsteaching) {
        this.yearsteaching = yearsteaching;
    }    
    
}
