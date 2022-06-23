/*
 * This file was automatically generated by EvoSuite
 * Thu Jun 23 10:21:38 GMT 2022
 */

package ir.ramtung.impl1;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ir.ramtung.impl1.Magazine;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Magazine_ESTest extends Magazine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Magazine magazine0 = new Magazine("ir.ramtungUimpl1.Maazine", 2754, 2754);
      int int0 = magazine0.penaltyFor(2);
      assertEquals(6000, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Magazine magazine0 = new Magazine("Tn5-p", 569, 569);
      int int0 = magazine0.penaltyFor(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Magazine magazine0 = new Magazine("V4", 1390, 1390);
      int int0 = magazine0.penaltyFor((-930));
      assertEquals((-2790000), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Magazine magazine0 = new Magazine("V4", 1390, 1390);
      magazine0.year = 1390;
      magazine0.year = 1390;
      magazine0.year = 1;
      int int0 = magazine0.penaltyFor(1390);
      assertEquals(2780000, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Magazine magazine0 = null;
      try {
        magazine0 = new Magazine("1~", 1468, 0);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Magazine with zero or negative number
         //
         verifyException("ir.ramtung.impl1.Magazine", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Magazine magazine0 = null;
      try {
        magazine0 = new Magazine("mC xm", 0, 0);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Magazine with zero or negative publication year
         //
         verifyException("ir.ramtung.impl1.Magazine", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Magazine magazine0 = new Magazine("V4", 1390, 1390);
      int int0 = magazine0.loanDuration();
      assertEquals(2, int0);
  }
}
