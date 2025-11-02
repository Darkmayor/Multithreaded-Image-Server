module com.imageprocessing.multithreading {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;
    requires javafx.swing;

    opens com.imageprocessing.multithreading to javafx.fxml;
    exports com.imageprocessing.multithreading;
    exports com.imageprocessing.multithreading.Image;
    opens com.imageprocessing.multithreading.Image to javafx.fxml;
}