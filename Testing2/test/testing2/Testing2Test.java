/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aiharo
 */
public class Testing2Test {
    
    public Testing2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class Testing2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Testing2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
