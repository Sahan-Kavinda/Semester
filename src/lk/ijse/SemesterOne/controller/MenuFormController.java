package lk.ijse.SemesterOne.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MenuFormController {

    public Pane tablePane;
    public Pane loadPane;
    public Pane MenuLoadPane;

    public void initialize() throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/CustomerForm.fxml"));
        MenuLoadPane.getChildren().clear();
        MenuLoadPane.getChildren().add(load);

    }

    public void btnCustomerOnAction(ActionEvent actionEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/CustomerForm.fxml"));
        MenuLoadPane.getChildren().clear();
        MenuLoadPane.getChildren().add(load);
    }

    public void btnEmployeeOnAction(ActionEvent actionEvent) throws IOException {

        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/EmployeeForm.fxml"));
        MenuLoadPane.getChildren().clear();
        MenuLoadPane.getChildren().add(load);
    }

    public void btnSupplierOnAction(ActionEvent actionEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/SupplierForm.fxml"));
        MenuLoadPane.getChildren().clear();
        MenuLoadPane.getChildren().add(load);
    }

    public void btnItemOnAction(ActionEvent actionEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/ItemForm.fxml"));
        MenuLoadPane.getChildren().clear();
        MenuLoadPane.getChildren().add(load);
    }

    public void btnPaymentOnAction(ActionEvent actionEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/EmployeePaymentForm.fxml"));
        MenuLoadPane.getChildren().clear();
        MenuLoadPane.getChildren().add(load);
    }

    public void btnOrderOnAction(ActionEvent actionEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/BillForm.fxml"));
        MenuLoadPane.getChildren().clear();
        MenuLoadPane.getChildren().add(load);
    }

    public void btnReportOnAction(ActionEvent actionEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/ReportForm.fxml"));
        MenuLoadPane.getChildren().clear();
        MenuLoadPane.getChildren().add(load);
    }


}
