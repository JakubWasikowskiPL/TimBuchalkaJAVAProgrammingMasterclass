module com.jakubwasikowski.databinding {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jakubwasikowski.databinding to javafx.fxml;
    exports com.jakubwasikowski.databinding;
}