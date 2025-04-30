package br.com.alura.screenmatch.desafio01;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.Scanner;

//    1 - Crie um novo projeto com Spring Boot, usando o site start.spring.io.
//    Esse projeto será o contador, e funcionará na linha de comando. Você deve pedir para um usuário digitar um número e depois imprimir na tela
//    uma contagem de 1 até o número digitado pelo usuário.
//    Por exemplo, se o usuário digitar 5, deve aparecer no terminal 1 2 3 4 5 .

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

    public static void main(String[] args) {
        // SpringApplication.run(ContadorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Bem vindo ao contador!");
        System.out.println("----------------------");
        System.out.println("Digite um número para contagem: ");
        Scanner entrada = new Scanner(System.in);
        var numero = entrada.nextInt();

        for(int i = 1; i<=numero; i++){
            System.out.print(i + " ");
        }

        // 4 - Lembre-se: serializar um objeto é conseguir representá-lo de alguma forma em um arquivo.
        // Aqui, você deve instanciar um objeto do tipo Tarefa e fazer com que o conteúdo do objeto vá para o arquivo tarefa.json.
        // Para isso, utilize o Jackson para te auxiliar na tarefa. Observação: para criar novos arquivos, podemos utilizar new File("tarefa.json").
        Tarefa tarefa = new Tarefa("assistir aula 1", false, "João");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("tarefa.json"), tarefa);
        System.out.println("Dados salvos no arquivo tarefa.json!");

        // 5 - Agora, você fará o oposto da atividade anterior: a desserialização de um arquivo, que é ler os valores de um arquivo específico e
        // transformar em um objeto. Leia o conteúdo do arquivo tarefa.json, produzido no exercício anterior,
        // e o transforme em um objeto do tipo Tarefa. Exiba o conteúdo do objeto na tela.
        ObjectMapper objectMapper2 = new ObjectMapper();
        Tarefa tarefaLida = objectMapper2.readValue(new File("tarefa.json"), Tarefa.class);
        System.out.println("Tarefa lida do JSON:");
        System.out.println(tarefaLida);
    }
}


//    2 - Suponha que decidimos mudar de ideia e utilizar novamente a biblioteca Gson no nosso projeto ScreenMatch.
//    Agora que estamos trabalhando com o Maven, os passos para adicionar a biblioteca são diferentes do que já foi feito antes.
//    Explique quais passos você iria realizar nesse caso.

//    A dependencia encontra-se no arquivo pom.xml
