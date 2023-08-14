package org.example.Comparator.fileReader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CsvReader {

    public static List<CSVRecord> GetCsvRecords(String fileName){

        try {
            BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(fileName));

            return CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(bufferedReader).getRecords();
        } catch (IOException e) {
            System.out.println(e.getMessage() + " Not found");

        }

        return null;
    }

    public static void compareFiles(CSVRecord recordOne, List<CSVRecord> recordTwo){

        int recordMatches = 0;
        int recordNoMatches = 0;
        for(CSVRecord record : recordTwo){

            if(record.equals(recordOne)){
                recordMatches += 1;
            }else{

            }
        }
    }
}
