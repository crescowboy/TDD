package ec.edu.epn.tdd.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c = null;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp(){
        c = new Calculator();
        System.out.println("setUp()");
    }

    @Test
    public void given_two_integers_when_audition_then_ok(){
        Calculator c = new Calculator();
        assertEquals(6, c.addition(4,2));
        System.out.println("test1");
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok(){
        Calculator c = new Calculator();
        assertEquals(2, c.subtraction(4,2));
        System.out.println("test2");
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_ok(){
        Calculator c = new Calculator();
        assertEquals(3, c.division(6,0));
        System.out.println("test3");
    }

    @Test(timeout = 150)
    public void given_two_integers_when_multiplication_then_ok(){
        Calculator c = new Calculator();
        assertEquals(8, c.multiplication(4,2));
        System.out.println("test4");
    }

    @After
    public void tearDown(){
        System.out.println("testDown()");
        c.setAns(0);
        c = null;
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("testDownClass()");
    }

}