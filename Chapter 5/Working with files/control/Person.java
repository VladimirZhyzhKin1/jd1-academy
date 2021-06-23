package control;

import java.io.Serializable;

public class Person implements Serializable {
    public String name;
    public String surName;
    public int age;

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return getName() +" "+ getSurName()+" " + getAge();
    }
}
