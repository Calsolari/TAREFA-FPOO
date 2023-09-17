package br.senai.sp.jandira.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class criarTarefa {



    public void criarTarefa() {


        String descricao, titulo, data;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Nome da Tarefa: ");
        titulo = teclado.nextLine();
        System.out.println("Descrição da Tarefa: ");
        descricao = teclado.nextLine();
        System.out.println("Data de vencimento da Tarefa: ");
        data = teclado.nextLine();

        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

        try {

            Date datanova = formatoData.parse(data);
            System.out.println("Data de vencimento : " + datanova);
        } catch (ParseException e) {
            System.out.println("Formato de data Invalido.");
        }

    }
}
