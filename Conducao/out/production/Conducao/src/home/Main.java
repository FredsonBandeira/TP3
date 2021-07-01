package home;

import home.Controller.JOptionPane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import home.Controller.controller;


public class Main extends Application {
    private AnchorPane pane;
    private TextField txLogin;
    private PasswordField txSenha;
    private Button btEntrar, btSair;
    private static Stage stage;
   // private double xoffset =0;
    //private double yoffset =0;
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("home/FXML/login.fxml"));
        Pane root = loader.load();

        Scene scene= new Scene(root);

        controller controller = loader.getController();

        scene.getStylesheets().add("home/CSS/style.css");

        primaryStage.setTitle("Escola de conduçao");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static Stage getStage() {
        return stage;
    }/*
    private void initComponents() {
        pane = new AnchorPane();
        pane.setPrefSize(400, 300);

        pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, blue 0%, silver 100%);");
        txLogin = new TextField();
        txLogin.setPromptText("Digite seu login...");
        PasswordField txSenha = new PasswordField();
        txSenha.setPromptText("Digite aqui sua senha");
        Button btEntrar = new Button("Entrar");
        Button btSair = new Button("Sair");
        pane.getChildren().addAll(txLogin, txSenha, btEntrar, btSair);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    private void initLayout() {
        txLogin.setLayoutX((pane.getWidth() - txLogin.getWidth()) / 2);
        txLogin.setLayoutY(50);
        txSenha.setLayoutX((pane.getWidth() - txSenha.getWidth()) / 2);
        txSenha.setLayoutY(100);
        btEntrar.setLayoutX(
                (pane.getWidth() - btEntrar.getWidth()) / 2);
        btEntrar.setLayoutY(150);
        btSair.setLayoutX((pane.getWidth() - btSair.getWidth()) / 2);
        btSair.setLayoutY(200);
    }
    //botao sair
    private void initListeners() {
        btSair.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fecharAplicacao();
            }
        });
        //botao login
       btEntrar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                logar();
            }
        });
    }
    private void fecharAplicacao() {
        System.exit(0);
    }
    private void logar() {
        if (txLogin.getText().equals("admin") &&
                txSenha.getText().equals("senha")) {

        } else {

           // Dialog.showMessegeDialod(null, "Login e/ou senha inválidos", "Erro", JOptionPane.ERROR_MESSAGE);
            //JOptionPane.showMessageDialog(null, "Login e/ou senha inválidos", "Erro", JOptionPane.ERROR_MESSAGE);
        } }
    */

    public static void main(String[] args) {
        launch(args);
    }
}
