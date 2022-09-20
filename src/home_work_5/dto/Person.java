package home_work_5.dto;

public class Person {
    //Поля
    private final StringBuilder nick;
    private final StringBuilder password;
    private final StringBuilder name;

    //Конструктор
    public Person(StringBuilder nick, StringBuilder password, StringBuilder name) {
        this.password = password;
        this.nick = nick;
        this.name = name;
    }

    //Геттеры
    public StringBuilder getPassword() {
        return password;
    }

    public StringBuilder getName() {
        return this.name;
    }

    public StringBuilder getNick() {
        return this.nick;
    }

    //Переопределяем toString
    @Override
    public String toString() {
        return "Person{" + "nick=" + getNick() + ", password=" + getPassword() + ", name=" + getName() + '}';
    }
}
