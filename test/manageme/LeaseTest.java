/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageme;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tornetta
 */
public class LeaseTest {
    
    public LeaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getLeaseID method, of class Lease.
     */
    @Test
    public void testGetLeaseID() {
        System.out.println("getLeaseID");
        Lease instance = new Lease(1, 4, true, 3);
        int expResult = 1;
        int result = instance.getLeaseID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLeaseID method, of class Lease.
     */
    @Test
    public void testSetLeaseID() {
        System.out.println("setLeaseID");
        int LeaseID = 2;
        Lease instance = new Lease(1, 4, true, 3);
        instance.setLeaseID(LeaseID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLeaseLength method, of class Lease.
     */
    @Test
    public void testGetLeaseLength() {
        System.out.println("getLeaseLength");
        Lease instance = new Lease(1, 4, true, 3);
        int expResult = 4;
        int result = instance.getLeaseLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLeaseLength method, of class Lease.
     */
    @Test
    public void testSetLeaseLength() {
        System.out.println("setLeaseLength");
        int LeaseLength = 3;
        Lease instance = new Lease(1, 4, true, 3);
        instance.setLeaseLength(LeaseLength);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isLeaseAgreed method, of class Lease.
     */
    @Test
    public void testIsLeaseAgreed() {
        System.out.println("isLeaseAgreed");
        Lease instance = new Lease(1, 4, true, 3);
        boolean expResult = true;
        boolean result = instance.isLeaseAgreed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLeaseAgreed method, of class Lease.
     */
    @Test
    public void testSetLeaseAgreed() {
        System.out.println("setLeaseAgreed");
        boolean LeaseAgreed = false;
        Lease instance = new Lease(1, 4, true, 3);
        instance.setLeaseAgreed(LeaseAgreed);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getViolations method, of class Lease.
     */
    @Test
    public void testGetViolations() {
        System.out.println("getViolations");
        Lease instance = new Lease(1, 4, true, 3);
        int expResult = 3;
        int result = instance.getViolations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setViolations method, of class Lease.
     */
    @Test
    public void testSetViolations() {
        System.out.println("setViolations");
        int Violations = 5;
        Lease instance = new Lease(1, 4, true, 3);
        instance.setViolations(Violations);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
