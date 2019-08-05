package com.stackroute.example.file;

import java.io.FileInputStream;

public class FileInputStreamClass {
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("..//output.txt");
            int i=0;
            while((i=fin.read())!=-1) {
                System.out.print((char) i);

            }
                fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
