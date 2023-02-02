package lk.ijse.SemesterOne.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import lk.ijse.SemesterOne.model.CustomerModel;
import lk.ijse.SemesterOne.to.Customer;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class UpdateCustomerFormController implements Initializable {
    public AnchorPane EditCustomerPane;
    public TableColumn cus_id;
    public TableColumn cus_name;
    public TableColumn cus_address;
    public TableColumn cus_email;
    public TableColumn cus_contact;
    public JFXTextField txtUpdateCusName;
    public JFXTextField txtUpdateCusAddress;
    public JFXTextField txtUpdateCusEmail;
    public JFXTextField txtUpdateCusContact;
    public JFXButton btnUpdateCustomer;
    public JFXComboBox cmbSelectUpdateCusId;
    public TableView tblUpdateSelectviewTable;
    public JFXTextField txtSearchCusId;


    public void btnUpdateCustomerOnAction(ActionEvent actionEvent) {
      /*  String cus_id= cmbSelectUpdateCusId.getValue().toString();
        String cusNameText=txtUpdateCusName.getText();
        String cusAddressText=txtUpdateCusAddress.getText();
        String cusEmailText=txtUpdateCusEmail.getText();
        String cusContactText=txtUpdateCusContact.getText();

        Customer customer =new Customer(cus_id,cusNameText,cusAddressText,cusEmailText,cusContactText);

        try{

            boolean isUpdated = CustomerModel.UpdateCustomer(customer);
            if(isUpdated){
                new Alert(Alert.AlertType.INFORMATION, "Customer Updated Successfully!").show();
            }else {
                new Alert(Alert.AlertType.WARNING, "OOps!Try again!").show();
            }

        }catch (ClassNotFoundException | SQLException ex){
            System.out.println(ex);
            //new Alert(Alert.AlertType.WARNING, "SQL Or Class Exception!").show();
        }*/








    }

    public void cmbSelectUpdateCusIdOnAction(ActionEvent actionEvent) {
        String cus_id= String.valueOf(cmbSelectUpdateCusId.getValue());

        try{
            Customer customer = CustomerModel.searchCustomer(cus_id);
            if(customer!=null){
               txtUpdateCusName.setText(customer.getCus_name());
                txtUpdateCusAddress.setText(customer.getCus_address());
                txtUpdateCusEmail.setText(customer.getCus_email());
                txtUpdateCusContact.setText(customer.getCus_contact());
            }else {
                new Alert(Alert.AlertType.WARNING, "Data not found!").show();
            }

        }catch (ClassNotFoundException | SQLException ex){
            new Alert(Alert.AlertType.WARNING, "SQL Or Class Exception!").show();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       // loadCustomerIds();
    }
    private void loadCustomerIds() {
        try {
            ObservableList<String> observableList = FXCollections.observableArrayList();
            ArrayList<String> idList = CustomerModel.loadCustomerIds();

            for (String id : idList) {
                observableList.add(id);
            }
            cmbSelectUpdateCusId.setItems(observableList);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void txtSearchCusIdOnAction(ActionEvent actionEvent) {
    }
}
