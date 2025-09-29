import Departamento.Departamento;
import Departamento.DepartamentoEnum;
import Funcionarios.Funcionario;

import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        LinkedList<Funcionario> listaFuncionario = new LinkedList<>();
        Departamento departamento = new Departamento(listaFuncionario);

        for (int i = 0; i < 6; i++) {
            departamento.addFuncionarios(new Funcionario(18+(i*2),
                    "funcionario"+i,
                    (i%2 ==0 ?DepartamentoEnum.RECURSOS_HUMANOS:DepartamentoEnum.TECNOLOGIA)));
        };

        boolean executar = true;
        while (executar) {
            try{
            Scanner IO = new Scanner(System.in);
            System.out.println("SISTEMA DE CADASTRO DE FUNCIONARIOS \n" +
                    "--------------------------------\n" +
                    "QUAL FUNÇÃO DESEJA FAZER? \n" +
                    "1 - Cadastrar novo funcionario\n" +
                    "2 - Buscar um funcionario\n" +
                    "3 - Mostrar todos os funcionarios\n" +
                    "4 - Remover primeiro funcionario da lista\n" +
                    "5 - Ordenar lista\n" +
                    "6 -- SAIR--");
            int escolha = IO.nextInt();
            IO.nextLine();

            switch (escolha) {
                case 1 -> departamento.cadastrarFuncionario(IO);
                case 2 -> departamento.procurarFuncionario(IO);
                case 3 -> departamento.mostraTodosFuncionarios();
                case 4 -> departamento.removerFuncionario();
                case 5 -> departamento.selecionarOrdenacao(IO);
                case 6 -> {
                    executar = false;
                }
            }
        }catch (Exception e){
                System.out.println("Valor invalido, tente novamente");
                throw new RuntimeException(e);

            }

        }

    }

}
