package ru.oti;

import java.io.*;
import java.util.Scanner;


public class editorRAW {



    public static void main(String[] args) throws IOException {
	// write your code here
        String line;
        int v;

        File file = new File("D:\\Project\\Java\\Editor\\src\\ru\\oti\\Files\\test.xmp");
        Scanner scanner = new Scanner(file);
        FileWriter write = new FileWriter("D:\\Project\\Java\\Editor\\src\\ru\\oti\\Files\\test.xmp");


        while (scanner.hasNextLine()){
            line = scanner.nextLine();
            String strExposureMode = line.substring(line.indexOf(':')+1, line.indexOf('='));
            String valueExposureMode = line.substring(line.indexOf('=') + 2,  line.length()-1);

            if("ExposureMode".equals(strExposureMode)){
                System.out.println("String: " + strExposureMode + "\t" + "Value: " + valueExposureMode);
                v = Integer.parseInt(valueExposureMode);
                write.write("exif:ExposureMode=\"-1\"");
                write.close();
                System.out.println("Integer value my Exp = : " + v);
//                break;
            }

            write.write("line");

        }

        scanner.close();
    }
}
