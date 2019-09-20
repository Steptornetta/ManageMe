/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageme;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JTable;

/**
 *
 * @author Tornetta
 */
public class ApartmentTableModel extends AbstractTableModel {
    
    private String[] columnNames = {"Apt Name", "Apt ID", "Apt Age", "Apt Rooms"};
    private ApartmentList ApartmentList;

    public ApartmentTableModel(ApartmentList newApartmentList) {
        
        ApartmentList = newApartmentList;
    }

    @Override
    public int getRowCount() {
        return ApartmentList.getApartmentListModel().size();

    }
    
    @Override
    public String getColumnName(int col) {
        return columnNames[col].toString();
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch(col){
            case 0: return (Object)ApartmentList.getApartmentListModel().get(row).getAptName();
            case 1: return (Object)ApartmentList.getApartmentListModel().get(row).getAptID();
            case 2: return (Object)ApartmentList.getApartmentListModel().get(row).getAptAge();
            case 3: return (Object)ApartmentList.getApartmentListModel().get(row).getRooms();
            default: return null;
        }
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    
}
