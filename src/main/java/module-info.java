module com.senai.sistemajavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.senai.sistemajavafx to javafx.fxml;
    opens fxml to javafx.fxml;
    exports com.senai.sistemajavafx;
    exports com.senai.sistemajavafx.Controller;
    opens com.senai.sistemajavafx.Controller to javafx.fxml;
}