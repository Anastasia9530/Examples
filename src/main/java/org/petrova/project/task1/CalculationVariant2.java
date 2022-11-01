package org.petrova.project.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class CalculationVariant2 extends AbstractCalculation {
    public CalculationVariant2() {
    }

    @Override
    List<Integer> getData() {
        String fileName = "C:\\tmp\\in.txt";

        try {
            return Files.readAllLines(Paths.get(fileName)).stream()
                    .map(k -> Integer.parseInt(k))
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return List.of();
    }
}
