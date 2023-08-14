package org.example.Comparator;

import org.apache.commons.csv.CSVRecord;
import org.example.Comparator.fileMonitor.FileMonitor;
import org.example.Comparator.fileReader.CsvReader;
import org.example.Comparator.inputData.InputData;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        String directoryPath = "./";
        List<Path> files = FileMonitor.listFilesInDirectory(directoryPath);
        List<InputData> fileData = new ArrayList<>();

//        InputData inputData = new InputData();

        for (Path file : files) {

            String fileName = file.getFileName().toString();
            System.out.println(file.getFileName());
            System.out.println("=======================");
            System.out.println(CsvReader.GetCsvRecords(fileName));

            fileData.add(new InputData(CsvReader.GetCsvRecords(fileName)));
        }

        for(InputData inputData: fileData){

            List<CSVRecord> record = inputData.getFileData();
            for(CSVRecord rec: record){
                System.out.println(rec);
            }
        }


        for()
        CsvReader.compareFiles();

    }
}