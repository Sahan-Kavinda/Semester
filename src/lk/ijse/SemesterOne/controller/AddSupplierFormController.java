package lk.ijse.SemesterOne.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import lk.ijse.SemesterOne.model.EmployeeModel;
import lk.ijse.SemesterOne.model.SupplierModel;
import lk.ijse.SemesterOne.to.Supplier;

import java.sql.SQLException;

public class AddSupplierFormController {

    @FXML
    private JFXTextField txtAddSupId;

    @FXML
    private JFXTextField txtAddSupName;

    @FXML
    private JFXTextField txtAddSupAddress;

    @FXML
    private JFXTextField txtAddSupEmail;

    @FXML
    private JFXTextField txtAddSupContact;

    @FXML
    private JFXButton btnAddSupplier;

    public void btnAddSupplierOnAction(ActionEvent actionEvent) {
        String sup_id=String.valueOf(txtAddSupId.getText());
        String sup_name=String.valueOf(txtAddSupAddress.getText());
        String sup_address=String.valueOf(txtAddSupName.getText());
        String sup_email=String.valueOf(txtAddSupEmail.getText());
        String sup_contact=String.valueOf(txtAddSupContact.getText());
        Supplier supplier=new Supplier(sup_id,sup_name,sup_address,sup_email,sup_contact);
        try {
            boolean isAdded = SupplierModel.saveSupplier(supplier);
            if (isAdded) {
                new Alert(Alert.AlertType.INFORMATION, "Supplier Added").show();
                clearTextField();
            } else {
                new Alert(Alert.AlertType.INFORMATION, "Supplier Not Added").show();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void clearTextField(){
        txtAddSupId.setText("");
        txtAddSupName.setText("");
        txtAddSupAddress.setText("");
        txtAddSupEmail.setText("");
        txtAddSupContact.setText("");
    }
    public void initialize() {
        Platform.runLater(() -> txtAddSupId.requestFocus());
    }
    @FXML
    void txtAddSupAddressOnAction(ActionEvent event) {
        txtAddSupEmail.requestFocus();

    }

    @FXML
    void txtAddSupContactOnAction(ActionEvent event) {
       btnAddSupplier.fire();
    }

    @FXML
    void txtAddSupEmailOnAction(ActionEvent event) {
        txtAddSupContact.requestFocus();

    }

    @FXML
    void txtAddSupIdOnAction(ActionEvent event) {
        txtAddSupName.requestFocus();
    }

    @FXML
    void txtAddSupNameOnAction(ActionEvent event) {
        txtAddSupAddress.requestFocus();
    }
}


