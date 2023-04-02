package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {

        String rutaResultados = "C:\\Users\\victo\\IdeaProjects\\TP_Entrega1_Grupo9\\src\\resultados.csv";

        String[] fileResultados = Files.readAllLines(Paths.get(rutaResultados)).toArray(new String[0]);

        for (String lineas : fileResultados) {
            System.out.println(lineas);
        }




        String[] renglon1Resultados = fileResultados[0].split(";");
        String[] renglon2Resultados = fileResultados[1].split(";");

        System.out.println(renglon2Resultados[1]);

       /* int id1= Integer.parseInt(renglon2Resultados[0]);
        String nombre1= renglon2Resultados[1];
        String descripcion1= renglon2Resultados[2];

        Equipo equipo1= new Equipo(id1, renglon2Resultados[1], renglon2Resultados[2]);*/


    }
    }
