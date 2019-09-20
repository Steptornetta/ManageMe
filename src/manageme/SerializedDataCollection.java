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
public class SerializedDataCollection {
    
    private ApartmentList myApartmentList;
    private TenantList myTenantList;

    public SerializedDataCollection(ApartmentList myApartmentList, TenantList myTenantList) {
        
       myApartmentList.readApartmentListFile();
       
       if(myApartmentList.getApartmentListModel().isEmpty() || myApartmentList == null)
       {
            myApartmentList.createTestApartmentUserList();
            myApartmentList.writeApartmentListFile();
            myApartmentList.readApartmentListFile();   
       }
       
       myApartmentList.DisplayList();        
        
       
       myTenantList.readApartmentListFile();
       
       if(myTenantList.getTenantListModel().isEmpty() || myTenantList == null)
       {
            myTenantList.createTestApartmentUserList();
            myTenantList.writeApartmentListFile();
            myTenantList.readApartmentListFile();   
       }        
       
       myTenantList.DisplayList();        
        
        this.myApartmentList = myApartmentList;
        this.myTenantList = myTenantList;
        
        
    }

    
}
