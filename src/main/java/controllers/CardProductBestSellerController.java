package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class CardProductBestSellerController implements Initializable {
    @FXML
    private AnchorPane card_form_bestseller;

    @FXML
    private ImageView prod_imageView;

    @FXML
    private Label prod_name;

    @FXML
    private Label prod_price;

    //private productData prodData;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
