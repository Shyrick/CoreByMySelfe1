package Lesson5_2.entities;

public class B extends A {

    public String name;

    // класс В наследует все поля и методы, которые есть в классе А (см. Main)
    // Но конструктор не наследуется
    // но к нему (к конструктору родителя) можно получить доступ через ключ. слово super

    public B(String text, int value) { // Конструктор с полями класса родителя
        super(text, value);
    }

    public B(String text, int value, String name) { // Конструктор с полями родителя и со своим полем
        super(text, value);
        this.name = name;
    }
}
26:00