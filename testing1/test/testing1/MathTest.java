/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aiharo
 */
public class MathTest {
    
    public MathTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of add method, of class Math.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 5;
        int b = 2;
        int expResult = 7;
        int result = Math.add(a, b);
        assertEquals(expResult, result);
     }

    /**
     * Test of subtraction method, of class Math.
     */
    @Test
    public void testSubtraction() {
        System.out.println("subtraction");
        int a = 7;
        int b = 5;
        int expResult = 2;
        int result = Math.subtraction(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      }

    /**
     * Test of multiplication method, of class Math.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        int a = 10;
        int b = 10;
        int expResult = 100;
        int result = Math.multiplication(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     }

    /**
     * Test of division method, of class Math.
     */
    @Test(expected = ArithmeticException.class)
    public void testDivision() {
        System.out.println("division");
        int a = 1000;
        int b = 0;
        int expResult = 100;
        int result = Math.division(a, b);
        assertEquals(expResult, result);
        System.out.println("Division by zero\n");
     }
    
    @Test
    public void testMeBaby() {
        Math sut = new Math();
        assertTrue(sut.myMethod(1, true));
        assertTrue(sut.myMethod(2, true));
        assertTrue(sut.myMethod(1, false));
        assertTrue(sut.myMethod(2, false));
        assertFalse(sut.myMethod(0, false));
    }
}
