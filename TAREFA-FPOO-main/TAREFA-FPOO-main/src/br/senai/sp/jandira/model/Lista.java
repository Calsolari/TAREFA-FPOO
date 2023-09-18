package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    List <criarTarefa> Tarefa = new ArrayList<>();

    public void adicionarTarefas(criarTarefa tarefa){
        Tarefa.add(tarefa);


    }

    public void listarTarefas(){

        for (criarTarefa tarefa : Tarefa){
            System.out.println(tarefa.titulo);
        }
    }

}
