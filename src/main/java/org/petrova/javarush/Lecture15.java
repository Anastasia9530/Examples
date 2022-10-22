package org.petrova.javarush;

public class Lecture15 {
    public static void main(String[] args) {
        Lecture15 qwe = new Lecture15();

        Integer p = qwe.minus(10,1,-2);
        System.out.println(p);

    }

    private  Integer minus(int a, int b, int c){
        int o = a-b-c;
        return o;
    }
}