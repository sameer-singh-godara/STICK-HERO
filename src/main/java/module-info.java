module com.example.saadstickhero {
    requires javafx.controls;
    requires javafx.fxml;

                        requires org.kordamp.bootstrapfx.core;
    requires javafx.media;

    opens com.example.StickHero to javafx.fxml;
    exports com.example.StickHero;
}