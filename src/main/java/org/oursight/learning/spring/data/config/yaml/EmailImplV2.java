package org.oursight.learning.spring.data.config.yaml;

/**
 * Created by neyao@github.com on 2016/5/3.
 */
public class EmailImplV2 {

    private String name;

    @Override
    public String toString() {
        return "EmailImplV2{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
