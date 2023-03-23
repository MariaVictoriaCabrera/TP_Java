package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String rutaArchivo1 = "C:\\Users\\victo\\IdeaProjects\\TP_Entrega1_Grupo9\\src\\resultados.csv";

        for (String linea : Files.readAllLines(Paths.get(rutaArchivo1))) {

            System.out.println(linea);
        }
    }
}