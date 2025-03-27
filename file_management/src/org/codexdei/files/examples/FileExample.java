package org.codexdei.files.examples;

import org.codexdei.files.service.FileService;

public class FileExample {

    public static void main(String[] args) {

        String nameFile = "C:\\REPOSITORIO_FAM\\JAVA_REPOSITORIO\\PRUEBA/ARCHIVOS\\Te_amo_corazon.txt";
        String nameFile2 = "C:\\REPOSITORIO_FAM\\JAVA_REPOSITORIO\\PRUEBA/ARCHIVOS\\JAVA.txt";

        FileService fileService = new FileService();

        fileService.createFile(nameFile);
        fileService.createFile2(nameFile2);


        //usando readLine
        System.out.println(fileService.readFile(nameFile));
        System.out.println(fileService.readFile(nameFile2));
        //usando readLine2
        System.out.println("READLINE2");
        System.out.println(fileService.readFile2(nameFile2));
        System.out.println(fileService.readFile2(nameFile2));


    }
}
