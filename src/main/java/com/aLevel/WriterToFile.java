package com.aLevel;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriterToFile implements Writer  {
File outputfile;


    public WriterToFile(File outPutfile) {
        this.outputfile = outPutfile;
    }

    @Override
    public void write(File file)  {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(outputfile);
            fileWriter.write(file.getName());
        }
        catch(IOException e){
            System.out.println("FileNotFound");
        }

    }
}
