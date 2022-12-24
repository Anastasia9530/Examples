package org.petrova.project.pomoika;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.petrova.pomoika.Y18;

import java.util.List;

public class TestY18 {

    @Test
    void test1() {

        int[] array = new int[]{3, 4, 2, 7};
        var result = Y18.findSummands(array, 10);

        Assertions.assertArrayEquals(new int[]{3,7}, result);
    }

    @Test
    void test2() {

        int[] array = new int[]{1, 2, 7};
        var result = Y18.findSummands(array, 0);

        Assertions.assertArrayEquals(new int[]{}, result);
    }
}
