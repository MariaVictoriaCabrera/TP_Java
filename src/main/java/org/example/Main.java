package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        String rutaResultados = "C:\\Users\\victo\\IdeaProjects\\TP_Entrega1_Grupo9\\src\\resultados.csv";

        List<String[]> datosResultados = claseLeerCSV.leerCsv(rutaResultados);

        // Imprimir los datos en la consola
        for (String[] fila : datosResultados) {
            for (String dato : fila) {
                System.out.println(dato);
            }
            System.out.println();
        }

        //imprimir dato en especifco (fila)[columna]
//        System.out.println(datosResultados.get(1)[0]);

        int id1 = Integer.parseInt(datosResultados.get(1)[0]);
        int golesEquipoN1 = Integer.parseInt(datosResultados.get(1)[3]);
        String nombre1 = datosResultados.get(1)[1];
        String descripcion1 = datosResultados.get(1)[2];
        Equipo equipo1 = new Equipo(id1, nombre1, descripcion1);

        int id2 = Integer.parseInt(datosResultados.get(1)[5]);
        int golesEquipoN2 = Integer.parseInt(datosResultados.get(1)[4]);
        String nombre2 = datosResultados.get(1)[6];
        String descripcion2 = datosResultados.get(1)[7];
        Equipo equipo2 = new Equipo(id2, nombre2, descripcion2);

        int id3 = Integer.parseInt(datosResultados.get(2)[0]);
        int golesEquipoN3 = Integer.parseInt(datosResultados.get(2)[3]);
        String nombre3 = datosResultados.get(2)[1];
        String descripcion3 = datosResultados.get(2)[2];
        Equipo equipo3 = new Equipo(id3, nombre3, descripcion3);

        int id4 = Integer.parseInt(datosResultados.get(2)[5]);
        int golesEquipoN4 = Integer.parseInt(datosResultados.get(2)[4]);
        String nombre4 = datosResultados.get(2)[6];
        String descripcion4 = datosResultados.get(2)[7];
        Equipo equipo4 = new Equipo(id4, nombre4, descripcion4);


        Partido partido1 = new Partido(equipo1, equipo2, golesEquipoN1, golesEquipoN2);
//        System.out.println(partido1.devolverDatos());
        Partido partido2 = new Partido(equipo3, equipo4, golesEquipoN3, golesEquipoN4);
//        System.out.println(partido2.devolverDatos());


        String rutaPronostico = "C:\\Users\\victo\\IdeaProjects\\TP_Entrega1_Grupo9\\src\\pronostico.csv";

        List<String[]> datosPronostico = claseLeerCSV.leerCsv(rutaPronostico);

        // Imprimir los datos en la consola
//        for (String[] fila : datosPronostico) {
//            for (String dato : fila) {
//                System.out.println(dato);
//            }
//            System.out.println();
//        }

        //imprimir dato en especifco (fila)[columna]
//        System.out.println(datosPronostico.get(1)[0]);

//        boolean primerRenglon = true;
//        for (String[] lineapronostico : datosPronostico){
//            int puntos=0;
//            for (String lineas : lineapronostico){
//                if (primerRenglon){
//                    primerRenglon=false;
//                }else{
//                    String[] datos = new String[5];
//                    datos=  lineas.split(";");
//                    Equipo equipo1P = new Equipo(datos[0]);
//                    Equipo equipo2P = new Equipo(datos[4]);
//
//                    Partido partido =null;
//                    if(equipo1P==equipo1 && equipo2P==equipo2){
//                    partido = partido1;
//                    }else { partido= partido2; }
//
//                    Equipo equipo = null;
//                    ResultadosEnum resultado = null;
//                    if ("X".equals(datos[1])){
//                        equipo = equipo1;
//                        resultado = ResultadosEnum.GANADOR;
//                    } else if ("X".equals(datos[2])){
//                        equipo=equipo1;
//                        resultado= ResultadosEnum.EMPATE;
//                    }else if("X".equals(datos[3])){
//                        equipo=equipo1;
//                        resultado= ResultadosEnum.PERDEDOR;
//
//                    }
//                    Pronostico pronostico = new Pronostico(partido,equipo,resultado);
//                    puntos = pronostico.puntos();
//                }
//            }
//            System.out.println(puntos);
//        }

        boolean primerRenglon = true;
        for (String[] fila : datosPronostico) {
            int puntos = 0;
            for (String dato : fila) {
                if (primerRenglon){
                    primerRenglon=false;
                }else{
                    List<String> listDatos= List.of(dato.split(";"));
                }
            }
            System.out.println();
//        }
        }
    }
}











