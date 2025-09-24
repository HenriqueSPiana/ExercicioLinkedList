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



        try ( Scanner leitor = new Scanner(System.in);){


            System.out.println("SISTEMA DE CADASTRO DE FUNCIONARIOS \n" +
                    "--------------------------------\n" +
                    "QUAL FUNÇÃO DESEJA FAZER? \n" +
                    "1 - Cadastrar novo funcionario\n" +
                    "2 - Buscar um funcionario\n" +
                    "3 - Mostrar todos os funcionarios\n" +
                    "4 - Reordenar lista de funcionario\n" +
                    "-- SAIR--");
            int escolha = leitor.nextInt();

            switch (escolha){
                case 1 ->
            }
        } catch (Exception e) {
            System.out.println("Você escolheu sair ");
        }
        

                
        










    }






}
