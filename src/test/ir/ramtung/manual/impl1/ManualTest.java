package ir.ramtung.manual.impl1;

import ir.ramtung.impl1.Library;
import ir.ramtung.sts01.LibraryException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManualTest {

    @Test
    public void borrowBookByStudent(){
        Library lib = new Library();

        try {
            lib.addStudentMember("810199999", "Negar");
            lib.addBook("Lean Startup", 1);
            lib.borrow("Negar", "Lean Startup");
            lib.timePass(5);
            lib.extend("Negar", "Lean Startup");
            lib.timePass(50);
            lib.returnDocument("Negar", "Lean Startup");
            assertEquals(126000,lib.getTotalPenalty("Ramtin"));
        } catch (LibraryException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }


    @Test
    public void borrowMagazineByStudent(){
        ir.ramtung.impl2.Library lib = new ir.ramtung.impl2.Library();
        try {
            lib.addStudentMember("810199999", "Negar");
            lib.addMagazine("Lean startup",1900,1,1);
            lib.borrow("Negar", "Lean Startup");

            lib.timePass(50);
            lib.returnDocument("Negar", "Lean Startup");
            assertEquals(144000,lib.getTotalPenalty("Negar"));
        } catch (LibraryException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }


    @Test
    public void borrowReferenceByStudent(){
        ir.ramtung.impl2.Library lib = new ir.ramtung.impl2.Library();
        try {
            lib.addStudentMember("810199999", "Negar");
            lib.addReference("Lean Startup", 1);
            lib.borrow("Negar", "Lean Startup");
            lib.timePass(5);
            lib.extend("Negar", "Lean Startup");
            lib.timePass(50);
            lib.returnDocument("Negar", "Lean Startup");
            assertEquals(309000,lib.getTotalPenalty("Negar"));
        } catch (LibraryException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Test
    public void borrowBookByProf(){
        ir.ramtung.impl2.Library lib = new ir.ramtung.impl2.Library();

        try {
            lib.addProfMember("Ramtin");
            lib.addBook("Lean Startup", 1);
            lib.borrow("Ramtin", "Lean Startup");
            lib.timePass(5);
            lib.extend("Ramtin", "Lean Startup");
            lib.timePass(50);
            lib.returnDocument("Ramtin", "Lean Startup");
            assertEquals(126000,lib.getTotalPenalty("Negar"));
        } catch (LibraryException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
