package org.petrova.philosophyjava1;

import org.petrova.common.Utils;

public class Tree {
    int height;

    Tree() {
        Utils.log("Сажаем росток");
        height = 0;
    }

    Tree(int initialHeight) {
        height = initialHeight;
        Utils.log("Создание нового дереве высотой " + height + " м.");
    }

    void info() {
        Utils.log("Дерево высотой " + height + " м.");
    }

    void info(String s) {
        Utils.log(s + "Дерево высотой " + height + " м.");
    }
}
