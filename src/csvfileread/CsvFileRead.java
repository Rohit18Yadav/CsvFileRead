/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvfileread;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author theRht
 */
public class CsvFileRead {

    /**
     * @param args the command line arguments
     */
    public void readCsvFile() throws IOException
    {
        String path="src/CsvFiles/matches.csv";
        
        File file = new File(path);

        List<String> lines = Files.readAllLines(file.toPath(), 
                StandardCharsets.UTF_8);

        System.out.println("YEAR\tTOSS_DECISION\t\tTEAM");
        for (String line : lines)
        {
            String[] array = line.split(",", -1);
            if((array[1].equals("2017") || array[1].equals("2016")) && array[7].equals("field"))
                System.out.println(array[1]+"\t"+array[7]+"\t\t\t"+array[6]);
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        CsvFileRead xfr=new CsvFileRead();
        try {
                System.out.println("Try to reading matches file........");
                xfr.readCsvFile();
                System.out.println("***** Thank You! *****");
        } catch (Exception e) {
            System.out.println("Exception durring calling readXLSXFile() : "+e);
        }
        
        
    }
    
}
