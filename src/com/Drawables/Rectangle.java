package com.Drawables;

public class Rectangle implements Drawable{
    private int width;
    private int height;

    @Override
    public void draw(){
        System.out.println("Draw here...");
    }

    @Override
    public void resize(int width, int height) {
        System.out.println("This is the width " + width + " This is the height " + height);
    }
}
