package gerenciamentoFuncionarios;

public enum Departamento {
    FINANCEIRO(1, "Departamento Financeiro"),
    RECURSOS_HUMANOS(2, "Departamento de Recursos Humanos"),
    TECNOLOGIA(3, "Departamento de Tecnologia da Informação"),
    VENDAS(4, "Departamento de Vendas"),
    MARKETING(5, "Departamento de Marketing");

    private int id;
    private String descricao;

    Departamento(int i, String s) {
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}
