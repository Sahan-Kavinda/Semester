package lk.ijse.SemesterOne.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class SupplierFormController {


    public Pane tablePane;

    public void SupplierAddOnClick(MouseEvent mouseEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/AddSupplierForm.fxml"));
        tablePane.getChildren().clear();
        tablePane.getChildren().add(load);
    }

    public void SupplierPaymentOnClick(MouseEvent mouseEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/SupplierPaymentForm.fxml"));
        tablePane.getChildren().clear();
        tablePane.getChildren().add(load);
    }

    public void SupplierDeleteOnClick(MouseEvent mouseEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/DeleteSupplierForm.fxml"));
        tablePane.getChildren().clear();
        tablePane.getChildren().add(load);
    }

    public void SupplierUpdateOnClick(MouseEvent mouseEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/UpdateSupplierForm.fxml"));
        tablePane.getChildren().clear();
        tablePane.getChildren().add(load);
    }
}
