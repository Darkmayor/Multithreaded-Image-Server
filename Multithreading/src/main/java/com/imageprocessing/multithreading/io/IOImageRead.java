package com.imageprocessing.multithreading.io;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class IOImageRead implements IOImageReader {

    @Override
    public <T> BufferedImage readImage(T src){
        // get the path
        try{
            String Path = (String) src;
            File ImageFile = new File(Path);
            return ImageIO.read(ImageFile);
        }catch (Exception e){
            System.out.println("Not able to read the image");
            return null;
        }
    }

    @Override
    public void sendImage(BufferedImage image) {
        // implement functionality to store the image
       try{
           
          File outputImage = new File("outputFIle.png");
          ImageIO.write(image , "png" , outputImage);
       }catch(Exception ex){
           ex.printStackTrace();
       }
    }
}
