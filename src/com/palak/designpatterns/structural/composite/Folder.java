package com.palak.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Data{

    private String name;
    private List<Data> folder = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doubleClick() {
        System.out.println(getName() + " folder is opened.");
        for (Data data : folder){
            data.doubleClick();
        }
    }

    public void add(Data data){
        folder.add(data);
    }

    public void remove(Data data){
        folder.remove(data);
    }

}
