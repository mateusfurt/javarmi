package com.chamados.mateus.chamados.controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {
	
	@GetMapping
	public String olamundo() {
		String linha = "";
		try {
            File arquivo = new File("C:/Users/mateu/Documents/vscode/java/rmi/resultado.txt"); // Substitua com o caminho correto do seu arquivo
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            linha = br.readLine();

            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return linha;
	}

}
