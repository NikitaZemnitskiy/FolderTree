package com.aLevel;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class Main {


    public static void main(String[] args) throws IOException {
       FileWalker fileWalker =  new FileWalker();
       Writer writerToFile = new WriterToFile(new File(args[1]));
       fileWalker.getAllFiles(Paths.get(args[0]), writerToFile);

    }
}

