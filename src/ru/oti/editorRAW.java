package ru.oti;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class editorRAW {



    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        String line;
        String x = "ExposureMode";

        File file = new File("C:\\Users\\User\\Desktop\\IMG_5425.xmp");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            line = scanner.nextLine();
            int start = line.indexOf(':');
            int end = line.indexOf('=');
            String str = line.substring(start+1, end);
           
            if("ExposureMode".equals(str)){
                System.out.printf("String: " + str + "\n");
                break;
            }

        }

        scanner.close();
    }
}
