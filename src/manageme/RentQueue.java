/*
    Stephen Tornetta. PSU 2019
*/

package manageme;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author stept
 */

//
public class RentQueue {
    
    private Date startDate;
    private LinkedList<Tenant> TenantinLine = new LinkedList();

    public RentQueue() {
        this.setStartDate();
        this.buildTenantQueue();
        this.printTenantQueue();
        
    }
    
    public void setStartDate()
    {
        Calendar calendar = Calendar.getInstance();
        this.startDate = calendar.getTime();
        
    }
    
    public void addTenant(Tenant t1)
    {
        boolean tenantAdded = false;
        boolean insertDecision = false;
        
        ListIterator<Tenant> tenantIterator = TenantinLine.listIterator();
        Tenant temp = TenantinLine.element();
        while(tenantIterator.hasNext())
        {
            if(t1.getTenantID() < temp.getTenantID())
            {
                TenantinLine.add(tenantIterator.previousIndex(), t1);
                tenantAdded = true;
                break;
            }
            if(tenantAdded == false)
            {
                TenantinLine.add(t1);
                break;
            }
        }
    }
    
    public void removeTenant(Tenant t1)
    {
        ListIterator<Tenant> tenantIterator = TenantinLine.listIterator();
        
        while(tenantIterator.hasNext())
        {
            Tenant test = tenantIterator.next();
                 
            if(t1.getTenantID() == test.getTenantID())
            {
                TenantinLine.remove(t1);
            }   
        }
    }
    
    public void getTenant(int idSearch)
    {
        ListIterator<Tenant> tenantIterator = TenantinLine.listIterator();
        
        while(tenantIterator.hasNext())
        {
            Tenant test = tenantIterator.next();
            if(idSearch == test.getTenantID())
            {
                System.out.println("We found the correct Tenant. Here is his/her data");
                System.out.println(test.toString());
            }
        }

        
    }
    

    public void buildTenantQueue() {
        
        TenantinLine.add(new Tenant(1, "Steve", "Tornetta", 400));
        this.addTenant(new Tenant(3, "Alex", "Frank", 500));
        this.addTenant(new Tenant(2, "Bill", "Bob", 123));
        this.addTenant(new Tenant(4, "Louie", "Armstrong", 2444));
        this.addTenant(new Tenant(5, "Frank", "Lewis", 6664));
        this.addTenant(new Tenant(6, "Stark", "Bourbon", 1243));
        
    }

    public void printTenantQueue() {
        ListIterator<Tenant> tenantIterator = TenantinLine.listIterator();
        System.out.println("---------------Linked List-----------------------");
        while(tenantIterator.hasNext())
        {
            System.out.println(tenantIterator.next().toString());
        }
    }

}
