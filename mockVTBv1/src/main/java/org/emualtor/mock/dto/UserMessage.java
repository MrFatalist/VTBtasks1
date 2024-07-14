package org.emualtor.mock.dto;

import lombok.Data;


@Data
public class UserMessage {
    private String name;
    private int age;
    private Mother mother;
    private String [] children;
    private boolean married;
    private String dog;


    public void setAge(int age) {
        this.age = 96;
    }
}
