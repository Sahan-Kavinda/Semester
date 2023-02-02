package lk.ijse.SemesterOne.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import lk.ijse.SemesterOne.model.CustomerModel;
//import lk.ijse.SemesterOne.tm.CustomerTM;
import lk.ijse.SemesterOne.to.Customer;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DeleteCustomerFormController implements Initializable {
    public TableColumn cus_id;
    public TableColumn cus_name;
    public TableColumn cus_address;
    public TableColumn cus_email;
    public TableColumn cus_contact;
    public JFXComboBox comSelectCusId;
    public JFXButton btnDelete;
    public AnchorPane DeleteCustomerPane;
    @FXML
    private TableView<Customer> tblShowCusTableForDelete;
    public ObservableList<Customer> tm = FXCollections.observableArrayList();


    public void btnDeleteOnAction(ActionEvent actionEvent) {
        String cusId= comSelectCusId.getValue().toString();

        try {
            Customer customer= CustomerModel.searchCustomer(cusId);

            if (customer != null) {
                cus_name.setText(customer.getCus_name());
                cus_address.setText(customer.getCus_address());
                cus_email.setText(customer.getCus_email());
                cus_contact.setText(customer.getCus_contact());

            }else{
                new Alert(Alert.AlertType.WARNING, "Data Not Found!").show();
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }

        try {
            boolean isDeleted= CustomerModel.deleteCustomer(cusId);

            if (isDeleted) {
                new Alert(Alert.AlertType.WARNING, "Deleted Successfully!").show();

            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public void comSelectCusIdOnAction(ActionEvent actionEvent) {


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadCustomerIds();
        cus_id.setCellValueFactory(new PropertyValueFactory<>("cus_id"));
        cus_name.setCellValueFactory(new PropertyValueFactory<>("cus_name"));
        cus_address.setCellValueFactory(new PropertyValueFactory<>("cus_address"));
        cus_email.setCellValueFactory(new PropertyValueFactory<>("cus_email"));
        cus_contact.setCellValueFactory(new PropertyValueFactory<>("cus_contact"));
        setTableData();
    }

    private void setTableData() {
        tblShowCusTableForDelete.getItems().clear();
        try{
            ResultSet rst = CustomerModel.getAllData();
            while(rst.next()){
                tm.add(new Customer(
                        rst.getString(1),
                        rst.getString(2),
                        rst.getString(3),
                        rst.getString(4),
                        rst.getString(5)
                ));
            }
            tblShowCusTableForDelete.setItems(tm);
        }catch (SQLException|ClassNotFoundException throwables){
            throwables.printStackTrace();
        }
    }

    private void loadCustomerIds() {
        try {
            ObservableList<String> observableList = FXCollections.observableArrayList();
            ArrayList<String> idList = CustomerModel.loadCustomerIds();

            for (String id : idList) {
                observableList.add(id);
            }
            comSelectCusId.setItems(observableList);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    }

