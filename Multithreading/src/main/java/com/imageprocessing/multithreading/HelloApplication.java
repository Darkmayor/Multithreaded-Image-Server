package com.imageprocessing.multithreading;

import com.imageprocessing.multithreading.Filter.GrayScaleFilter;
import com.imageprocessing.multithreading.Filter.ImageFilter;
import com.imageprocessing.multithreading.Image.DrawMultipleImagesOnCanvas;
import com.imageprocessing.multithreading.Processor.ImageProcessor;
import com.imageprocessing.multithreading.io.IOImageRead;
import com.imageprocessing.multithreading.io.IOImageReader;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        DrawMultipleImagesOnCanvas drawMultipleImagesOnCanvas = DrawMultipleImagesOnCanvas.getInstance();
        drawMultipleImagesOnCanvas.initialize(stage);

        IOImageReader imageIO = new IOImageRead();
        BufferedImage image = imageIO.readImage("D:\\Project\\imageProcessingJava-add-workingParallelRendering\\src\\main\\java\\com\\image\\imageprocessing\\io\\test.jpg");
        ImageProcessor processor = new ImageProcessor();
        ImageFilter imageFilter = new GrayScaleFilter();
        processor.processImage(image, 10, imageFilter, drawMultipleImagesOnCanvas);

        Platform.setImplicitExit(false);

    }

    public static void main(String[] args) {
        launch();
    }
}