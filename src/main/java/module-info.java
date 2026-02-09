module com.senai.sistemajavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.senai.sistemajavafx to javafx.fxml;
    opens fxml to javafx.fxml;
    exports com.senai.sistemajavafx;
    exports Controller;
    opens Controller to javafx.fxml;
}