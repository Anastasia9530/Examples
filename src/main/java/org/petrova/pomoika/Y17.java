package org.petrova.pomoika;

import org.petrova.common.Utils;

public class Y17 {
    public static void main(String[] args) {

//        Даны перемнные A,B,C. Изменить их значения, переместив A->B, B->C, C->A. Вывести новые значения.

        int A = 1;
        int B = 2;
        int C = 3;

        int X1 = B;
        B = A;
        A = C;
        C = X1;

        Utils.log("A:" + A);
        Utils.log("B:" + B);
        Utils.log("C:" + C);

    }
}

