package com.arvind.basics.fundamentals;

import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.IOException;

public class Files {

    public static void main(String[] args) throws IOException {

        File file = new File("arvind.txt");
        FileImageInputStream fis = new FileImageInputStream(file);
        int data = fis.read();
        System.out.println(data);
        fis.close();

    }
}
