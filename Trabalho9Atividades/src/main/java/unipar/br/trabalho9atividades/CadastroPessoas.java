package unipar.br.trabalho9atividades;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CadastroPessoas {
    @FXML private TextField txtNome, txtIdade;
    @FXML private RadioButton rbMas, rbFem;
    @FXML private CheckBox cbEsportes;
    @FXML private Label lblResultado;

    @FXML private void analisar() {
        String nome = txtNome.getText().trim();
        String idS = txtIdade.getText().trim();
        String sexo = rbMas.isSelected() ? "masculino" : rbFem.isSelected() ? "feminino" : "não informado";
        boolean gosta = cbEsportes.isSelected();

        if (nome.isEmpty() || idS.isEmpty()) { lblResultado.setText("Preencha nome e idade."); return; }
        try {
            int idade = Integer.parseInt(idS);
            String obs = (idade < 18) ? "Menor de idade." : "Maior de idade.";
            String gost = gosta ? "gosta de esportes." : "não gosta de esportes.";
            lblResultado.setText(String.format("%s, %d anos, do sexo %s, %s %s", nome, idade, sexo, gost, obs));
        } catch (NumberFormatException e) { lblResultado.setText("Idade inválida."); }
    }

    @FXML private void voltar() { unipar.br.trabalho9atividades.Central.ScreenController.setScreen("home-view.fxml"); }
}
