package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        String rutaResultados = "C:\\Users\\victo\\IdeaProjects\\TP_Entrega1_Grupo9\\src\\resultados.csv";

        List <String> fileResultado = new ArrayList<>();
        fileResultado = Files.readAllLines(Paths.get(rutaResultados));

        //PARA IMPRIMIR TODO
//        Iterator <String> it= fileResultado.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        //PARA IMPRIMIR UN SOLO RENGLON
//        System.out.println(fileResultado.get(2));

        List <String> renglon1Resultados = List.of(fileResultado.get(0).split(";"));
        Iterator <String> it2= renglon1Resultados.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        List <String> renglon2Resultados = List.of(fileResultado.get(1).split(";"));
        Iterator <String> it3= renglon2Resultados.iterator();
        while(it3.hasNext()){
            System.out.println(it3.next());
        }
        List <String> renglon3Resultados = List.of(fileResultado.get(2).split(";"));
        Iterator <String> it4= renglon3Resultados.iterator();
        while(it4.hasNext()){
            System.out.println(it4.next());
        }


        int id1= Integer.parseInt(renglon2Resultados.get(0));
        String nombre1= renglon2Resultados.get(1);
        String descripcion1= renglon2Resultados.get(2);
        int golesEquipoN1=Integer.parseInt(renglon2Resultados.get(3));

        Equipo equipo1 = new Equipo(id1, nombre1, descripcion1);


        int id2 = Integer.parseInt(renglon2Resultados.get(5));
        String nombre2 = renglon2Resultados.get(6);
        String descripcion2 = renglon2Resultados.get(7);
        int golesEquipoN2 = Integer.parseInt(renglon2Resultados.get(4));

        Equipo equipo2 = new Equipo(id2, nombre2, descripcion2);


        int id3 = Integer.parseInt(renglon3Resultados.get(0));
        String nombre3 = renglon3Resultados.get(1);
        String descripcion3 = renglon3Resultados.get(2);
        int golesEquipoN3 = Integer.parseInt(renglon3Resultados.get(3));

        Equipo equipo3 = new Equipo(id3, nombre3, descripcion3);


        int id4 = Integer.parseInt(renglon3Resultados.get(5));
        String nombre4 = renglon3Resultados.get(6);
        String descripcion4 = renglon3Resultados.get(7);
        int golesEquipoN4 = Integer.parseInt(renglon3Resultados.get(4));

        Equipo equipo4 = new Equipo(id4, nombre4, descripcion4);


        Partido partido1 = new Partido(equipo1,equipo2,golesEquipoN1,golesEquipoN2);
//        System.out.println(partido1.devolverDatos());
        Partido partido2 = new Partido(equipo3, equipo4, golesEquipoN3, golesEquipoN4);
//        System.out.println(partido2.devolverDatos());


    }
    }
