package com.palak.designpatterns.structural.composite;

public class CompositeDemo {
    public static void main(String[] args) {

        File file1 = new File();
        file1.setName("file1");
        file1.doubleClick();

        File file2 = new File();
        file2.setName("file2");
        file2.doubleClick();

        Folder folder = new Folder();
        folder.setName("Folder1");
        folder.add(file1);
        folder.add(file2);
        folder.doubleClick();

    }
}
