package saper;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    @FXML
    private AnchorPane root;

    @FXML
    void game(javafx.event.ActionEvent actionEvent) throws IOException {
        AnchorPane level = FXMLLoader.load(getClass().getResource("/fxml/SelectLevel.fxml"));
        root.getChildren().addAll(level);
    }

    @FXML
    void exit(javafx.event.ActionEvent actionEvent) throws IOException {
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}