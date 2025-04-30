package br.com.alura.screenmatch.desafios.desafio01;


//3 - Agora iremos trabalhar com serialização e desserialização. Para isso, você pode reaproveitar seu projeto do exercício 1.
// Adicione a dependência do Jackson ao seu pom.xml, pois iremos utilizá-la bastante nos próximos exercícios. Também crie uma classe Tarefa,
// com os seguintes atributos:

//public class Tarefa {
//    private String descricao;
//    private boolean concluida;
//    private String pessoaResponsavel;
//
//    // Construtores, getters e toString
//}

//Para que o Jackson funcione corretamente, é importante que sua classe tenha todos os getters e um construtor padrão.
// Também é legal criar um método toString().

// As dependencias encontra-se no arquivo pom.xml

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private String pessoaResponsavel;


    public Tarefa(){}


    public String getDescricao() {
        return descricao;
    }


    public boolean isConcluida() {
        return concluida;
    }


    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }


    public Tarefa(String descricao, boolean concluida, String pessoaResponsavel) {
        this.descricao = descricao;
        this.concluida = concluida;
        this.pessoaResponsavel = pessoaResponsavel;
    }


    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                ", pessoaResponsavel='" + pessoaResponsavel + '\'' +
                '}';
    }

}
