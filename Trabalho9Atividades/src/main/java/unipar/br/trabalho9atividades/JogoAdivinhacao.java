package unipar.br.trabalho9atividades;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class JogoAdivinhacao {
    @FXML private TextField txtPalpite;
    @FXML private Label lblResultado;
    private final Random rnd = new Random();
    private int secret = rnd.nextInt(10) + 1;

    @FXML private void verificar() {
        try {
            int val = Integer.parseInt(txtPalpite.getText().trim());
            if (val < 1 || val > 10) { lblResultado.setText("Digite um número entre 1 e 10."); return; }
            if (val == secret) lblResultado.setText("Acertou!");
            else lblResultado.setText("Errou! O número era " + secret);
        } catch (NumberFormatException e) { lblResultado.setText("Digite um número válido."); }
    }
    @FXML private void novo() { secret = rnd.nextInt(10) + 1; lblResultado.setText("Novo número sorteado!"); txtPalpite.clear(); }
    @FXML private void voltar() { unipar.br.trabalho9atividades.Central.ScreenController.setScreen("home-view.fxml"); }
}
