module be.ephec.java.calculatricecours {
    requires javafx.controls;
    requires javafx.fxml;


    opens be.ephec.java.calculatricecours to javafx.fxml;
    exports be.ephec.java.calculatricecours;
}