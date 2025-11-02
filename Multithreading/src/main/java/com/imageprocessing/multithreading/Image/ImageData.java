package com.imageprocessing.multithreading.Image;

import java.awt.image.BufferedImage;


public class ImageData {


    public ImageData(BufferedImage image, int i, int j, int height, int width){
        this.image= image;
        this.i=i;
        this.j = j;
        this.height=height;
        this.width=width;
    }

    private BufferedImage image;
    private int i;
    private int j;
    private int k;
    private int height;
    private int width;
    private int totalNum;
    private boolean isCompleteImage;

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setCompleteImage(boolean completeImage) {
        isCompleteImage = completeImage;
    }
}
