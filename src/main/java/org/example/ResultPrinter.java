package org.example;
import java.util.List;

/**
 * Класс ResultPrinter отвечает за вывод результатов тестирования производительности
 * различных операций над коллекциями ArrayList и LinkedList.
 */
public class ResultPrinter {

    /**
     * Печатает результаты тестирования производительности.
     *
     * @param results Список объектов TestResult, содержащих результаты тестирования.
     */
    public static void printResults(List<PerformanceComparator.TestResult> results) {
        System.out.println("Результаты тестирования производительности:");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-20s %-15s %-15s %-10s%n",
                "Операция", "ArrayList", "LinkedList", "Итераций");
        System.out.println("---------------------------------------------------------------");

        for (PerformanceComparator.TestResult result : results) {
            System.out.printf("%-20s %-15d %-15d %-10d%n",
                    result.getOperationName(),
                    result.getArrayListTime(),
                    result.getLinkedListTime(),
                    result.getIterations());
        }

        System.out.println("---------------------------------------------------------------");
    }
}

