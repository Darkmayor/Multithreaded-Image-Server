package com.imageprocessing.multithreading.Filter;

import java.awt.image.BufferedImage;

public interface ImageFilter {

    BufferedImage filter(BufferedImage originalImage);
}
