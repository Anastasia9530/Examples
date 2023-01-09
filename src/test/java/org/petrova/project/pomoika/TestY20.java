package org.petrova.project.pomoika;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.petrova.pomoika.Y20;

public class TestY20 {

    @Test
    void test1() {

        int[] array = new int[]{1, 2, 2, 7};
        var result = Y20.sumNumbers(array, 4);

        Assertions.assertEquals(1, result);
    }

    @Test
    void test2() {

        int[] array = new int[]{4, 1, 2, 7, 8, 9};
        var result = Y20.sumNumbers(array, 4);

        Assertions.assertEquals(0, result);
    }

    @Test
    void test3() {

        int[] array = new int[]{};
        var result = Y20.sumNumbers(array, 0);

        Assertions.assertEquals(0, result);
    }

    @Test
    void test4() {

        int[] array = new int[]{1, 1, 1, 1};
        var result = Y20.sumNumbers(array, 2);

        Assertions.assertEquals(1, result);
    }

    @Test
    void test5() {

        int[] array = new int[]{1, 2, 0, 8, 4, 4, 7, 1, 7, 4};
        var result = Y20.sumNumbers(array, 8);

        Assertions.assertEquals(3, result);
    }

    @Test
    void test6() {

        int[] array = new int[]{-1,0,10,-10};
        var result = Y20.sumNumbers(array, 8);

        Assertions.assertEquals(0, result);
    }
    @Test
    void test7() {

        int[] array = new int[]{-2,-1,11};
        var result = Y20.sumNumbers(array, 10);

        Assertions.assertEquals(1, result);
    }
}
