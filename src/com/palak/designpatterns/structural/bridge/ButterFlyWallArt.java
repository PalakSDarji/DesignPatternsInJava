package com.palak.designpatterns.structural.bridge;

public class ButterFlyWallArt extends Template {
    @Override
    public void designWall() {
        System.out.println("Designing the wall with butterfly wall art.");
        if(color != null){
            color.pickColor();
        }
    }
}
