package Departamento;
import Funcionarios.Funcionario;
import java.util.LinkedList;

public class Departamento {
    private LinkedList<Funcionario> funcionarios;



    public LinkedList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void addFuncionarios (Funcionario funcionarios) {
        this.funcionarios.add(funcionarios);
    }

    public Departamento() {
    }

    public Departamento(LinkedList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "funcionarios=" + funcionarios +
                '}';
    }
}
