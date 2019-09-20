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
public class Availability implements Discount {
    
    private boolean Available;
    private int AvailablityLength;
    private String AvailablityType; //type of apartment available

    public Availability(boolean Available, int AvailablityLength, String AvailablityType) {
        this.Available = Available;
        this.AvailablityLength = AvailablityLength;
        this.AvailablityType = AvailablityType;
    }

    public boolean isAvailable() {
        return Available;
    }

    public void setAvailable(boolean Available) {
        this.Available = Available;
    }

    public int getAvailablityLength() {
        return AvailablityLength;
    }

    public void setAvailablityLength(int AvailablityLength) {
        this.AvailablityLength = AvailablityLength;
    }

    public String getAvailablityType() {
        return AvailablityType;
    }

    public void setAvailablityType(String AvailablityType) {
        this.AvailablityType = AvailablityType;
    }

    @Override
    public int calculateDiscount() {
        if(AvailablityLength > 5)
        {
            int discount = 500;
            return discount;
        }
        
        else
        {
            return 0;
        }
    }
    
    
    
}
