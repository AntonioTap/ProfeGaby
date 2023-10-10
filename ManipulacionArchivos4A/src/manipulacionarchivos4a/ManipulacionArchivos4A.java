/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipulacionarchivos4a;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Estudiante
 */
public class ManipulacionArchivos4A {

    public static int countFileLines(String name) {
        File archivo; // Apunta a un archivo fisico de dd
        FileReader reader; // Llave con permiso de solo lectura
        BufferedReader bufer; // Recuperar info. del archivo

        int numLineas = 0;
        try {
            archivo = new File("C:\\archivos\\" + name + ".txt");
            reader = new FileReader(archivo);
            bufer = new BufferedReader(reader);
            //Contar las lineas que contiene del archivo
            while (( bufer.readLine()) != null) {
                numLineas++;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo:" + e.toString());
        }
                return numLineas;

    }

    public static String[] fileToStringArray(String name) throws FileNotFoundException, IOException {
        File archivo; // Apunta a un archivo fisico de dd
        FileReader reader; // Llave con permiso de solo lectura
        BufferedReader bufer; // Recuperar info. del archivo
        String linea;
        String [] array = null ;
        int t;
        int i = 0;
        

        try {
            // Obtenemos el tamaño del archivo
            t= countFileLines(name);
            
            array = new String[t];
            //Craer un apuntador al archivo fisico
            archivo = new File("C:\\Users\\Estudiante\\Documents\\" + name + ".txt");
            // Abrir el archivo para lectura
            reader = new FileReader(archivo);
            //Configurar el bufer para leer datos del archivo
            bufer = new BufferedReader(reader);
            //Lectura del contenido del archivo
            while ((linea = bufer.readLine()) != null) {
                //System.out.println("Linea leida:" + linea);
                
                array[i] = linea;
                i++;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo:" + e.toString());
        }
        
        return array;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader bufer = new BufferedReader(
                new InputStreamReader(System.in));
        String fileName;
        String[] mascotas;
        
        System.out.println("Lectura de un archivo de texto");
        System.out.println(x:"Escribe el nombre del archivo:");
        fileName = bufer.readLine();
        mascotas = fileToStringArray(fileName);
        System.out.println(x:"Contenido del arreglo de mascotas: ");
        for ( String unaMascota : mascotas){
            System.out.println("UnaMacota");
        }
        
    }

}
