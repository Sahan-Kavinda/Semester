package lk.ijse.SemesterOne.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import org.jfree.util.Log;

import java.io.IOException;
import java.net.URL;
import java.util.Stack;

public class LoginFormController {
    public AnchorPane LoginPane;
    public JFXButton btnLogin;
    public JFXTextField txtUser;
    public JFXPasswordField txtPassword;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) LoginPane.getScene().getWindow();
        stage.close();
        URL resource = getClass().getResource("/lk/ijse/SemesterOne/view/MenuForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene=new Scene(load);
        Stage stage1=new Stage();
        stage1.setScene(scene);
        stage1.show();


    }

    public void txtUserOnAction(ActionEvent actionEvent) {
    }

    public void txtPasswordOnAction(ActionEvent actionEvent) {
    }
}
