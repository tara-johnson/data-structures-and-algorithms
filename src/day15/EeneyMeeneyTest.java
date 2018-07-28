package day15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class EeneyMeeneyTest {

    public Queue<String> emptyQ;
    public Queue<String> singleQ;
    public Queue<String> evenQ;
    public Queue<String> oddQ;

    @BeforeEach
    void setUp() {
        emptyQ = new LinkedList<>();
        singleQ = new LinkedList<>();
        evenQ = new LinkedList<>();
        oddQ = new LinkedList<>();

        singleQ.add("Alice");

        evenQ.add("Alice");
        evenQ.add("Bobby");
        evenQ.add("Carl");
        evenQ.add("David");
        evenQ.add("Eric");
        evenQ.add("Frank");

        oddQ.add("Alice");
        oddQ.add("Bobby");
        oddQ.add("Carl");
        oddQ.add("David");
        oddQ.add("Eric");
    }

    @Test
    public void eeneyMeeneyEmptyQTest() {
        System.out.println(emptyQ);

        String result = EeneyMeeney.eeneyMeeneyMineyMoe(emptyQ, 3);
        assertEquals(null, result);
    }

    @Test
    public void eeneyMeeneySingleQTest() {
        System.out.println(singleQ);

        String result = EeneyMeeney.eeneyMeeneyMineyMoe(singleQ, 3);
        assertEquals("Alice", result);
    }

    @Test
    public void eeneyMeeneyEvenQTest() {
        System.out.println(evenQ);

        String result = EeneyMeeney.eeneyMeeneyMineyMoe(evenQ, 3);
        assertEquals("Alice", result);
    }

    @Test
    public void eeneyMeeneyOddQTest() {
        System.out.println(evenQ);

        String result = EeneyMeeney.eeneyMeeneyMineyMoe(oddQ, 10);
        assertEquals("David", result);
    }
}