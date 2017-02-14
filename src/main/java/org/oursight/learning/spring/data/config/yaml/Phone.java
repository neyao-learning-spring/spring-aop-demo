package org.oursight.learning.spring.data.config.yaml;

/**
 * Created by neyao@github.com on 2016/5/3.
 */
public class Phone {

    private String name;

    private int number;

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
