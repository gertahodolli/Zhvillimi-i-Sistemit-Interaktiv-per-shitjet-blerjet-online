package controllers;

import application.Navigator;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

public class LayoutController {

    @FXML
    private Button adminButton;

    @FXML
    private Button homeButton;

    @FXML
    private Label nameLabel;

    @FXML
    private Button productsButton;

    @FXML
    private ImageView profileImage;

    @FXML
    private Rectangle rectId;

    @FXML
    private Button sellButton;

    @FXML
    private Button signoutButton;

    @FXML
    private Button userButton;

    @FXML
    private Label welcomeLabel;

    @FXML
    void handleProducts(MouseEvent event) {
        Navigator.navigate("/views/products.fxml");
    }

    @FXML
    void handleSell(MouseEvent event) {
        Navigator.navigate("/views/sellitem.fxml");
    }

    @FXML
    void handleSignOut(MouseEvent event) {
        Navigator.navigate("/views/SignIn.fxml");
    }

    @FXML
    void handleUser(MouseEvent event) {
        Navigator.navigate("/views/account2.fxml");
    }

    @FXML
    void handleAdmin(MouseEvent event) {
        Navigator.navigate("/views/AdminDashboard.fxml");
    }


}
