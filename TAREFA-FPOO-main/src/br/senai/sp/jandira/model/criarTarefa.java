package br.senai.sp.jandira.model;


import java.util.Scanner;

public class criarTarefa {


    public String titulo, descricao, data, status;

    public void criarTarefa() {


        Scanner teclado = new Scanner(System.in);

        System.out.println("Nome da Tarefa: ");
        titulo = teclado.nextLine();
        System.out.println("Descrição da Tarefa: ");
        descricao = teclado.nextLine();
        System.out.println("Data de vencimento da Tarefa: ");
         data = teclado.nextLine();
        System.out.println("Status da Tarefa (Concluída ou Pendente): ");
         status = teclado.nextLine();

        System.out.println("------------ TAREFA ------------");
        System.out.println("Nome: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data: " + data);
        System.out.println("Status: " + status);


    }
}
