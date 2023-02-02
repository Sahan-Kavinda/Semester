package lk.ijse.SemesterOne.model;

import lk.ijse.SemesterOne.db.DBConnection;
import lk.ijse.SemesterOne.to.Customer;
import lk.ijse.SemesterOne.to.Supplier;
import lk.ijse.SemesterOne.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SupplierModel {

    public static boolean saveSupplier(Supplier supplier) throws SQLException, ClassNotFoundException {
        String sql="Insert into supplier Values (?,?,?,?,?)";
        return CrudUtil.execute(sql, supplier.getSup_id(), supplier.getSup_name(),supplier.getSup_address(),supplier.getSup_email(),supplier.getSup_contact());
    }

    public static ArrayList<String> loadSupplierIds() throws SQLException, ClassNotFoundException {

        String sql = "SELECT sup_id FROM Supplier";
        ResultSet result = CrudUtil.execute(sql);

        ArrayList<String> idList = new ArrayList<>();

        while (result.next()) {
            idList.add(result.getString(1));
        }
        return idList;
    }
public static Supplier searchSupplier(String supId) throws SQLException, ClassNotFoundException {
    Statement statement = DBConnection.getInstance().getConnection().createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT  * FROM supplier WHERE sup_id ='" + supId + "'");
    if (resultSet.next()){
        return new Supplier(
                resultSet.getString("sup_name"),
                resultSet.getString("sup_address"),
                resultSet.getString("sup_email"),
                resultSet.getString("sup_contact")
        );

    }
    return null;
}
public static boolean deleteSupplier(String SupId) throws SQLException, ClassNotFoundException {
        return DBConnection.getInstance().getConnection().createStatement().executeUpdate("DELETE FROM Supplier WHERE sup_id='"+SupId+"'")>0;

}

    public static ResultSet getAllData() throws SQLException, ClassNotFoundException {
        return CrudUtil.execute("select * from supplier");
    }
}
