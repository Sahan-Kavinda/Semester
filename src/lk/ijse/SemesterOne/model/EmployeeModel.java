package lk.ijse.SemesterOne.model;

import javafx.scene.control.TableColumn;
import lk.ijse.SemesterOne.db.DBConnection;
import lk.ijse.SemesterOne.to.Customer;
import lk.ijse.SemesterOne.to.Employee;
import lk.ijse.SemesterOne.to.Supplier;
import lk.ijse.SemesterOne.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeModel {

    public static boolean saveEmployee(Employee employee) throws SQLException, ClassNotFoundException {
        String sql="Insert into employee Values (?,?,?,?,?)";
        return CrudUtil.execute(sql,employee.getEmp_id(), employee.getEmp_name(),employee.getEmp_address(),employee.getEmp_email(),employee.getEmp_contact());

    }



    public static ArrayList<String> loadEmployeeIds() throws SQLException, ClassNotFoundException {
        String sql = "SELECT emp_id FROM Employee";
        ResultSet result = CrudUtil.execute(sql);

        ArrayList<String> idList = new ArrayList<>();

        while (result.next()) {
            idList.add(result.getString(1));
        }
        return idList;
    }
    public static Employee searchEmployee(String empId) throws SQLException, ClassNotFoundException {

        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet result = stm.executeQuery("SELECT  * FROM employee WHERE emp_id ='"+empId+"'");

        if (result.next()) {
            return new Employee (
                   result.getString("emp_name"),
                   result.getString("emp_address"),
                   result.getString("emp_email"),
                   result.getString("emp_contact")

            );
        }
        return null;
    }
public static boolean deleteEmployee(String EmpId) throws SQLException, ClassNotFoundException {
        return DBConnection.getInstance().getConnection().createStatement().executeUpdate("DELETE FROM Employee WHERE emp_id='"+EmpId+"'")>0;
}
    public static ResultSet getAllData() throws SQLException, ClassNotFoundException {
        return CrudUtil.execute("select * from employee");
    }

}
