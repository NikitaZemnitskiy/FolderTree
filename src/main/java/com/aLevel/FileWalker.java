package com.aLevel;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class FileWalker {

    public void getAllFiles(Path path, Writer writer) throws IOException {

        File file = path.toFile();
        String[] fileList = file.list();
        for(String s:fileList){
            Path nextFile = Paths.get(file.getPath().toString()+"\\"+s);
            if ( nextFile.toFile().isDirectory()){
                writer.write(nextFile.getFileName());
                /*System.out.println(nextFile.getFileName());
                System.out.print(" ");*/
                getAllFiles(nextFile, writer);
            }
            else {
                 /*System.out.println(nextFile.getFileName());
                  */
                writer.write(nextFile.getFileName());
            }
        }
    }

}
