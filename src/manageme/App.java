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
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestHarness t1 = new TestHarness();
        t1.testClassHierarchy();
        t1.testInterface();
        
        
        ApartmentList ApartmentListmodel = new ApartmentList();
        TenantList TenantListmodel = new TenantList();
        SerializedDataCollection mydata = new SerializedDataCollection(ApartmentListmodel, TenantListmodel);
        
        ApartmentTableModel theApartmentTablemodel = new ApartmentTableModel(ApartmentListmodel);
        ApartmentListUI ApartmentListUIview = new ApartmentListUI(ApartmentListmodel);
       
        ApartmentTableUI ApartmentTableUIview = new ApartmentTableUI(theApartmentTablemodel);
        
        
        ApartmentCntrl Aptcntrl = new ApartmentCntrl(ApartmentListmodel,ApartmentListUIview,ApartmentTableUIview );
        ApartmentListUIview.setVisible(false);
        ApartmentTableUIview.setVisible(false);
        
        
        RentQueue myqueue = new RentQueue();
        Tenant tempTenant = new Tenant(4, "Louie", "Armstrong", 2444);
        Tenant tempTenant2 = new Tenant(7, "Louie", "Armstrong", 2444);
        
        myqueue.getTenant(3);
        myqueue.removeTenant(tempTenant);
        myqueue.addTenant(tempTenant2);
        myqueue.printTenantQueue();

    }
    
}
