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
public class RealEstateManagerTest {
    
    public RealEstateManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getRealEstateManagerID method, of class RealEstateManager.
     */
    @Test
    public void testGetRealEstateManagerID() {
        System.out.println("getRealEstateManagerID");
        RealEstateManager instance = new RealEstateManager(1, "John", "Button", 5);
        int expResult = 1;
        int result = instance.getRealEstateManagerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRealEstateManager method, of class RealEstateManager.
     */
    @Test
    public void testSetRealEstateManager() {
        System.out.println("setRealEstateManager");
        int RealEstateManagerID = 2;
        RealEstateManager instance = new RealEstateManager(1, "John", "Button", 5);
        instance.setRealEstateManager(RealEstateManagerID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getfName method, of class RealEstateManager.
     */
    @Test
    public void testGetfName() {
        System.out.println("getfName");
        RealEstateManager instance = new RealEstateManager(1, "John", "Button", 5);
        String expResult = "John";
        String result = instance.getfName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setfName method, of class RealEstateManager.
     */
    @Test
    public void testSetfName() {
        System.out.println("setfName");
        String fName = "Franky";
        RealEstateManager instance = new RealEstateManager(1, "John", "Button", 5);
        instance.setfName(fName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getlName method, of class RealEstateManager.
     */
    @Test
    public void testGetlName() {
        System.out.println("getlName");
        RealEstateManager instance = new RealEstateManager(1, "John", "Button", 5);
        String expResult = "Button";
        String result = instance.getlName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setlName method, of class RealEstateManager.
     */
    @Test
    public void testSetlName() {
        System.out.println("setlName");
        String lName = "Johnson";
        RealEstateManager instance = new RealEstateManager(1, "John", "Button", 5);
        instance.setlName(lName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getManagedproperties method, of class RealEstateManager.
     */
    @Test
    public void testGetManagedproperties() {
        System.out.println("getManagedproperties");
        RealEstateManager instance = new RealEstateManager(1, "John", "Button", 5);
        int expResult = 5;
        int result = instance.getManagedproperties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setManagedproperties method, of class RealEstateManager.
     */
    @Test
    public void testSetManagedproperties() {
        System.out.println("setManagedproperties");
        int managedproperties = 2;
        RealEstateManager instance = new RealEstateManager(1, "John", "Button", 5);
        instance.setManagedproperties(managedproperties);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
