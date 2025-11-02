package com.imageprocessing.multithreading.io;

import java.awt.image.BufferedImage;
import java.io.IOException;

public interface IOImageReader {

    <T> BufferedImage readImage(T src);

    void sendImage(BufferedImage image);
}
