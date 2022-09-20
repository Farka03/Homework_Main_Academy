package home_work_5.dto;

public class Animal {
    //Поля
    private final int age;
    private final StringBuilder nick;

    //Конструктор
    public Animal(int age, StringBuilder nick) {
        this.age = age;
        this.nick = nick;
    }

    //Геттеры
    public int getAge() {
        return this.age;
    }

    public StringBuilder getNick() {
        return this.nick;
    }

    //Переопределяем toString
    @Override
    public String toString() {
        return "Animal{" +
                "age=" + getAge() +
                ", nick=" + getNick() +
                '}';
    }
}
