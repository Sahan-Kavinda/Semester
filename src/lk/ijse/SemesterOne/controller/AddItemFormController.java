package lk.ijse.SemesterOne.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import lk.ijse.SemesterOne.model.ItemModel;
import lk.ijse.SemesterOne.to.Item;
import java.sql.SQLException;

public class AddItemFormController {
    public JFXButton btnAddItem;
    public AnchorPane AddItemPane;
    public JFXTextField txtAddItemCodeId;
    public JFXTextField txtAddItemDesc;
    public JFXTextField txtAdditemName;
    public JFXTextField txtAddunitPrice;
    public JFXTextField txtAddqty;
    private Item item;
    public void initialize() {
        Platform.runLater(() -> txtAddItemCodeId.requestFocus());
    }

    public void txtAddItemCodeIdOnAction(ActionEvent actionEvent) {
        txtAddItemDesc.requestFocus();
    }

    public void txtAddItemDescOnAction(ActionEvent actionEvent) {
        txtAdditemName.requestFocus();
    }

    public void txtAdditemNameOnAction(ActionEvent actionEvent) {
        txtAddunitPrice.requestFocus();
    }

    public void txtAddunitPriceOnAction(ActionEvent actionEvent) {
        txtAddqty.requestFocus();
    }

    public void txtAddqtyOnAction(ActionEvent actionEvent) {
        btnAddItem.fire();
    }

    public void btnAddItemOnAction(ActionEvent actionEvent) {
        String item_code = txtAddItemCodeId.getText();
        String item_description = txtAddItemDesc.getText();
        String item_name = txtAdditemName.getText();
        String unit_price = txtAddunitPrice.getText();
        String qty_on_hand = txtAddqty.getText();

        Item item =new Item(item_code,item_description,item_name,unit_price,qty_on_hand);

        try {
            boolean isAdded = ItemModel.addItem(item);
            if (isAdded) {
                new Alert(Alert.AlertType.INFORMATION, "Item Added").show();
                clearTextField();

            } else {
                new Alert(Alert.AlertType.INFORMATION, "Item Not Added").show();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void clearTextField(){
        txtAddItemCodeId.setText("");
        txtAddItemDesc.setText("");
        txtAdditemName.setText("");
        txtAddunitPrice.setText("");
        txtAddqty.setText("");
    }
}
