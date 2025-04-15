package org.example;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

/**
 * Утилитный класс для сравнения производительности реализаций ArrayList и LinkedList
 * интерфейса List при выполнении различных операций.
 */
public class PerformanceComparator {
    /**
     * Класс-контейнер для хранения результатов тестирования производительности ArrayList и LinkedList.
     */
    public static class TestResult {
        private final String operationName;
        private final long arrayListTime;
        private final long linkedListTime;
        private final int iterations;

        /**
         * Создает объект TestResult с данными о производительности.
         *
         * @param operationName название тестируемой операции
         * @param arrayListTime время выполнения для ArrayList в миллисекундах
         * @param linkedListTime время выполнения для LinkedList в миллисекундах
         * @param iterations количество итераций выполненного теста
         */
        public TestResult(String operationName, long arrayListTime, long linkedListTime, int iterations) {
            this.operationName = operationName;
            this.arrayListTime = arrayListTime;
            this.linkedListTime = linkedListTime;
            this.iterations = iterations;
        }

        /**
         * @return название тестируемой операции
         */
        public String getOperationName() {
            return operationName;
        }

        /**
         * @return время выполнения для ArrayList в миллисекундах
         */
        public long getArrayListTime() {
            return arrayListTime;
        }

        /**
         * @return время выполнения для LinkedList в миллисекундах
         */
        public long getLinkedListTime() {
            return linkedListTime;
        }

        /**
         * @return количество итераций выполненного теста
         */
        public int getIterations() {
            return iterations;
        }
    }
    /**
     * Тестирует производительность добавления элементов в конец списка.
     *
     * @param iterations количество элементов для добавления в ходе теста
     * @return TestResult с информацией о времени выполнения для обеих реализаций списка
     */
    public static TestResult testAddAtEnd(int iterations) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            arrayList.add(i);
        }
        long arrayListTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            linkedList.add(i);
        }
        long linkedListTime = System.nanoTime() - start;

        return new TestResult("Добавление в конец",
                arrayListTime,
                linkedListTime,
                iterations);
    }

    /**
     * Тестирует производительность добавления элементов в начало списка.
     *
     * @param iterations количество элементов для добавления в ходе теста
     * @return TestResult с информацией о времени выполнения для обеих реализаций списка
     */
    public static TestResult testAddAtBeginning(int iterations) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            arrayList.add(0, i);
        }
        long arrayListTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            linkedList.add(0, i);
        }
        long linkedListTime = System.nanoTime() - start;

        return new TestResult("Добавление в начало",
                arrayListTime ,
                linkedListTime,
                iterations);
    }

    /**
     * Тестирует производительность получения элементов из списка по индексу.
     *
     * @param iterations количество операций получения элемента
     * @return TestResult с информацией о времени выполнения для обеих реализаций списка
     */
    public static TestResult testGet(int iterations) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Заполняем списки
        for (int i = 0; i < iterations; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            arrayList.get(i % iterations);
        }
        long arrayListTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            linkedList.get(i % iterations);
        }
        long linkedListTime = System.nanoTime() - start;

        return new TestResult("Получение элемента",
                arrayListTime ,
                linkedListTime,
                iterations);
    }


}
