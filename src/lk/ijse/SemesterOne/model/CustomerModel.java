package lk.ijse.SemesterOne.model;

import lk.ijse.SemesterOne.db.DBConnection;
import lk.ijse.SemesterOne.to.Customer;
import lk.ijse.SemesterOne.util.CrudUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CustomerModel {

    public static boolean addCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        String sql="Insert into customer Values (?,?,?,?,?)";
        return CrudUtil.execute(sql, customer.getCus_id(), customer.getCus_name(),customer.getCus_address(),customer.getCus_email(),customer.getCus_contact());
    }

    public static ArrayList<String> loadCustomerIds() throws SQLException, ClassNotFoundException {

        String sql = "SELECT cus_id FROM Customer";
        ResultSet result = CrudUtil.execute(sql);

        ArrayList<String> idList = new ArrayList<>();

        while (result.next()) {
            idList.add(result.getString(1));
        }
        return idList;
    }

    public static Customer searchCustomer(String cusId) throws SQLException, ClassNotFoundException {

        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet result = stm.executeQuery("SELECT  * FROM customer WHERE cus_id ='"+cusId+"'");

        if (result.next()) {
            return new Customer(
                  result.getString("cus_name"),
                  result.getString("cus_address"),
                  result.getString("cus_email"),
                  result.getString("cus_contact")
            );
        }
        return null;
    }



    public static boolean deleteCustomer(String cusId) throws SQLException, ClassNotFoundException {
        return DBConnection.getInstance().getConnection().createStatement().executeUpdate("DELETE FROM Customer WHERE cus_id='"+cusId+"'")>0;

    }
    public static boolean UpdateCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        String sql="UPDATE Customer SET cus_name=?, cus_address, cus_email=?, cus_contact=? WHERE cus_id=?";
        PreparedStatement preparedStatement=DBConnection.getInstance().getConnection().prepareStatement(sql);
        preparedStatement.setObject(1,customer.getCus_name());
        preparedStatement.setObject(2,customer.getCus_address());
        preparedStatement.setObject(3,customer.getCus_email());
        preparedStatement.setObject(4,customer.getCus_contact());
        preparedStatement.setObject(5,customer.getCus_id());

        return preparedStatement.executeUpdate()>0;
    }

    public static ResultSet getAllData() throws SQLException, ClassNotFoundException {
        return CrudUtil.execute("select * from customer");
    }
}
