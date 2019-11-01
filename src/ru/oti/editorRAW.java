package ru.oti;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class editorRAW {

    public static void main(String[] args) throws IOException {
        // write your code here
        String line;

        File file = new File("D:\\Project\\Java\\Editor\\src\\ru\\oti\\Files\\test.xmp");
        Scanner scanner = new Scanner(file);

        File MyFile = new File("D:\\Project\\Java\\Editor\\src\\ru\\oti\\test.xmp");
        PrintWriter pw = new PrintWriter(MyFile);

        System.out.println("Начала работы. Пожалуйста, подождите...");

        while (scanner.hasNextLine()){
            line = scanner.nextLine();

            int end = line.indexOf('=');
            int start = line.indexOf(':') + 1;

            if(start > 0 && end > 0){

                String strExposure = line.substring(start, end);
                String valueExposure = line.substring(line.indexOf('=') + 2,  line.length() - 1);

                if("Exposure2012".equals(strExposure)){
                    // увеличиваем значение экспозиции на 0,5
                    Double value = Double.parseDouble(valueExposure) + 0.5;
                    pw.print("   crs:Exposure2012=\"" + value +"\"\n");
                } else {
                    pw.println(line);
                }
            } else {
                pw.println(line);
            }

        }

        pw.close();
        scanner.close();

        System.out.println("Результат работы программы записан в test.xmp");

    }
}