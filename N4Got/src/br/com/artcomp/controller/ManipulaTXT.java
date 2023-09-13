/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author artco
 */
public class ManipulaTXT {

    public void existe() throws IOException {

        Path endereco = Paths.get("C:\\N4goTPass\\N4gotConf.txt");

        if (Files.exists(endereco)) {
            System.out.println("existe");
           // escritor("C:\\N4goTPass\\N4gotConf.txt");
            leitor("C:\\N4goTPass\\N4gotConf.txt");
        } else {
            System.out.println("não existe");
            criarTXT();
        }

    }

    public void criarTXT() {

        File arquivo = new File("C:\\N4goTPass\\N4gotConf.txt");

        try {
            arquivo.createNewFile();
            System.out.print("Arquivo criado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leitor(String path) throws IOException {

        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);

            } else {
                break;
            }
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    public void escritor(String path) throws IOException {

        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
    }
}
