package org.example;
import java.util.ArrayList;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int iterations = 10000;
        List<PerformanceComparator.TestResult> results = new ArrayList<>();

        // Выполняем тесты
        results.add(PerformanceComparator.testAddAtEnd(iterations));
        results.add(PerformanceComparator.testGet(iterations));
        // Выводим результаты
        ResultPrinter.printResults(results);

    }
}