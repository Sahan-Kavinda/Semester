package lk.ijse.SemesterOne.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class CustomerFormController {
    public Pane tablePane;
    public AnchorPane CustomerFormPane;
    public ImageView CustomerDelete;
    public TableView tblCusTable;
    public ImageView CustomerBooking;
    public ImageView CustomerEdit;
    public ImageView customerAdd;
    public Pane loadPane;



    public void customerAddOnClick(MouseEvent mouseEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/AddCustomerForm.fxml"));
        tablePane.getChildren().clear();
        tablePane.getChildren().add(load);
    }

    public void customerEditOnClick(MouseEvent mouseEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/UpdateCustomerForm.fxml"));
        tablePane.getChildren().clear();
        tablePane.getChildren().add(load);
    }

    public void CustomerDeleteOnClick(MouseEvent mouseEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/DeleteCustomerForm.fxml"));
        tablePane.getChildren().clear();
        tablePane.getChildren().add(load);
    }

    public void CustomerBookingOnClick(MouseEvent mouseEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/CustomerFormBooking.fxml"));
        tablePane.getChildren().clear();
        tablePane.getChildren().add(load);

    }
}
