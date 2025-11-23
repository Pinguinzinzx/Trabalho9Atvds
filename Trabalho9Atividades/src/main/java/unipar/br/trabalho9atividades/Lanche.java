package unipar.br.trabalho9atividades;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import unipar.br.trabalho9atividades.Central.ScreenController;

public class Lanche {

    @FXML private TextField txtNome;
    @FXML private ComboBox<String> cbPao;

    @FXML private RadioButton rbBovina;
    @FXML private RadioButton rbFrango;
    @FXML private RadioButton rbSoja;

    @FXML private CheckBox cbQueijo;
    @FXML private CheckBox cbBacon;
    @FXML private CheckBox cbSalada;
    @FXML private CheckBox cbMolho;

    @FXML private Label lblResumo;

    @FXML
    public void initialize() {
        cbPao.getItems().addAll("Francês", "Integral", "Australiano");
    }

    @FXML
    private void gerarPedido() {

        String nome = txtNome.getText().trim();
        String pao = cbPao.getValue();

        String carne = null;
        if (rbBovina.isSelected()) carne = "carne bovina";
        if (rbFrango.isSelected()) carne = "carne de frango";
        if (rbSoja.isSelected()) carne = "carne de soja";

        if (nome.isEmpty() || pao == null || carne == null) {
            lblResumo.setText("Preencha nome, pão e escolha a carne.");
            return;
        }

        StringBuilder extras = new StringBuilder();
        if (cbQueijo.isSelected()) extras.append("queijo, ");
        if (cbBacon.isSelected()) extras.append("bacon, ");
        if (cbSalada.isSelected()) extras.append("salada, ");
        if (cbMolho.isSelected()) extras.append("molho, ");

        String extrasStr = extras.length() > 0 ?
                extras.substring(0, extras.length() - 2) : "sem adicionais";

        lblResumo.setText(
                "Pedido de " + nome +
                        ": pão " + pao.toLowerCase() +
                        " com " + carne +
                        ", " + extrasStr + "."
        );
    }

    @FXML
    private void voltar() {
        ScreenController.setScreen("home-view.fxml");
    }
}
