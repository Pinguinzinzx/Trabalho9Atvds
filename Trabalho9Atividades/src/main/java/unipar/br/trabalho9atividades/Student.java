package unipar.br.trabalho9atividades;

public class Student {
    private final String nome;
    private final int idade;
    private final String curso;

    public Student(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getCurso() { return curso; }
}
