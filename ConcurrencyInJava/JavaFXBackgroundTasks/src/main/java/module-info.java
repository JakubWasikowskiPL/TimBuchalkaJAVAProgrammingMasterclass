module com.jakubwasikowski.javafxbackgroundtasks {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.jakubwasikowski.javafxbackgroundtasks to javafx.fxml;
    exports com.jakubwasikowski.javafxbackgroundtasks;
}