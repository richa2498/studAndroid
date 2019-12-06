package com.example.table;

import java.io.Serializable;
import java.util.ArrayList;

public class StudentData implements Serializable {
    String name;
    String id;
    String email;

    public StudentData(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
