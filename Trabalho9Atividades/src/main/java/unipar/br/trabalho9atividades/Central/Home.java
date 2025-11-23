package unipar.br.trabalho9atividades;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import unipar.br.trabalho9atividades.Central.ScreenController;

public class Home {

    @FXML private Button btnAtv1;
    @FXML private Button btnAtv2;
    @FXML private Button btnAtv3;
    @FXML private Button btnAtv4;
    @FXML private Button btnAtv5;
    @FXML private Button btnAtv6;
    @FXML private Button btnAtv7;
    @FXML private Button btnAtv8;
    @FXML private Button btnAtv9;

    @FXML
    public void initialize() {
        btnAtv1.setOnAction(e -> ScreenController.setScreen("CalculadoraSimples.fxml"));
        btnAtv2.setOnAction(e -> ScreenController.setScreen("Temperatura.fxml"));
        btnAtv3.setOnAction(e -> ScreenController.setScreen("CadastroPessoas.fxml"));
        btnAtv4.setOnAction(e -> ScreenController.setScreen("MédiaEscolar.fxml"));
        btnAtv5.setOnAction(e -> ScreenController.setScreen("CadastroSimples.fxml"));
        btnAtv6.setOnAction(e -> ScreenController.setScreen("Lanche.fxml"));
        btnAtv7.setOnAction(e -> ScreenController.setScreen("SemaforoTimer.fxml"));
        btnAtv8.setOnAction(e -> ScreenController.setScreen("JogoAdivinhacao.fxml"));
        btnAtv9.setOnAction(e -> ScreenController.setScreen("ContaDeLuz.fxml"));
    }
}
