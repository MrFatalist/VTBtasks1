package org.emualtor.mock.dto;

import lombok.Data;

@Data
public class Mother {
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = 96;
    }
}
