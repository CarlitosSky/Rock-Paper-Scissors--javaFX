module com.carlitos.rock_paper_and_scissors {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.carlitos.rock_paper_and_scissors to javafx.fxml;
    exports com.carlitos.rock_paper_and_scissors;
    exports com.carlitos.rock_paper_and_scissors.controladores;
    opens com.carlitos.rock_paper_and_scissors.controladores to javafx.fxml;
}