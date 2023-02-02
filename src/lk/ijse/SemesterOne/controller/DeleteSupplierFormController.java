package lk.ijse.SemesterOne.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import lk.ijse.SemesterOne.model.EmployeeModel;
import lk.ijse.SemesterOne.model.SupplierModel;

import lk.ijse.SemesterOne.to.Supplier;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DeleteSupplierFormController implements Initializable {
    public TableColumn sup_id;
    public TableColumn sup_name;
    public TableColumn sup_address;
    public TableColumn sup_email;
    public TableColumn sup_contact;
    public JFXComboBox comSelectSupId;
    public JFXButton btnDeleteSupplier;
    public TableView tblShowSupTableForDelete;
    public ObservableList<Supplier> tm = FXCollections.observableArrayList();


    public void btnDeleteSupplierOnAction(ActionEvent actionEvent) {
        String SupId=comSelectSupId.getValue().toString();
        try {
            Supplier supplier= SupplierModel.searchSupplier(SupId);
            if (supplier !=null){
                sup_name.setText(supplier.getSup_name());
                sup_address.setText(supplier.getSup_address());
                sup_email.setText(supplier.getSup_email());
                sup_contact.setText(supplier.getSup_contact());
            }else {
                new Alert(Alert.AlertType.WARNING,"Data not found").show();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            boolean isDelete= SupplierModel.deleteSupplier(SupId);
            if (isDelete) {
            new Alert(Alert.AlertType.WARNING,"Delete Successful").show();
            }else{
                new Alert(Alert.AlertType.WARNING,"Can Not Delete").show();

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


    public void comSelectSupIdOnAction(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadSupplierIds();
        sup_id.setCellValueFactory(new PropertyValueFactory<>("sup_id"));
        sup_name.setCellValueFactory(new PropertyValueFactory<>("sup_name"));
        sup_address.setCellValueFactory(new PropertyValueFactory<>("sup_address"));
        sup_email.setCellValueFactory(new PropertyValueFactory<>("sup_email"));
        sup_contact.setCellValueFactory(new PropertyValueFactory<>("sup_contact"));
        setTableData();
    }

    private void setTableData() {
        tblShowSupTableForDelete.getItems().clear();
        try{
            ResultSet rst = SupplierModel.getAllData();
            while(rst.next()){
                tm.add(new Supplier(
                        rst.getString(1),
                        rst.getString(2),
                        rst.getString(3),
                        rst.getString(4),
                        rst.getString(5)
                ));
            }
            tblShowSupTableForDelete.setItems(tm);
        }catch (SQLException|ClassNotFoundException throwables){
            throwables.printStackTrace();
        }
    }

    private void loadSupplierIds() {
        try {
            ObservableList<String> observableList = FXCollections.observableArrayList();
            ArrayList<String> idList = SupplierModel.loadSupplierIds();

            for (String id : idList) {
                observableList.add(id);
            }
            comSelectSupId.setItems(observableList);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
