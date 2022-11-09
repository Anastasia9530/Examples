package org.petrova.philosophyjava;

import org.petrova.common.Utils;

public class Dog {
    String name ;
    String says ;

    public static void main(String[]args){

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "Spot";
        dog1.says = "Gav";
        dog2.name = "Scruffy";
        dog2.says= "Rrr";

        Utils.log("name: "+ dog1.name+","+"says:" + dog1.says);
        Utils.log("name: "+ dog2.name+","+"says:" + dog2.says);

        Dog spot = new Dog();

        Utils.log(String.valueOf(spot == dog1));
        Utils.log(String.valueOf(spot != dog1));
        Utils.log(String.valueOf(spot.equals(dog1)));
    }
}
