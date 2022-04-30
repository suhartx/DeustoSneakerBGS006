module org.BGS006 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javax.jdo;

    opens org.BGS006 to javafx.fxml;
    exports org.BGS006;
}
