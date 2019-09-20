/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageme;

import java.util.ArrayList;
import java.util.*;
import java.io.*;

/**
 *
 * @author Tornetta
 */
public class ApartmentList implements Serializable {
    
    private ArrayList<Apartment> ApartmentListModel = new ArrayList();
    private String listofApartmentsFileName = "listofApartments.ser";
    ApartmentList()
    {
       
       this.ApartmentListModel = ApartmentListModel;
        
              
    }

    public void DisplayList()
    {
        for(Apartment e : ApartmentListModel)
        {
            System.out.println(e.toString());
        }
    }

    public ArrayList<Apartment> getApartmentListModel() {
        return ApartmentListModel;
    }

    public void readApartmentListFile() 
    {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try 
        {
            fis = new FileInputStream(listofApartmentsFileName);
            in = new ObjectInputStream(fis);
            ApartmentListModel = (ArrayList)in.readObject();
            in.close();
            if(!ApartmentListModel.isEmpty())
            {
                System.out.println("There are Apartments in the Apartment list");
            }
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

    public void writeApartmentListFile() 
    {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(listofApartmentsFileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(ApartmentListModel);
            out.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public void createTestApartmentUserList() 
    {
        Apartment Ap1 = new Apartment("Bryce Jordan Tower", 1, 10, 5);
        Apartment Ap2 = new Apartment("CedarBrook", 2, 20, 10);
        Apartment Ap3 = new Apartment("Penn Towers", 3, 5, 15);
        Apartment Ap4 = new Apartment("Beaver Terrace", 4, 5, 5);
        Apartment Ap5 = new Apartment("Nicholas Towers", 5, 10, 5);
        
        ApartmentListModel.add(Ap1);
        ApartmentListModel.add(Ap2);
        ApartmentListModel.add(Ap3);
        ApartmentListModel.add(Ap4);
        ApartmentListModel.add(Ap5);    
        System.out.println("Test Apartment created");
        //System.out.println("The Apartment is: "+ ApartmentListModel);
        
    }
            
    
    
    
    
}
