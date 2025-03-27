package org.codexdei.files.service;

import java.io.*;
import java.util.Scanner;

public class FileService {

    public void createFile(String name){

        File file = new File(name);

        //Al colocarlo entre parentesis en el try, no se necesita el 'close', por ello esta comentado
        try(BufferedWriter buffer = new BufferedWriter(new FileWriter(file,true))) {
            //agregando contenido al archivo
            //se coloca '\n' para que haga saltos de linea dentro del archivo
            buffer.append("Como sigues cariño?\n")
                    .append("Te amo\n");

            //buffer.close();
            System.out.println("File created successfully!!!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createFile2(String name){

        File file = new File(name);

        //Al colocarlo entre parentesis en el try, no se necesita el 'close', por ello esta comentado
        try(PrintWriter buffer = new PrintWriter(new FileWriter(file,true))) {
            //agregando contenido al archivo
            //se coloca '\n' para que haga saltos de linea dentro del archivo
            buffer.println("HOLA MUNDO!!!!!!\n");
            buffer.println("BIEN O QUE?\n");

            //buffer.close();
            System.out.println("File created successfully!!!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFile(String name){

        StringBuilder sb = new StringBuilder();

        File file = new File(name);

        try(BufferedReader buffer = new BufferedReader(new FileReader(file))) {

            String line;

            while ( (line = buffer.readLine()) != null){

                sb.append(line).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public String readFile2(String name){

        StringBuilder sb = new StringBuilder();

        File file = new File(name);

        try(Scanner sc = new Scanner(file)) {

            while ( sc.hasNext() ){

                sb.append(sc.next()).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
