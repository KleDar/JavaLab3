package org.example;
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
}
