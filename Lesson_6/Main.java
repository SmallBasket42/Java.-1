package Lesson_6;

public class Main {

    public static void main(String[] args) {
        System.out.println("Кошка: ");
        animal cat = new cat(200,2,2);
        cat.run(400);
        cat.swim(1);
        cat.jump(2);

        System.out.println("Собака: ");
        animal dog = new dog(500, 3, 2) {
        };
        dog.run(450);
        dog.swim(2);
        dog.jump(4);

        System.out.println("Васька: ");
        animal vaska = new cat(600,1,4);
        vaska.run(550);
        vaska.swim(2);
        vaska.jump(3);

        System.out.println("Тузик: ");
        animal tuzik = new dog(800,6,3);
        tuzik.run(750);
        tuzik.swim(7);
        tuzik.jump(3);
    }
    }

