/*
 * This file was automatically generated by EvoSuite
 * Thu Jun 23 10:22:37 GMT 2022
 */

package ir.ramtung.impl2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ir.ramtung.impl2.Document;
import ir.ramtung.impl2.Reference;
import ir.ramtung.impl2.Student;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Student_ESTest extends Student_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Student student0 = new Student("", "o62F");
      LinkedList<Document> linkedList0 = new LinkedList<Document>();
      student0.docsBorrow = (List<Document>) linkedList0;
      assertTrue(student0.canBorrow());
      
      Reference reference0 = new Reference("aM}/ unP", (-1845));
      linkedList0.add((Document) reference0);
      student0.borrow(reference0);
      linkedList0.add((Document) reference0);
      boolean boolean0 = student0.canBorrow();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Student student0 = new Student("2*rh8VoZU'x}7JT)", "2*rh8VoZU'x}7JT)");
      student0.docsBorrow = null;
      // Undeclared exception!
      try { 
        student0.canBorrow();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ir.ramtung.impl2.Student", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Student student0 = new Student("", "o62F");
      boolean boolean0 = student0.canBorrow();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Student student0 = new Student("", "o62F");
      LinkedList<Document> linkedList0 = new LinkedList<Document>();
      student0.docsBorrow = (List<Document>) linkedList0;
      assertTrue(student0.canBorrow());
      
      Reference reference0 = new Reference("aM}/ unP", (-1845));
      linkedList0.add((Document) reference0);
      student0.borrow(reference0);
      boolean boolean0 = student0.canBorrow();
      assertFalse(boolean0);
  }
}
