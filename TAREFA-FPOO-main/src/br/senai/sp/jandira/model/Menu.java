package br.senai.sp.jandira.model;

import br.senai.sp.jandira.model.criarTarefa;
import java.util.Scanner;

public class Menu {

    public void Menu(){

        Lista list = new Lista();
        criarTarefa tarefa = new criarTarefa();
        Scanner teclado = new Scanner(System.in);

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("-------------- Bem Vindo ---------------");
        System.out.println("Faça sua escolha:  ");
        System.out.println("[ 1 - Criar Tarefa  ]");
        System.out.println("[ 2 - Editar Tarefa  ]");
        System.out.println("[ 3 - Ver lista de Tarefas  ]");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

        int escolha = teclado.nextInt();



            switch (escolha){
                case 1:
                tarefa.criarTarefa();
                list.adicionarTarefas(tarefa);

                Menu();

                case 2:
                    break;

                case 3:
                    list.listarTarefas();
            }






    }

}
