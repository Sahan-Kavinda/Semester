package lk.ijse.SemesterOne.model;
import lk.ijse.SemesterOne.db.DBConnection;
import lk.ijse.SemesterOne.to.Customer;
import lk.ijse.SemesterOne.to.Item;
import lk.ijse.SemesterOne.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ItemModel {
    public static boolean addItem(Item item) throws SQLException, ClassNotFoundException {
        String sql = "Insert into item Values (?,?,?,?,?)";
        return CrudUtil.execute(sql, item.getItem_code(), item.getItem_description(), item.getItem_name(), item.getUnit_price(), item.getQty_on_hand());
    }

    public static ArrayList<String> loadItemCode() throws SQLException, ClassNotFoundException {

        String sql = "SELECT code FROM Item";
        ResultSet result = CrudUtil.execute(sql);

        ArrayList<String> idList = new ArrayList<>();

        while (result.next()) {
            idList.add(result.getString(1));
        }
        return idList;
    }

    public static Item searchItem(String code) throws SQLException, ClassNotFoundException {

        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet result = stm.executeQuery("SELECT  * FROM item WHERE item_code ='" + code + "'");

        if (result.next()) {
            return new Item(
                    result.getString("item_code"),
                    result.getString("item_description"),
                    result.getString("item_name"),
                    result.getString("unit_price"),
                    result.getString("qty_on_hand")
            );
        }
        return null;
    }
}
