package com.palak.designpatterns.structural.bridge;

public class TreeWallArt extends Template {
    @Override
    public void designWall() {
        System.out.println("Designing the wall with tree wall art.");
        if(color != null){
            color.pickColor();
        }
    }
}
