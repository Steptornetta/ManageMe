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

public class ApartmentTableUI extends JFrame {
    
    private ApartmentTableModel theApartmentTableModel;
    private JButton NewTableButton;
    private JButton ShowDetailsTableButton;
    private JButton DoneTableButton;
    private JTable ApartmentTable;
    
    public ApartmentTableUI(ApartmentTableModel tablemodel) {
        JPanel TablePanel = new JPanel();
        JPanel ButtonPanel = new JPanel();
        this.setLayout(null);
        
        NewTableButton = new JButton("New");
        ShowDetailsTableButton = new JButton("Details");
        DoneTableButton = new JButton("Done");        
        
        
        this.theApartmentTableModel = tablemodel;
        JTable ApartmentTable = new JTable(tablemodel); 
        JScrollPane tableScroller = new JScrollPane(ApartmentTable);
        tableScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        tableScroller.setPreferredSize(new Dimension(350, 300));    
        ApartmentTable.setFillsViewportHeight(true);
        TablePanel.add(tableScroller);
        
        ButtonPanel.add(NewTableButton);
        ButtonPanel.add(ShowDetailsTableButton);
        ButtonPanel.add(DoneTableButton);
        TablePanel.add(ButtonPanel);
        this.setContentPane(TablePanel);
        this.setSize(500, 400);
        this.setTitle("ManageMe Table");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        
    }
    


    public JButton NewTableApartmentButton()
    {
        return NewTableButton;
    }

    public JButton ShowTableApartmentButton()
    {
        return ShowDetailsTableButton;
    }

    public JButton DoneTableApartmentButton()
    {
        return DoneTableButton;
    }  
    
    public void NewTableApartmentListener(ActionListener al)
    {
        NewTableButton.addActionListener(al);
    }
    public void ShowTableApartmentListener(ActionListener al)
    {
        ShowDetailsTableButton.addActionListener(al);
    }
    public void DoneTableApartmentListener(ActionListener al)
    {
        DoneTableButton.addActionListener(al);
    }         
    
    public void newTableApartment()
    {

    }
    
    public void giveDetails()
    {

    }
    
    public JTable getTable()
    {
        return ApartmentTable;
    }
}
