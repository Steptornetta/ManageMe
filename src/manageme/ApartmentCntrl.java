/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageme;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;

/**
 *
 * @author Tornetta
 */
public class ApartmentCntrl {
    
    ApartmentList theApartmentList;
    TenantList theTenantList;
    
    ApartmentListUI theApartmentListUI;
    ApartmentTableModel theApartmentListTableModel ;
    ApartmentTableUI theApartmentTableUI;
    
    ApartmentCntrl(ApartmentList model, ApartmentListUI view, ApartmentTableUI tableview) 
    {

        theApartmentList = model;
        //model.DisplayList();
        
        theApartmentListUI = view;
        theApartmentTableUI = tableview;
        
        class ButtonListener implements ActionListener 
        {            
            public void actionPerformed(ActionEvent e)
            {
                //int selectedTableRow = tableview.getTable().getSelectedRow();
                //int selectedModelRow = tableview.getTable().convertRowIndexToModel(selectedTableRow);
                
                if(e.getSource() == view.NextApartmentButton())
                {
                    view.NextApartment();
                }

                if(e.getSource() == view.LastApartmentButton())
                {
                    view.LastApartment();
                }                
                
                if (e.getSource() == view.RemoveApartmentButton())
                {
                    view.deleteApartment();
                }
                
                if(e.getSource() == view.EditApartmentButton())
                {
                    view.editApartment();
                }
                
                if(e.getSource() == view.AddApartmentButton())
                {
                    view.addApartment();
                }         
                
                if(e.getSource() == tableview.NewTableApartmentButton())
                {
                    tableview.newTableApartment();
                }
                
                if(e.getSource() == tableview.ShowTableApartmentButton())
                {
                    //int selectedrow = tableview.giveDetails();
                    //System.out.println(selectedrow);
                    System.out.println("hey");
                    TableEditView editTable = new TableEditView(model, 1);
                    editTable.setVisible(true);
                }
            }
            
            
  
         
        }

        view.NextApartmentListener(new ButtonListener());
        view.LastApartmentListener(new ButtonListener()); 
        view.DeleteApartmentListener(new ButtonListener()); 
        view.EditApartmentListener(new ButtonListener());
        view.AddApartmentListener(new ButtonListener());    
        tableview.NewTableApartmentListener(new ButtonListener());
        tableview.ShowTableApartmentListener(new ButtonListener());
        
    }
    
    public ApartmentTableModel getApartmentTableModel()
    {
        return theApartmentListTableModel;
    }
    

}
