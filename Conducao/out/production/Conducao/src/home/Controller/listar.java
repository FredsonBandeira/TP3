package home.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class listar {


    private String nome;
    private String telefone;
    private LocalDate DataNasc;
    private long BI;
    private long NIF;
    private String profissao;
    private String sexo;

    public String getSexo() {
        return sexo;
    }

    public String getNome(String text) {
        return nome;
    }

    public String getTelefone(String text) {
        return telefone;
    }

    public LocalDate getDataNasc() {
        return DataNasc;
    }

    public long getBI() {
        return BI;
    }

    public long getNIF() {
        return NIF;
    }

    public String getProfissao(String text) {
        return profissao;
    }

    @FXML
    private TextField CampoNome;

    @FXML
    private TextField campoDescricao1;

    @FXML
    private TextField campoDescricao11;

    @FXML
    private TextField campoDescricao111;

    @FXML
    private TextField campoDescricao1111;

    @FXML
    private TextField campoProfissao;

    @FXML
    private TextField campoDescricao11112;

    @FXML
    private TextField campoDescricao11113;

    @FXML
    private TextField campoDescricao2;

    @FXML
    private TextField campoTelefone;

    @FXML
    private TextField campoData;

    @FXML
    private TextField campoNIF;

    @FXML
    private TextField campoBI;

    @FXML
    private TextField campoSexo;


}
