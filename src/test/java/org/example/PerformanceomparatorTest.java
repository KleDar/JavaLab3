package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PerformanceomparatorTest {
    /**
     * Тестирует производительность добавления элемента в конец списка.
     */
    @Test
    void testAddAtEnd() {
        int iterations = 1000;
        PerformanceComparator.TestResult result =
                PerformanceComparator.testAddAtEnd(iterations);

        assertEquals("Добавление в конец", result.getOperationName());
        assertEquals(iterations, result.getIterations());
        assertTrue(result.getArrayListTime() >= 0);
        assertTrue(result.getLinkedListTime() >= 0);
    }

    /**
     * Тестирует производительность добавления элемента в начало списка.
     */
    @Test
    void testAddAtBeginning() {
        int iterations = 1000;
        PerformanceComparator.TestResult result =
                PerformanceComparator.testAddAtBeginning(iterations);

        assertEquals("Добавление в начало", result.getOperationName());
        assertEquals(iterations, result.getIterations());
        assertTrue(result.getArrayListTime() >= 0);
        assertTrue(result.getLinkedListTime() >= 0);
    }

    /**
     * Тестирует производительность получения элемента из списка.
     */
    @Test
    void testGet() {
        int iterations = 1000;
        PerformanceComparator.TestResult result =
                PerformanceComparator.testGet(iterations);

        assertEquals("Получение элемента", result.getOperationName());
        assertEquals(iterations, result.getIterations());
        assertTrue(result.getArrayListTime() >= 0);
        assertTrue(result.getLinkedListTime() >= 0);
    }

    /**
     * Тестирует производительность удаления элемента с конца списка.
     */
    @Test
    void testRemoveFromEnd() {
        int iterations = 1000;
        PerformanceComparator.TestResult result =
                PerformanceComparator.testRemoveFromEnd(iterations);

        assertEquals("Удаление с конца", result.getOperationName());
        assertEquals(iterations, result.getIterations());
        assertTrue(result.getArrayListTime() >= 0);
        assertTrue(result.getLinkedListTime() >= 0);
    }

    /**
     * Тестирует производительность удаления элемента с начала списка.
     */
    @Test
    void testRemoveFromBeginning() {
        int iterations = 1000;
        PerformanceComparator.TestResult result =
                PerformanceComparator.testRemoveFromBeginning(iterations);

        assertEquals("Удаление с начала", result.getOperationName());
        assertEquals(iterations, result.getIterations());
        assertTrue(result.getArrayListTime() >= 0);
        assertTrue(result.getLinkedListTime() >= 0);
    }
}
