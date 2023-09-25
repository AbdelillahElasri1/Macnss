package org.elasriabdelillah.entity;

import org.elasriabdelillah.Enum.DocumentStatus;

import java.util.Date;

public class Scanner {
    private int id;
    private Date scannerDate;
    private DocumentStatus documentStatus;
    private String results;

    public Scanner(int id, Date scannerDate, DocumentStatus documentStatus, String results) {
        this.id = id;
        this.scannerDate = scannerDate;
        this.documentStatus = documentStatus;
        this.results = results;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getScannerDate() {
        return scannerDate;
    }

    public void setScannerDate(Date scannerDate) {
        this.scannerDate = scannerDate;
    }

    public DocumentStatus getScannerType() {
        return documentStatus;
    }

    public void setScannerType(DocumentStatus documentStatus) {
        this.documentStatus = documentStatus;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Scanner{" +
                "id=" + id +
                ", scannerDate=" + scannerDate +
                ", scannerType=" + documentStatus +
                ", results='" + results + '\'' +
                '}';
    }
}
