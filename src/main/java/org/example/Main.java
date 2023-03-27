package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String rutaArchivo1 = "C:\\Users\\victo\\IdeaProjects\\TP_Entrega1_Grupo9\\src\\resultados.csv";

        String[] file = Files.readAllLines(Paths.get(rutaArchivo1)).toArray(new String[0]);

        String [] renglon1= file[0].split(";");

        System.out.println(renglon1[2]);
        }
    }
