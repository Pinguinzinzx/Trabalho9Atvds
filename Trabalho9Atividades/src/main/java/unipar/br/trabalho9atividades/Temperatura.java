package unipar.br.trabalho9atividades;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Temperatura {
    @FXML private TextField txtValor;
    @FXML private Label lblResultado;

    @FXML private void toF() {
        try {
            double c = Double.parseDouble(txtValor.getText().trim());
            double f = c * 9 / 5 + 32;
            lblResultado.setText(String.format("Resultado: %.2f °F", f));
        } catch (Exception e) { lblResultado.setText("Valor inválido."); }
    }

    @FXML private void toC() {
        try {
            double f = Double.parseDouble(txtValor.getText().trim());
            double c = (f - 32) * 5 / 9;
            lblResultado.setText(String.format("Resultado: %.2f °C", c));
        } catch (Exception e) { lblResultado.setText("Valor inválido."); }
    }

    @FXML private void voltar() { unipar.br.trabalho9atividades.Central.ScreenController.setScreen("home-view.fxml"); }
}
