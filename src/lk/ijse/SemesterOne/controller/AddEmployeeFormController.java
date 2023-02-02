package lk.ijse.SemesterOne.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import lk.ijse.SemesterOne.model.CustomerModel;
import lk.ijse.SemesterOne.model.EmployeeModel;
import lk.ijse.SemesterOne.to.Employee;

import java.sql.SQLException;

public class AddEmployeeFormController {

    @FXML
    private JFXTextField txtAddEmpId;

    @FXML
    private JFXTextField txtAddEmpName;

    @FXML
    private JFXTextField txtAddEmpAddress;

    @FXML
    private JFXTextField txtAddEmpEmail;

    @FXML
    private JFXTextField txtAddEmpContact;

    @FXML
    private JFXButton btnAddEmployee;
    public void btnAddEmployeeOnAction(ActionEvent actionEvent) {
        String emp_id=String.valueOf(txtAddEmpId.getText());
        String emp_name=String.valueOf(txtAddEmpName.getText());
        String emp_address=String.valueOf(txtAddEmpAddress.getText());
        String emp_email=String.valueOf(txtAddEmpEmail.getText());
        String emp_contact=String.valueOf(txtAddEmpContact.getText());

       Employee employee=new Employee(emp_id,emp_name,emp_address,emp_email,emp_contact);

        try {
            boolean isAdded = EmployeeModel.saveEmployee(employee);
            if (isAdded) {
                new Alert(Alert.AlertType.INFORMATION, "Employee Added").show();
                clearTextField();
            } else {
                new Alert(Alert.AlertType.INFORMATION, "Employee Not Added").show();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void initialize() {
        Platform.runLater(() -> txtAddEmpId.requestFocus());
    }
    public void txtAddEmpIdOnAction(ActionEvent actionEvent) {
        txtAddEmpName.requestFocus();
    }

    public void txtAddEmpNameOnAction(ActionEvent actionEvent) {
        txtAddEmpAddress.requestFocus();
    }

    public void txtAddEmpEmailOnAction(ActionEvent actionEvent) {
        txtAddEmpContact.requestFocus();
    }

    public void txtAddEmpContactOnAction(ActionEvent actionEvent) {
        btnAddEmployee.fire();
    }
    public void txtAddEmpAddressOnAction(ActionEvent actionEvent) {
        txtAddEmpEmail.requestFocus();
    }

    public void clearTextField(){
        txtAddEmpId.setText("");
        txtAddEmpName.setText("");
        txtAddEmpAddress.setText("");
        txtAddEmpEmail.setText("");
        txtAddEmpContact.setText("");
    }


}
