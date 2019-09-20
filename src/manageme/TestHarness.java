/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageme;

import java.util.ArrayList;

/**
 *
 * @author Tornetta
 */
public class TestHarness {
    
    public TestHarness()
    {
        
        Apartment ap1 = new Apartment("Bryce Jordan Tower", 1, 10, 4);
        if(ap1 != null)
        {
            System.out.println("Created Test Apartment.");
            System.out.println("Apartment Info: AptName: "+ ap1.getAptName() + " | AptID: " + ap1.getAptID() + " | AptAge: " + ap1.getAptAge() + " | AptRooms: " + ap1.getRooms());
            //Changing the objects parameters
            ap1.setAptName("The Collegian");
            ap1.setAptID(2);
            ap1.setAptAge(5);
            ap1.setRooms(6);
            System.out.println("Update Info:");
            System.out.println("Apartment Info: "+ ap1.getAptName() + " | AptID: " + ap1.getAptID() + " | AptAge: " + ap1.getAptAge() + " | AptRooms: " + ap1.getRooms());
            
        }
        Tenant t1 = new Tenant(1, "Bob", "Frank", 850);
        if(t1 != null)
        {
            System.out.println("\nCreated Test Tenant.");
            System.out.println("Tenant Info: TenantID: "+ t1.getTenantID()+ " | TenantFname: " + t1.getfName()+ " | TenantLname: " + t1.getlName()+ " | TenantRent: " + t1.getRent());
            //Changing the objects parameters
            t1.setTenantID(2);
            t1.setfName("Louie");
            t1.setlName("Lewis");
            t1.setRent(660);
            System.out.println("Update Info:");
            System.out.println("Tenant Info: TenantID: "+ t1.getTenantID()+ " | TenantFname: " + t1.getfName()+ " | TenantLname: " + t1.getlName()+ " | TenantRent: " + t1.getRent());
            
        }
        
  
    }
    
    public void testClassHierarchy()
    {
        ArrayList<Tenant> TenantList = new ArrayList<>();
        
        //Right now I just have a base rent set to 10,000. 
        //Some Tenants may not be Teachers or Students but we want to make a special case for them.
        
        Teacher teach1 = new Teacher(4, "Math", 3, 5, "John", "Baker", 10000);
        TenantList.add(teach1);
        
        Student stud1 = new Student("IST", 2, false, 4, "Mike", "Johnson", 10000);
        TenantList.add(stud1);
        
        System.out.println("\nNew Rent Info:");
        for(Tenant e : TenantList)
        {
           int newRent = e.getRent();
           System.out.println(e.getfName() + " " + e.getlName() + " | Rent: " + newRent);
        }

    }
    public void testInterface()
    {
        ArrayList<Discount> DiscountList = new ArrayList<>();
        
        //Were using the Discount interface to give tenants better deals depending on if they have had a lease previously with no violations or the apartment has been availble for a long time.
        
        Lease lease1 = new Lease(1, 3, true, 0);
        DiscountList.add(lease1);
        
        Availability avail1 = new Availability(true, 6, "Four Bedroom Apartment");
        DiscountList.add(avail1);
        
        System.out.println("\nDiscount Info:");
        for(Discount e : DiscountList)
        {
           
           int discount = e.calculateDiscount();
           System.out.println(discount + " $ off");
        }

    }    
}
