/*
 * This file was automatically generated by EvoSuite
 * Thu Jun 23 10:24:17 GMT 2022
 */

package ir.ramtung.impl2;

import org.junit.Test;
import static org.junit.Assert.*;
import ir.ramtung.impl2.Book;
import ir.ramtung.impl2.Magazine;
import ir.ramtung.impl2.Reference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Document_ESTest extends Document_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Magazine magazine0 = new Magazine((String) null, 63, 63, 63);
      magazine0.getTitle();
      assertEquals(63, magazine0.getCopies());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Reference reference0 = new Reference("", (-988));
      String string0 = reference0.getTitle();
      assertEquals((-988), reference0.getCopies());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Reference reference0 = new Reference("+(zE=D$", (-185));
      reference0.day = 0;
      int int0 = reference0.getDay();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Reference reference0 = new Reference("", 0);
      reference0.day = (-2617);
      int int0 = reference0.getDay();
      assertEquals((-2617), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Reference reference0 = new Reference("X( m?!g_N;z.Z", 0);
      int int0 = reference0.getCopies();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Magazine magazine0 = new Magazine("", 7000, 5000, (-466));
      int int0 = magazine0.getCopies();
      assertEquals((-466), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Reference reference0 = new Reference("={", 0);
      reference0.calculatePenalty(0);
      assertEquals(0, reference0.getCopies());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Book book0 = new Book("11*hy", 11);
      int int0 = book0.getCopies();
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Book book0 = new Book("11*hy", 11);
      book0.returnBook();
      assertEquals(12, book0.getCopies());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Book book0 = new Book("11*hy", 11);
      String string0 = book0.getTitle();
      assertEquals(11, book0.getCopies());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Book book0 = new Book("11*hy", 11);
      int int0 = book0.getDay();
      assertEquals(11, book0.getCopies());
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Book book0 = new Book("11*hy", 11);
      book0.barrowBook();
      assertEquals(10, book0.getCopies());
  }
}
