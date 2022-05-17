package com.palak.designpatterns.structural.bridge;

public class BridgeDemo {
    public static void main(String[] args) {

        Template art1 = new ButterFlyWallArt();
        Template art2 = new TreeWallArt();

        Color red = new Red();
        Color blue = new Blue();

        art1.setColor(red);
        art1.designWall();

        art2.setColor(blue);
        art2.designWall();
    }
}
