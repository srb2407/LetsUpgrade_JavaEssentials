package com.Saurabh;

public class Main {

    public static void main(String[] args) {
        employee e1 = new employee();
        employee e2 = new employee();

        e1.name = "Saurabh";
        e1.age = 22;
        e1.city = "Agra";

        e2.name = "Anurag";
        e2.age = 21;
        e2.city = "Agra";

        e1.display();
        e2.display();

    }
}
