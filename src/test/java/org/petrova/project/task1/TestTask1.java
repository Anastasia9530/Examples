package org.petrova.project.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.petrova.project.task1.Task1.INPUT_FILE_NAME;

public class TestTask1 {

    @Test
    void testInputFile() {

        File file = new File(INPUT_FILE_NAME);

        if (file.exists()) {
            AbstractCalculation a = new CalculationVariant2();
            Assertions.assertDoesNotThrow(() -> a.process());
        }

    }
}
