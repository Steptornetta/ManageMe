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
/**
 *
 * @author Tornetta
 */
public class ApartmentListUI extends JFrame {

    
    private ApartmentList theApartmentListModel;
    
    
    private JTextField Ap1= new JTextField(75);
    
    private JButton NextButton;
    private JButton LastButton;
    private JButton RemoveButton;
    private JButton EditButton;
    private JButton AddButton;
    
    private JTextField AptName= new JTextField(25);
    private JTextField AptID= new JTextField(10);
    private JTextField AptAge= new JTextField(10);
    private JTextField AptRooms= new JTextField(10);
    
    private JLabel AptNameLabel = new JLabel("Apartment Name:");
    private JLabel AptIDLabel = new JLabel("Apt ID:");
    private JLabel AptAgeLabel = new JLabel("Apartment Age:");
    private JLabel AptRoomsLabel = new JLabel("Apartment Rooms:");
    private JLabel AddApartmentLabel = new JLabel("Too add/edit a Apartment, Enter in the TextFields below and click the Add or Edit Apartment Button to Add:  ");
    

    
    private int start = 0;

    ApartmentListUI(ApartmentList model) {
        
        this.theApartmentListModel = model;
        this.setLayout(null);
        
        
        Ap1.setText(theApartmentListModel.getApartmentListModel().get(0).toString());

        RemoveButton = new JButton("Remove Apartment");
        NextButton = new JButton("Next Apartment");
        LastButton = new JButton("Last Apartment");
        EditButton = new JButton("Edit Apartment");
        AddButton = new JButton("Add Apartment");
        AptNameLabel.setLabelFor(AptName);
        AptIDLabel.setLabelFor(AptID);
        AptAgeLabel.setLabelFor(AptAge);
        AptRoomsLabel.setLabelFor(AptRooms);

        
        
        JPanel content = new JPanel();

        
        
        
        
        content.add(Ap1);
        content.add(NextButton);
        content.add(LastButton);
        content.add(RemoveButton);
        content.add(EditButton);
        content.add(AddButton);
        
        content.add(AddApartmentLabel);
        content.add(AptNameLabel);

        content.add(AptName);
        content.add(AptIDLabel);
        
        content.add(AptID);
        content.add(AptAgeLabel);
        
        content.add(AptAge);
        content.add(AptRoomsLabel);
  
        content.add(AptRooms);

        this.setContentPane(content);
        this.setSize(1750, 200);
        
        this.setTitle("ManageMe UI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
        
    }
    
    public JButton NextApartmentButton()
    {
        return NextButton;
    }
    
    public JButton LastApartmentButton()
    {
        return LastButton;
    }
    
    public JButton RemoveApartmentButton()
    {
        return RemoveButton;
    }

    public JButton AddApartmentButton()
    {
        return AddButton;
    }    

    public JButton EditApartmentButton()
    {
        return EditButton;
    }    
    public void NextApartmentListener(ActionListener al)
    {
        NextButton.addActionListener(al);
    }
    
    public void LastApartmentListener(ActionListener al)
    {
        LastButton.addActionListener(al);
    }
    
    public void DeleteApartmentListener(ActionListener al)
    {
        RemoveButton.addActionListener(al);
    }
    
    public void EditApartmentListener(ActionListener al)
    {
        EditButton.addActionListener(al);
        
    }
    
    public void AddApartmentListener(ActionListener al)
    {
        AddButton.addActionListener(al);
    }
        
    public void NextApartment()
    {
        int size = theApartmentListModel.getApartmentListModel().size();
        if(start != size-1)
        {
            start = start +1;
            
            Ap1.setText(theApartmentListModel.getApartmentListModel().get(start).toString());
            if(start > size)
            {
                start = size;
            }
            //System.out.println(start);
        }
    }

    public void LastApartment()
    {
        if(start > 0)
        {
            start = start -1;
            Ap1.setText(theApartmentListModel.getApartmentListModel().get(start).toString());
            //System.out.println(start);
        }
    }
    
    public void deleteApartment()
    {
        System.out.println("Removing " + theApartmentListModel.getApartmentListModel().get(start).toString() + " from the Apartment List.");
        theApartmentListModel.getApartmentListModel().remove(start);
        Ap1.setText(theApartmentListModel.getApartmentListModel().get(0).toString());
        start = 0;

    }
    
    public void editApartment()
    {
        deleteApartment(); 
        addApartment();

    }
    
    public void addApartment()
    {
        int ID = Integer.parseInt(AptID.getText());
        int Age = Integer.parseInt(AptAge.getText());
        int Rooms = Integer.parseInt(AptRooms.getText());
        Apartment tempApartment = new Apartment(AptName.getText(),ID, Age, Rooms);
        theApartmentListModel.getApartmentListModel().add(tempApartment);
        
        
    }
    
    
    
}
