package home.Controller;
import home.Controller.DataExame;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class controller implements Initializable {
    @FXML
    Button buttonMain;
    @FXML
    private Button bdestudante;

    @FXML
    private Button bdinstrutor;

    @FXML
    private Button bdturmas;

    @FXML
    private Button bdcartaconducao;

    @FXML
    private Button bdsttengs;

    @FXML
    private Pane ptnStatus;

    @FXML
    private Label lblStatus;

    @FXML
    private Label lblStatusMin;
    @FXML
    private Label btnclose;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void toMain() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../main.fxml"));
        Parent root = loader.load();

        Stage window = (Stage) buttonMain.getScene().getWindow();
        window.setScene(new Scene(root));
    }




        @FXML
        private  void handeClose(javafx.scene.input.MouseEvent event){
            if (event.getSource() == btnclose)
                System.exit(0);
        }

        @FXML
        Button buttonlogin;

    public void changeToMain() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("home/FXML/cadastrar.fxml"));
        Parent root = loader.load();
        Stage window = (Stage) buttonlogin.getScene().getWindow();
        window.setScene(new Scene(root));
    }
    private List<DataExame> todoItems;

    @FXML
    private Label labelPrazo;
    @FXML
    private ListView todoListView;
    @FXML
    private BorderPane mainBorderPane;

    private DataExame dados;




}
