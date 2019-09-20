/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageme;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTable;
/**
 *
 * @author Tornetta
 */
public class TableEditView extends JFrame {
    
    private JButton SaveEditButton;
    private JButton DeleteEditButton;
    private JButton DoneEditButton;
    private ApartmentCntrl newApartmentCntrl;  
    private JLabel AptNameLabel = new JLabel("Apartment Name:");
    private JLabel AptIDLabel = new JLabel("Apt ID:");
    private JLabel AptAgeLabel = new JLabel("Apartment Age:");
    private JLabel AptRoomsLabel = new JLabel("Apartment Rooms:");
    private JTextField AptName= new JTextField(25);
    private JTextField AptID= new JTextField(10);
    private JTextField AptAge= new JTextField(10);
    private JTextField AptRooms= new JTextField(10);    
    public TableEditView(ApartmentList aplist, int selectedRow) 
    {
        int currentSelectedRow = selectedRow;
        JPanel EditViewPanel = new JPanel();
        AptNameLabel.setLabelFor(AptName);
        AptIDLabel.setLabelFor(AptID);
        AptAgeLabel.setLabelFor(AptAge);
        AptRoomsLabel.setLabelFor(AptRooms);
        
        SaveEditButton = new JButton("Save Apartment");
        DeleteEditButton = new JButton("Edit Apartment");
        DoneEditButton = new JButton("Done");  
        Integer myaptID = aplist.getApartmentListModel().get(currentSelectedRow).getAptID();
        Integer myaptAge = aplist.getApartmentListModel().get(currentSelectedRow).getAptAge();
        Integer myaptRooms = aplist.getApartmentListModel().get(currentSelectedRow).getRooms();        
        AptName.setText(aplist.getApartmentListModel().get(currentSelectedRow).getAptName());
        String idvalue = myaptID.toString();
        String agevalue = myaptAge.toString();
        String roomvalue = myaptRooms.toString();
        AptID.setText(idvalue);
        AptAge.setText(agevalue);
        AptRooms.setText(roomvalue);
        
        EditViewPanel.add(AptNameLabel);
        
        EditViewPanel.add(AptName);
        EditViewPanel.add(AptIDLabel);
        
        EditViewPanel.add(AptID);
        EditViewPanel.add(AptAgeLabel);
        
        EditViewPanel.add(AptAge);
        EditViewPanel.add(AptRoomsLabel);
  
        EditViewPanel.add(AptRooms);        
        
        EditViewPanel.add(SaveEditButton);
        EditViewPanel.add(DeleteEditButton);
        EditViewPanel.add(DoneEditButton);
        this.setContentPane(EditViewPanel);
        this.setSize(1100, 400);
        this.setTitle("ManageMe Edit Table");        
    }
    

}
