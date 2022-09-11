package org.petrova.pomoika;

public class Y3 {

    class Cat  // как сделать, чтобы код заработал?
    {
        public String name; // имя кота
        public int age = -1; // возраст кота, присваиваем стартовое значение

        public Cat(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Cat()
        {
            this.name = "Безымянный";
        }
        Cat cat = new Cat("Васька", 2);//вызовется первый конструктор
//        Cat cat = new Cat();// вызовется второй констурктор
    }
}
