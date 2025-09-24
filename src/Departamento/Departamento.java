package Departamento;
import Funcionarios.Funcionario;
import java.util.LinkedList;
import java.util.Scanner;

public class Departamento {
    private LinkedList<Funcionario> funcionarios;



    public LinkedList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void getFuncionariosByName(String nomeFuncionario) {
        for (int i = 0; i <funcionarios.size() ; i++) {
            if (funcionarios.get(i).getNome().toLowerCase() == nomeFuncionario.toLowerCase()){
                System.out.println( "Funcionario Encontrado "+ funcionarios.get(i));
            };
            System.out.println("funcionario não encontrado");
        }
    }

    public void addFuncionarios (Funcionario funcionarios) {
        this.funcionarios.add(funcionarios);
    }



    public void cadastrarFuncionario(Scanner IO){
        System.out.println("Você escolheu cadastrar um novo funcionario");

        try(IO) {
            System.out.println("Qual o nome do funcionario?");
            String nome = IO.nextLine();
            System.out.println("Qual a idade do funcionario?");
            int idade = IO.nextInt();
            System.out.println("Qual o Departamento do funcionario?");

            System.out.println("" +
                    "1 - FINANCEIRO\n" +
                    "2 - RECURSOS HUMANOS\n" +
                    "3 - TECNOLOGIA\n" +
                    "4 - VENDAS\n" +
                    "5 - MARKETING\n");
            int indiceDepartamento = IO.nextInt();

            Funcionario fun = switch (indiceDepartamento){
                case 1 -> new Funcionario(idade, nome, DepartamentoEnum.FINANCEIRO);
                case 2 -> new Funcionario(idade, nome, DepartamentoEnum.RECURSOS_HUMANOS);
                case 3 -> new Funcionario(idade, nome, DepartamentoEnum.TECNOLOGIA);
                case 4 -> new Funcionario(idade, nome, DepartamentoEnum.VENDAS);
                case 5 -> new Funcionario(idade, nome, DepartamentoEnum.MARKETING);
                default -> throw new IllegalStateException("Valor invalido: " + indiceDepartamento);

            };
            this.addFuncionarios(fun);


        } catch (Exception e) {
            System.out.println("Valor invalido, tente novamente");
            throw new RuntimeException(e);
        }
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
