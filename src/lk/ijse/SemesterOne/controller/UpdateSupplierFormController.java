package lk.ijse.SemesterOne.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;

public class UpdateSupplierFormController {
    public AnchorPane UpdateSupplierPane;
    public JFXTextField txtUpdateSupName;
    public JFXTextField txtUpdateSupAddress;
    public JFXTextField txtUpdateSupEmail;
    public JFXTextField txtUpdateSupContact;
    public TableColumn sup_id;
    public TableColumn sup_name;
    public TableColumn sup_address;
    public TableColumn sup_email;
    public TableColumn sup_contact;

    public void btnUpdateSupplierOnAction(ActionEvent actionEvent) {
    }

    public void cmbSelectUpdateCusIdOnAction(ActionEvent actionEvent) {
    }
}
