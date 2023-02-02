package lk.ijse.SemesterOne.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class EmployeePaymentFormController {
    public AnchorPane EmployeePaymentPane;
    public JFXButton btnAddPayment;
    public JFXDatePicker Selectdate;
    public JFXComboBox comEmpName;
    public TableColumn date;
    public TableColumn salary;
    public TableColumn emp_name;
    public TableColumn emp_id;
    public TableColumn emp_pay_id;
    public TableView EmpPaymentTable;
    public TextField txtEmpPayId;
    public JFXComboBox comEmpId;
    public TextField txtsetSalary;

    public void btnAddPaymentOnAction(ActionEvent actionEvent) {
    }

    public void txtsetSalaryOnAction(ActionEvent actionEvent) {
    }

    public void txtEmpPayIdOnAction(ActionEvent actionEvent) {
    }

    public void comEmpNameOnAction(ActionEvent actionEvent) {
    }

    public void SelectdateOnAction(ActionEvent actionEvent) {
    }
}
