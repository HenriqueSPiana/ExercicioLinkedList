package Funcionarios;
import Departamento.DepartamentoEnum;

public class Funcionario {
    private int idade;
    private String nome;
    private DepartamentoEnum departamento;

    public DepartamentoEnum getDepartamento() {
        return departamento;
    }

    public void setDepartamento(DepartamentoEnum departamento) {
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public Funcionario(int idade, String nome, DepartamentoEnum departamento) {
        this.idade = idade;
        this.nome = nome;
        this.departamento = departamento;
    }

    public Funcionario() {
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", departamento=" + departamento +
                '}';
    }
}
