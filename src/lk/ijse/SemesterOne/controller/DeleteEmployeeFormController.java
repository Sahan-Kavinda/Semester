package lk.ijse.SemesterOne.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
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
import lk.ijse.SemesterOne.model.EmployeeModel;
import lk.ijse.SemesterOne.to.Customer;
import lk.ijse.SemesterOne.to.Employee;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static org.exolab.castor.dsml.XML.Schema.Attributes.Id;

public class DeleteEmployeeFormController implements Initializable {
    public TableView tblShowEmpTableForDelete;
    public ObservableList<Employee> tm = FXCollections.observableArrayList();

    public TableColumn emp_id;
    public TableColumn emp_name;
    public TableColumn emp_address;
    public TableColumn emp_email;
    public TableColumn emp_contact;
    public JFXComboBox comSelectEmpId;
    @FXML
    private AnchorPane DeleteEmployeePane;

    @FXML
    private JFXButton btnDeleteEmp;




    public void btnDeleteEmpOnAction(ActionEvent actionEvent) {
        String empId= comSelectEmpId.getValue().toString();

        try {
            Employee employee= EmployeeModel.searchEmployee(empId);

            if (employee != null) {
                emp_name.setText(employee.getEmp_name());
                emp_address.setText(employee.getEmp_address());
                emp_email.setText(employee.getEmp_email());
                emp_contact.setText(employee.getEmp_contact());

            }else{
                new Alert(Alert.AlertType.WARNING, "Data Not Found!").show();
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }

        try {
            boolean isDeleted= EmployeeModel.deleteEmployee(empId);

            if (isDeleted) {
                new Alert(Alert.AlertType.WARNING, "Deleted Successfully!").show();

            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public void comSelectEmpIdOnAction(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadEmployeeIds();
        emp_id.setCellValueFactory(new PropertyValueFactory<>("emp_id"));
        emp_name.setCellValueFactory(new PropertyValueFactory<>("emp_name"));
        emp_address.setCellValueFactory(new PropertyValueFactory<>("emp_address"));
        emp_email.setCellValueFactory(new PropertyValueFactory<>("emp_email"));
        emp_contact.setCellValueFactory(new PropertyValueFactory<>("emp_contact"));
        setTableData();
    }

    private void setTableData() {
        tblShowEmpTableForDelete.getItems().clear();
        try{
            ResultSet rst = EmployeeModel.getAllData();
            while(rst.next()){
                tm.add(new Employee(
                        rst.getString(1),
                        rst.getString(2),
                        rst.getString(3),
                        rst.getString(4),
                        rst.getString(5)
                ));
            }
            tblShowEmpTableForDelete.setItems(tm);
        }catch (SQLException|ClassNotFoundException throwables){
            throwables.printStackTrace();
        }
    }
        private void loadEmployeeIds(){
            try {
                ObservableList<String> observableList = FXCollections.observableArrayList();
                ArrayList<String> idList = EmployeeModel.loadEmployeeIds();

                for (String id : idList) {
                    observableList.add(id);
                }
                comSelectEmpId.setItems(observableList);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        }
    }

