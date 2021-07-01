package home.Controller;
import home.Controller.listar;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Cadastrar implements Initializable {
    private listar listar;
    @FXML
    private Button btnPesquisar;

    @FXML
    private Button btnListar;

    @FXML
    private Label btnNome;

    @FXML
    private TextField IDNome;

    @FXML
    private DatePicker btnDataNAsc;

    @FXML
    private TextField btnTelefone;

    @FXML
    private TextField btnNif;

    @FXML
    private Button btnGuardar;

    @FXML
    private TextField btnBI;

    @FXML
    private TextField btnProfissao;

    @FXML
    private RadioButton btnMasc;

    @FXML
    private RadioButton btnFem;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnGerenciar;

    @FXML
    void BtnGerenciarONAction(ActionEvent event) {

    }

    @FXML
    void BtnListarONAction(ActionEvent event) {

    }

    @FXML
    void btnGuardarOnAction(ActionEvent event) {
                TextArea textArea= new TextArea();
                //textArea.setB
    }

    @FXML
    void btnPesquisarOnAction(ActionEvent event) {
        listar list= new listar();
        list.getNome(IDNome.getText() );
        list.getTelefone(btnTelefone.getText() );
       // list.getDataNasc(btnDataNAsc.);
        list.getProfissao(btnProfissao.getText() );
        if (btnMasc.isSelected()== true){
            //list.getSexo()
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
