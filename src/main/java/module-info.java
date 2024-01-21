module com.shelfmaster.shelfmaster {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.sql;
    requires de.jensd.fx.glyphs.fontawesome;
    requires org.xerial.sqlitejdbc;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
//    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.shelfmaster.shelfmaster to javafx.fxml;
    exports com.shelfmaster.shelfmaster;
    exports com.shelfmaster.shelfmaster.Controllers;
    exports com.shelfmaster.shelfmaster.Models;
    exports com.shelfmaster.shelfmaster.Views;
}