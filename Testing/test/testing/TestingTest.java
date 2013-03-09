/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aiharo
 */
public class TestingTest {
    
    public TestingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class Testing.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Testing.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
