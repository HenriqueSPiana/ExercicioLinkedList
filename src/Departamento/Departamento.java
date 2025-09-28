package Departamento;
import Funcionarios.Funcionario;
import java.util.LinkedList;
import java.util.Scanner;

public class Departamento {
    private LinkedList<Funcionario> listaDeFuncionarios;



    public LinkedList<Funcionario> getFuncionarios() {
        return listaDeFuncionarios;
    }

    public void mostraTodosFuncionarios(){
        System.out.println(getFuncionarios());
    }

    public Funcionario getFuncionariosByName(String nomeFuncionario) {
        for (Funcionario f : listaDeFuncionarios){
            if (f.getNome().equalsIgnoreCase(nomeFuncionario)) {
                return f;
            }
        }
        System.out.println("funcionario não encontrado");
        return null;
    };

    public void addFuncionarios (Funcionario funcionarios) {
        this.listaDeFuncionarios.add(funcionarios);
    }

    public void procurarFuncionario(Scanner IO){
        try{
            System.out.println("Insira o nome do funcionario desejado");
            String nome = IO.nextLine();
            var f = getFuncionariosByName(nome);
            if (f != null) {
                System.out.println(f);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public void cadastrarFuncionario(Scanner IO){
        System.out.println("Você escolheu cadastrar um novo funcionario\n");
        try
            {
                System.out.println("Qual o nome do funcionario?\n");
                String nome = IO.nextLine();
                System.out.println("Qual a idade do funcionario?\n");
                int idade = IO.nextInt();
                IO.nextLine();
                System.out.println("Qual o Departamento do funcionario?\n");
                System.out.println("" +
                        "1 - FINANCEIRO\n" +
                        "2 - RECURSOS HUMANOS\n" +
                        "3 - TECNOLOGIA\n" +
                        "4 - VENDAS\n" +
                        "5 - MARKETING\n");
                int indiceDepartamento = IO.nextInt();

                Funcionario fun = switch (indiceDepartamento) {
                    case 1 -> new Funcionario(idade, nome, DepartamentoEnum.FINANCEIRO);
                    case 2 -> new Funcionario(idade, nome, DepartamentoEnum.RECURSOS_HUMANOS);
                    case 3 -> new Funcionario(idade, nome, DepartamentoEnum.TECNOLOGIA);
                    case 4 -> new Funcionario(idade, nome, DepartamentoEnum.VENDAS);
                    case 5 -> new Funcionario(idade, nome, DepartamentoEnum.MARKETING);
                    default -> throw new IllegalStateException("\nValor invalido: " + indiceDepartamento);

                };
                this.addFuncionarios(fun);
                System.out.println("Funcionario cadastrado " + this.getFuncionariosByName(nome));

            }
            catch (Exception e) {
                System.out.println("Valor invalido, tente novamente");
                throw new RuntimeException(e);
            }
     }


    public Departamento() {
    }

    public Departamento(LinkedList<Funcionario> listaDeFuncionarios) {
        this.listaDeFuncionarios = listaDeFuncionarios;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "funcionarios=" + listaDeFuncionarios +
                '}';
    }
}
