import Departamento.Departamento;
import Departamento.DepartamentoEnum;
import Funcionarios.Funcionario;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {

        LinkedList<Funcionario> listaFuncionario = new LinkedList<>();
        Departamento departamento = new Departamento(listaFuncionario);

        for (int i = 0; i < 6; i++) {
            departamento.addFuncionarios(new Funcionario(18+(i*2),
                    "funcionario"+i,
                    (i%2 ==0 ?DepartamentoEnum.RECURSOS_HUMANOS:DepartamentoEnum.TECNOLOGIA)));
        };

        System.out.println(departamento);









    }






}
