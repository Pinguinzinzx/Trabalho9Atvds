package unipar.br.trabalho9atividades;

import unipar.br.trabalho9atividades.Central.ScreenController;
import unipar.br.trabalho9atividades.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CadastroSimples {

    @FXML private TextField txtNome, txtIdade;
    @FXML private ComboBox<String> cbCurso;
    @FXML private TableView<Student> table;
    @FXML private TableColumn<Student, String> colNome;
    @FXML private TableColumn<Student, Integer> colIdade;
    @FXML private TableColumn<Student, String> colCurso;

    private final ObservableList<Student> lista = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        cbCurso.getItems().addAll("Informática", "Administração", "Direito", "Engenharia");

        colNome.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("nome"));
        colIdade.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("idade"));
        colCurso.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("curso"));

        table.setItems(lista);
    }

    @FXML
    private void adicionar() {
        try {
            String nome = txtNome.getText().trim();
            int idade = Integer.parseInt(txtIdade.getText().trim());
            String curso = cbCurso.getValue();

            if (nome.isEmpty() || curso == null) {
                showAlert("Preencha todos os campos.");
                return;
            }

            lista.add(new Student(nome, idade, curso));

            txtNome.clear();
            txtIdade.clear();
            cbCurso.getSelectionModel().clearSelection();

        } catch (NumberFormatException e) {
            showAlert("Idade inválida.");
        }
    }

    @FXML
    private void excluir() {
        Student s = table.getSelectionModel().getSelectedItem();

        if (s != null) {
            lista.remove(s);
        } else {
            showAlert("Selecione um aluno.");
        }
    }

    @FXML
    private void voltar() {
        ScreenController.setScreen("home-view.fxml"); // ✔ FUNCIONA AGORA
    }

    private void showAlert(String msg) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setHeaderText(null);
        a.setContentText(msg);
        a.showAndWait();
    }
}
