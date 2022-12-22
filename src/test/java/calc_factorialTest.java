import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class calc_factorialTest {

    @Test
    @DisplayName("calc 1")
    void calc() {
        calc_factorial testSubject = new calc_factorial(1);
        ArrayList<Integer> answer = new ArrayList<>(1);
        answer.add(1);
        assertEquals(answer, testSubject.calc());
    }
    @Test
    @DisplayName("calc 3")
    void multiply() {
        calc_factorial testSubject = new calc_factorial(3);
        ArrayList<Integer> answer = new ArrayList<>(3);
        answer.add(1);
        answer.add(2);
        answer.add(6);
        assertEquals(answer, testSubject.calc());
    }
}