package com.stackroute.example.file;
import java.io.FileOutputStream;

import static java.lang.System.*;

public class FileOutputStreamClass {
    public static void main(String args[]) {
        try {
            try (FileOutputStream fout = new FileOutputStream("..//output.txt")) {
                String s = "welcome user.example of file output stream";
                byte b[] = s.getBytes();//converting string into byte array
                fout.write(b);
                fout.close();
            }
            out.println("success...");
        } catch (Exception e) {
            out.println(e);
        }

    }
}
