package lk.ijse.SemesterOne.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class EmployeeFormController {

    public Pane tablePane;

    public void EmployeeAddOnClick(MouseEvent mouseEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/AddEmployeeForm.fxml"));
        tablePane.getChildren().clear();
        tablePane.getChildren().add(load);
    }

    public void EmployeeDeleteOnClick(MouseEvent mouseEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/DeleteEmployeeForm.fxml"));
        tablePane.getChildren().clear();
        tablePane.getChildren().add(load);
    }

    public void EmployeeUpdateOnClick(MouseEvent mouseEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/UpdateEmployeeForm.fxml"));
        tablePane.getChildren().clear();
        tablePane.getChildren().add(load);
    }
}
