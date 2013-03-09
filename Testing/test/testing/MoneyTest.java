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
public class MoneyTest {
    
    public MoneyTest() {
     Money m1;
     Money m2;
     Money expected;
     Money result;
    }
    
    @BeforeClass
    public static void setUpClass() {
        
     Money m1 = new Money(12, "USD");
     Money m2 = new Money(14, "USD");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of add method, of class Money.
     */
    @Test
     public void testAdd() {
          Money m1 = new Money(12, "USD");
          Money m2 = new Money(14, "USD");
          Money expected = new Money(26, "USD");
          Money result = m1.add(m2);
          if(!result.equals(expected))
               fail("Not equals");
     }
     }

  

