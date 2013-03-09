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
public class StringUtilsTest {
    
    public StringUtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        byte[] data = { 1, 2, 13, 17, 45, 127 };
        String expResult = "01020d112d7f";
    }
    
    @AfterClass
    public static void tearDownClass() {
      
    }

    /**
     * Test of isEmpty method, of class StringUtils.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        CharSequence sequence = null;
        boolean expResult = false;
        boolean result = StringUtils.isEmpty(sequence);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toHexString method, of class StringUtils.
     */
    @Test
    public void testToHexString() {
        
        System.out.println("toHexString");
        byte[] data = { 1, 2, 13, 17, 45, 127 };
        String expResult = "01020d112d7f";
        String result = StringUtils.toHexString(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
