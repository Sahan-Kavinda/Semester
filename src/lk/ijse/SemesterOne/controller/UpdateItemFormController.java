package lk.ijse.SemesterOne.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class UpdateItemFormController {

    @FXML
    private AnchorPane UpdateItemPane;

    @FXML
    private JFXTextField txtUpdateCusName;

    @FXML
    private JFXTextField txtUpdateCusAddress;

    @FXML
    private JFXTextField txtUpdateCusEmail;

    @FXML
    private JFXTextField txtUpdateCusContact;

    @FXML
    private JFXButton btnUpdateItem;

    @FXML
    private JFXComboBox<?> cmbSelectUpdateCusId;

    @FXML
    private TableView<?> tblUpdateSelectviewTable;

    @FXML
    private TableColumn<?, ?> item_code;

    @FXML
    private TableColumn<?, ?> item_description;

    @FXML
    private TableColumn<?, ?> item_name;

    @FXML
    private TableColumn<?, ?> unit_price;

    @FXML
    private TableColumn<?, ?> qty_on_hand;
    public void cmbSelectUpdateCusIdOnAction(ActionEvent actionEvent) {
    }

    public void btnUpdateItemOnAction(ActionEvent actionEvent) {
    }

    public void txtUpdateCusNameOnAction(ActionEvent actionEvent) {
    }

    public void txtUpdateCusAddressOnAction(ActionEvent actionEvent) {
    }

    public void txtUpdateCusEmailOnAction(ActionEvent actionEvent) {
    }

    public void txtUpdateCusContactOnAction(ActionEvent actionEvent) {
    }
}
