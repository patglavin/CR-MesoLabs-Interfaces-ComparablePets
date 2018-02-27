package io.zipcoder.Pets;

import java.util.Arrays;
import java.util.Comparator;

public abstract class Pet{

    public String name;
    public Integer age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Pet(){
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String speak();

    public int compare(Pet p1, Pet p2){
        return p1.getClass().getSimpleName().compareTo(p2.getClass().getSimpleName());
    }

}
