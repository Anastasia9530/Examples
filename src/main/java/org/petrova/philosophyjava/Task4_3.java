package org.petrova.philosophyjava;

import org.petrova.common.Utils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Task4_3 {
    public static void main(String[] args) {

        Map<String, String> fruit = new HashMap<>();
        fruit.put("1", "Apple");
        fruit.put("2", "Banana");
        fruit.put("3", "Orange");
        fruit.put("4", "Lime");
        fruit.put("5", "Grapefruit");

        String result = fruit.keySet().stream().sorted((a, b) -> ThreadLocalRandom.current().nextInt())
                .limit(1).collect(Collectors.joining("\n"));

        Utils.log(result);
        Utils.log("isEmpty:" + fruit.isEmpty());
        Utils.log("size:" + fruit.size());
    }
}
