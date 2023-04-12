package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class claseLeerCSV {

//    public static List<String[]> leerCSV(String ruta) {
//        List<String[]> lista = new ArrayList<>();
//        File archivo = new File(ruta);
//        try (Scanner scanner = new Scanner(archivo)) {
//            while (scanner.hasNextLine()) {
//                String linea = scanner.nextLine();
//                String[] datos = linea.split(";");
//                lista.add(datos);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        return lista;
//    }

    public static ArrayList<String[]> leerCsv(String fileRuta) {
        ArrayList<String[]> datos = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(fileRuta));
            while (scanner.hasNext()) {
                String linea = scanner.nextLine();
                String[] campos = new String[8];
                String[] camposOriginales = linea.split(";");
                for (int i = 0; i < campos.length && i < camposOriginales.length; i++) {
                    campos[i] = camposOriginales[i];
                }
                datos.add(campos);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return datos;
    }


}