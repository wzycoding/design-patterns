package com.wzy.structural.proxy;

/**
 * description: RealImage <br>
 * date: 2020-06-10 14:39 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
