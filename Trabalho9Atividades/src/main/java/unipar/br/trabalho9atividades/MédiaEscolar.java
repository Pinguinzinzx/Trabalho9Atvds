package unipar.br.trabalho9atividades;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MédiaEscolar {
    @FXML private TextField txtNome, txtN1, txtN2, txtN3;
    @FXML private Label lblResultado;

    @FXML private void calcular() {
        try {
            String nome = txtNome.getText().trim();
            double n1 = Double.parseDouble(txtN1.getText().trim());
            double n2 = Double.parseDouble(txtN2.getText().trim());
            double n3 = Double.parseDouble(txtN3.getText().trim());
            double media = (n1 + n2 + n3) / 3.0;
            String sit = media >= 6 ? "Aprovado" : (media >= 4 ? "Recuperação" : "Reprovado");
            lblResultado.setText(String.format("Aluno %s — média: %.2f — %s.", nome.isEmpty() ? "-" : nome, media, sit));
        } catch (Exception e) { lblResultado.setText("Preencha as notas corretamente."); }
    }
    @FXML private void voltar() { unipar.br.trabalho9atividades.Central.ScreenController.setScreen("home-view.fxml"); }
}
