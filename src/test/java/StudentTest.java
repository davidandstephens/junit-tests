import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    private Student stud;

    @Before
    public void setUp(){
        this.stud = new Student (1, "Stud Body");
    }

    @Test
    public void testStudentConstructor() {
        assertEquals(1, stud.getId());
        assertEquals("Stud Body", stud.getName());
        assertTrue(stud.getGrades().isEmpty());
    }

    @Test
    public void testGetId() {
        assertEquals(1, stud.getId());
        Student craig = new Student(27, "Craig Gregson");
        assertEquals(27, craig.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("Stud Body", stud.getName());
        Student jenn = new Student(33, "Jenn Ann Hologram");
        assertEquals("Jenn Ann Hologram", jenn.getName());
    }

    @Test
    public void testAddGrade() {
        stud.addGrade(78);
        stud.addGrade(84);
        stud.addGrade(99);
        assertEquals(3, stud.getGrades().size());
        stud.addGrade(88);
        assertEquals(4, stud.getGrades().size());
        Student jenn = new Student(33, "Jenn Ann Hologram");
        jenn.addGrade(100);
        assertEquals(1, jenn.getGrades().size());
    }

    @Test
    public void getGrades() {
        assertEquals(0, stud.getGrades().size());
        stud.addGrade(34);
        assertEquals(1, stud.getGrades().size());
    }

    @Test
    public void testGetGradeAverage() {
        stud.addGrade(75);
        stud.addGrade(25);
        stud.addGrade(50);
        assertEquals(50, stud.getGradeAverage(), 0);
        stud.addGrade(10);
        assertEquals(40, stud.getGradeAverage(), 0);
        stud.addGrade(100);
        stud.addGrade(100);
        assertEquals(60, stud.getGradeAverage(), 0);
    }
}
