package com.study.Spring5.bean;

public class Pet {
    private String name;
    private String age;
    private Person owner;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", owner=" + owner +
                '}';
    }
}
