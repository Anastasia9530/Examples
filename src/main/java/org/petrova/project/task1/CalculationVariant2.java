package org.petrova.project.task1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.petrova.project.task1.Task1.INPUT_FILE_NAME;
import static org.petrova.project.task1.Task1.OUTPUT_FILE_NAME;

public class CalculationVariant2 extends AbstractCalculation {
    public CalculationVariant2() {
    }

    @Override
    List<Integer> getData() {

        String fileName = INPUT_FILE_NAME;

        try {
            return Files.readAllLines(Paths.get(fileName)).stream()
                    .map(k -> Integer.parseInt(k))
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return List.of();
    }


    public void printAnalytics(AnalyticsData analyticsData) throws IOException {

        var lines = Arrays.asList(analyticsData.toString());
        Files.deleteIfExists(Paths.get(OUTPUT_FILE_NAME));
        Files.write(Paths.get(OUTPUT_FILE_NAME), lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW);
    }
}

