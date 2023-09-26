package org.elasriabdelillah.entity;

import org.elasriabdelillah.Enum.DocumentStatus;

import java.util.Date;

public class Radio {
    private int id;
    private Date radiosDate;
    private DocumentStatus documentStatus;
    private Float radio_taux;
    private Float radio_price;

    public Radio(int id, Date radiosDate, DocumentStatus documentStatus, Float radio_taux, Float radio_price, String results) {
        this.id = id;
        this.radiosDate = radiosDate;
        this.documentStatus = documentStatus;
        this.radio_taux = radio_taux;
        this.radio_price = radio_price;
        this.results = results;
    }

    public Float getRadio_taux() {
        return radio_taux;
    }

    public Float getRadio_price() {
        return radio_price;
    }

    public void setRadio_price(Float radio_price) {
        this.radio_price = radio_price;
    }

    public void setRadio_taux(Float radio_taux) {
        this.radio_taux = radio_taux;
    }

    private String results;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getRadiosDate() {
        return radiosDate;
    }

    public void setRadiosDate(Date radiosDate) {
        this.radiosDate = radiosDate;
    }

    public DocumentStatus getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(DocumentStatus documentStatus) {
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
        return "Radio{" +
                "id=" + id +
                ", radiosDate=" + radiosDate +
                ", documentStatus=" + documentStatus +
                ", radio_taux=" + radio_taux +
                ", radio_price=" + radio_price +
                ", results='" + results + '\'' +
                '}';
    }
}
