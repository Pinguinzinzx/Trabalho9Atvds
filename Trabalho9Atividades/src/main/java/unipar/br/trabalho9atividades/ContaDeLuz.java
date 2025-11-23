package unipar.br.trabalho9atividades;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import unipar.br.trabalho9atividades.Central.ScreenController;

public class ContaDeLuz {

    @FXML private TextField txtConsumo;
    @FXML private Label lblResultado;
    @FXML private Button btnCalcular;
    @FXML private Button btnVoltar;

    private final double VALOR_KWH = 0.85;

    @FXML
    public void initialize() {

        btnCalcular.setOnAction(e -> calcular());

        btnVoltar.setOnAction(e ->
                ScreenController.setScreen("home-view.fxml")
        );
    }

    private void calcular() {
        try {
            double consumo = Double.parseDouble(txtConsumo.getText());

            double valorFinal = consumo * VALOR_KWH;

            lblResultado.setText(String.format("Total a pagar: R$ %.2f", valorFinal));

        } catch (NumberFormatException e) {
            lblResultado.setText("Digite um número válido!");
        }
    }
}
