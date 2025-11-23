package unipar.br.trabalho9atividades;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculadoraSimples {
    @FXML private TextField txtNum1, txtNum2;
    @FXML private Label lblResultado;

    @FXML private void soma() { calcular("+"); }
    @FXML private void sub() { calcular("-"); }
    @FXML private void mul() { calcular("*"); }
    @FXML private void div() { calcular("/"); }

    private void calcular(String op) {
        try {
            double n1 = Double.parseDouble(txtNum1.getText().trim());
            double n2 = Double.parseDouble(txtNum2.getText().trim());
            double r = 0;
            switch (op) {
                case "+": r = n1 + n2; break;
                case "-": r = n1 - n2; break;
                case "*": r = n1 * n2; break;
                case "/": if (n2 == 0) { lblResultado.setText("Divisão por zero!"); return; } r = n1 / n2; break;
            }
            lblResultado.setText("Resultado: " + String.format("%.2f", r));
        } catch (Exception ex) {
            lblResultado.setText("Digite números válidos.");
        }
    }

    @FXML private void voltar() { unipar.br.trabalho9atividades.Central.ScreenController.setScreen("home-view.fxml"); }
}
