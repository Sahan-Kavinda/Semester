package lk.ijse.SemesterOne.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class BillFormController {
    public AnchorPane BillFormPane;
    public Pane loadPane;
    public Pane tablePane;
    public TableView tblBillTable;
    public TableColumn cus_id;
    public TableColumn vehicle_number_plate;
    public TableColumn vehicle_id;
    public TableColumn item_code;
    public TableColumn unit_price;
    public TableColumn qty_on_hand;
    public TableColumn date;
    public JFXComboBox comCusId;
    public JFXComboBox comItemCode;
    public JFXTextField txtBillNo;
    public JFXComboBox comunitPrice;
    public JFXComboBox comVehicleNumber;
    public JFXDatePicker selectdate;
    public JFXButton btnpaybill;
    public JFXButton btnCancel;
    public TextField txtQtyOnHand;
    public JFXTextField txtTotal;
    public JFXComboBox comvehicle_id;
    public JFXComboBox combillVehicleNumber;
    public JFXComboBox combillunitPrice;
    public JFXComboBox combillItemCode;
    public JFXComboBox combillCusId;
    public Pane BilltableandcomboPane;
    public TableColumn tbldate;
    public TableColumn tblqty_on_hand;
    public TableColumn tblunit_price;
    public TableColumn tblitem_code;
    public TableColumn tblvehicle_id;
    public TableColumn tblvehicle_number_plate;
    public TableColumn tblcus_id;
    public Pane BillLoadPane;

    public void txtQtyOnHandOnAction(ActionEvent actionEvent) {
    }

    public void btnCancelOnAction(ActionEvent actionEvent) {
    }

    public void btnpaybillOnAction(ActionEvent actionEvent) {
    }
    
    public void dateOnAction(ActionEvent actionEvent) {
    }
    
    public void combillVehicleNumberOnAction(ActionEvent actionEvent) {
    }

    public void combillunitPriceOnAction(ActionEvent actionEvent) {
    }

    public void combillItemCodeOnAction(ActionEvent actionEvent) {
    }

    public void combillCusIdOnAction(ActionEvent actionEvent) {
    }

    public void combillvehicle_idOnAction(ActionEvent actionEvent) {
    }
}
