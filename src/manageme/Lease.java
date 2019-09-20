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
public class Lease implements Discount {
    
    private int LeaseID;
    private int LeaseLength;
    private boolean LeaseAgreed; // Y/N if the tenant and Real Estate Manager have both approved the Lease.
    private int Violations; // how many lease violations there have been

    public Lease(int LeaseID, int LeaseLength, boolean LeaseAgreed, int Violations) {
        this.LeaseID = LeaseID;
        this.LeaseLength = LeaseLength;
        this.LeaseAgreed = LeaseAgreed;
        this.Violations = Violations;
    }

    public int getLeaseID() {
        return LeaseID;
    }

    public void setLeaseID(int LeaseID) {
        this.LeaseID = LeaseID;
    }

    public int getLeaseLength() {
        return LeaseLength;
    }

    public void setLeaseLength(int LeaseLength) {
        this.LeaseLength = LeaseLength;
    }

    public boolean isLeaseAgreed() {
        return LeaseAgreed;
    }

    public void setLeaseAgreed(boolean LeaseAgreed) {
        this.LeaseAgreed = LeaseAgreed;
    }

    public int getViolations() {
        return Violations;
    }

    public void setViolations(int Violations) {
        this.Violations = Violations;
    }

    @Override
    public int calculateDiscount() {
        if(LeaseAgreed = true)
        {
            int discount = 150;
            if(Violations == 0)
            {
               discount = discount + 100;
               return discount;
            }
            return discount;
            
        }
        else
        {
            return 0;
        }
    }
    
}

