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
public class Student extends Tenant {
    
    String major;
    int yearatschool; //ex. Freshman, Sophmore etc..
    boolean previoustenant;

    public Student(String major, int yearatschool, boolean previoustenant, int TenantID, String fName, String lName, int Rent) {
        super(TenantID, fName, lName, Rent);
        this.major = major;
        this.yearatschool = yearatschool;
        this.previoustenant = previoustenant;
    }
    
    @Override
    public int getRent()
    {
        int studentRent = super.getRent() -2500;
        
        if(yearatschool >= 3)
        {
            studentRent = studentRent -150;
            return studentRent;
        }
        
        if(previoustenant == true)
        {
            studentRent = studentRent -350;   
            return studentRent;
        }        
        
        else
        {
            return studentRent;
        }
        
    }
    
}
