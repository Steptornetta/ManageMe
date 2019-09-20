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
public class TenantList implements Serializable {
    
    private ArrayList<Tenant> TenantListModel = new ArrayList();
    private String listofApartmentsFileName = "listofTenants.ser";

    public TenantList() {
    }
    
    public void DisplayList()
    {
        for(Tenant e : TenantListModel)
        {
            System.out.println(e.toString());
        }
    }

    public ArrayList<Tenant> getTenantListModel() {
        return TenantListModel;
    }

public void readApartmentListFile() 
    {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try 
        {
            fis = new FileInputStream(listofApartmentsFileName);
            in = new ObjectInputStream(fis);
            TenantListModel = (ArrayList)in.readObject();
            in.close();
            if(!TenantListModel.isEmpty())
            {
                System.out.println("There are tenants in the tenant list");
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
            out.writeObject(TenantListModel);
            out.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public void createTestApartmentUserList() 
    {
        Tenant T1 = new Tenant(1, "Bob", "Frank ", 5000);
        Tenant T2 = new Tenant(2, "Ted", "Lewis ", 2000);
        Tenant T3 = new Tenant(3, "Louie", "Tone ", 3000);
        Tenant T4 = new Tenant(4, "Jon", "Frast ", 1000);
        Tenant T5 = new Tenant(5, "Steve", "Dran ", 4000);
        
        TenantListModel.add(T1);
        TenantListModel.add(T2);
        TenantListModel.add(T3);
        TenantListModel.add(T4);
        TenantListModel.add(T5);    
        System.out.println("Test TenantList created");
        
    }
                
}
