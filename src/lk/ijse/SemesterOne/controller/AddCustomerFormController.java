package lk.ijse.SemesterOne.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import lk.ijse.SemesterOne.model.CustomerModel;
import lk.ijse.SemesterOne.to.Customer;

import java.sql.SQLException;

public class AddCustomerFormController {

    @FXML
    private AnchorPane AddCustomerPane;

    @FXML
    private JFXTextField txtCusId;

    @FXML
    private JFXTextField txtCusName;

    @FXML
    private JFXTextField txtCusAddress;

    @FXML
    private JFXTextField txtCusEmail;

    @FXML
    private JFXTextField txtCusContact;

    @FXML
    private JFXButton btnAddCustomer;

    public void btnAddCustomerOnAction(ActionEvent actionEvent) {
        String cus_id = String.valueOf(txtCusId.getText());
        String cus_name = String.valueOf(txtCusName.getText());
        String cus_address = String.valueOf(txtCusAddress.getText());
        String cus_email = String.valueOf(txtCusEmail.getText());
        String cus_contact = String.valueOf(txtCusContact.getText());

        Customer customer = new Customer(cus_id, cus_name, cus_address, cus_email, cus_contact);

        try {
            boolean isAdded = CustomerModel.addCustomer(customer);
            if (isAdded) {
                new Alert(Alert.AlertType.INFORMATION, "Customer Added").show();
                clearTextField();

            } else {
                new Alert(Alert.AlertType.INFORMATION, "Customer Not Added").show();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void initialize() {
        Platform.runLater(() -> txtCusId.requestFocus());
    }

    @FXML
    void contactOnAction(ActionEvent event) {
        btnAddCustomer.fire();
    }

    @FXML
    void idOnAction(ActionEvent event) {
        txtCusName.requestFocus();
    }

    @FXML
    void mailOnAction(ActionEvent event) {
        txtCusContact.requestFocus();
    }

    @FXML
    void nameOnAction(ActionEvent event) {
        txtCusAddress.requestFocus();
    }
    @FXML
    void addOnAction(ActionEvent event) {
        txtCusEmail.requestFocus();
    }
    public void clearTextField(){
        txtCusId.setText("");
        txtCusName.setText("");
        txtCusAddress.setText("");
        txtCusEmail.setText("");
        txtCusContact.setText("");
    }
}