package org.elasriabdelillah.entity;

import org.elasriabdelillah.Enum.DocumentStatus;

import java.util.Date;

public class Scanner {
    private int id;
    private Date scannerDate;
    private DocumentStatus documentStatus;
    private Float scanner_taux;
    private Float scanner_price;
    private String results;

    public Scanner(int id, Date scannerDate, DocumentStatus documentStatus,Float scanner_taux,Float scanner_price, String results) {
        this.id = id;
        this.scannerDate = scannerDate;
        this.documentStatus = documentStatus;
        this.scanner_taux = scanner_taux;
        this.scanner_price = scanner_price;
        this.results = results;
    }

    public int getId() {
        return id;
    }

    public DocumentStatus getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(DocumentStatus documentStatus) {
        this.documentStatus = documentStatus;
    }

    public Float getScanner_taux() {
        return scanner_taux;
    }

    public void setScanner_taux(Float scanner_taux) {
        this.scanner_taux = scanner_taux;
    }

    public Float getScanner_price() {
        return scanner_price;
    }

    public void setScanner_price(Float scanner_price) {
        this.scanner_price = scanner_price;
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
                ", scanner_taux=" + scanner_taux +
                ", scanner_price=" + scanner_price +
                ", results='" + results + '\'' +
                '}';
    }
}
