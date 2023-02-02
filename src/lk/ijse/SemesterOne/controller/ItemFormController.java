package lk.ijse.SemesterOne.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class ItemFormController {

    public AnchorPane ItemFormPane;
    public Pane loadPane;
    public Pane tablePane;
    public TableColumn unit_price;
    public TableColumn item_code;
    public TableColumn item_description;
    public TableColumn item_name;
    public TableColumn qty_on_hand;

    public void ItemAddOnClick(MouseEvent mouseEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/AddItemForm.fxml"));
        tablePane.getChildren().clear();
        tablePane.getChildren().add(load);
    }

    public void ItemUpdateOnClick(MouseEvent mouseEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/UpdateItemForm.fxml"));
        tablePane.getChildren().clear();
        tablePane.getChildren().add(load);
    }

    public void ItemDeleteOnClick(MouseEvent mouseEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/lk/ijse/SemesterOne/view/DeleteItemForm.fxml"));
        tablePane.getChildren().clear();
        tablePane.getChildren().add(load);
    }
}
