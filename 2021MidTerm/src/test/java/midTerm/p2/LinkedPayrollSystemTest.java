package midTerm.p2;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class LinkedPayrollSystemTest {
    private LinkedPayrollSystem system;
    private Name name1;
    private Name name2;
    private ContactInfo c1;
    private ContactInfo c2;
    private Employee person;
    private Employee person2;
    private LocalDate DOB1;
    private LocalDate DOB2;


    @Before
    public void setUp() throws Exception {
        system = new LinkedPayrollSystem();
        name1 = new Name("Yiyu","GIGI","Zhang");
        name1 = new Name("Briana","KIKI","Zhang");
        c1 = new ContactInfo("2021 Milvia","Berkeley","CA","94704","4012345679","yiyu@gmail.com");
        c1 = new ContactInfo("2010 Milvia","Berkeley","CA","94704","4012345688","bribri@gmail.com");
        DOB1 = LocalDate.of(1996,6,4);
        DOB2 = LocalDate.of(1998,8,28);


        person = new Employee(name1,c1,DOB1,"KY212",2020,"engineer",2020,80000.0);
        person2 = new Employee(name2,c2,DOB2,"KY213",2020,"engineer",2020,40000.0);
    }

    @Test
    public void isEmpty() {
        assertTrue(system.isEmpty());
        PayrollSystem system2 = system.add(person);
        assertFalse(system2.isEmpty());

    }

    @Test
    public void countEmployee() {
        PayrollSystem system2 = system.add(person);
        assertSame(system2.countEmployee(),1);
        PayrollSystem system3 = system2.add(person2);
        assertSame(system2.countEmployee(),2);
    }

    @Test
    public void getAnnualEarningLess() {
        PayrollSystem system2 = system.add(person);
        PayrollSystem system3 = system2.add(person2);

        PayrollSystem result = system3.getAnnualEarningLess();
        assertTrue(result.check(person2));
        assertFalse(result.check(person));
        assertSame(result.countEmployee(),1);
    }

    @Test
    public void getEmployee() throws InvalidEmployeeNumberException{
        PayrollSystem system2 = system.add(person);
        PayrollSystem system3 = system2.add(person2);
        Employee exp = system3.getEmployee("KY212");
        assertEquals(exp,person);
    }

    @Test(expected = InvalidEmployeeNumberException.class)
    public void testException() throws InvalidEmployeeNumberException{
        PayrollSystem system2 = system.add(person);
        PayrollSystem system3 = system2.add(person2);
        system3.getEmployee("KY202");
    }
}