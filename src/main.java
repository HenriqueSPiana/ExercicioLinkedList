import Departamento.DepartamentoEnum;
import Funcionarios.Funcionario;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {

        LinkedList<Funcionario> listaFuncionario = new LinkedList<>();

        listaFuncionario.add(new Funcionario(18,"luciano", DepartamentoEnum.FINANCEIRO));
        listaFuncionario.add(new Funcionario(19,"lucas", DepartamentoEnum.VENDAS));
        listaFuncionario.add(new Funcionario(21,"marcio", DepartamentoEnum.MARKETING));
        listaFuncionario.add(new Funcionario(34,"alberto", DepartamentoEnum.TECNOLOGIA));
        listaFuncionario.add(new Funcionario(42,"berenice", DepartamentoEnum.RECURSOS_HUMANOS));
        listaFuncionario.add(new Funcionario(59,"geovana", DepartamentoEnum.TECNOLOGIA));
        listaFuncionario.add(new Funcionario(59,"matheus", DepartamentoEnum.RECURSOS_HUMANOS));





    }
}
