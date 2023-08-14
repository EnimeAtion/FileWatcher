package org.example.Comparator.inputData;

import org.apache.commons.csv.CSVRecord;
import java.util.ArrayList;
import java.util.List;

public class InputData {

    public List<CSVRecord> getFileData() {
        return fileData;
    }

    public void setFileData(List<CSVRecord> Data) {
        this.fileData = Data;
    }

    public InputData(List<CSVRecord> fileData) {
        this.fileData = fileData;
    }

    private List<CSVRecord> fileData = new ArrayList<>();

}
