package org.elasriabdelillah.entity;

import org.elasriabdelillah.Enum.DocumentStatus;

public class Medicament {
    private int id;
    private String name;
    private DocumentStatus documentStatus;
    private double price;
    private double taux;

    public Medicament(int id, String name, DocumentStatus documentStatus, double price, double taux) {
        this.id = id;
        this.name = name;
        this.documentStatus = documentStatus;
        this.price = price;
        this.taux = taux;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DocumentStatus getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(DocumentStatus documentStatus) {
        this.documentStatus = documentStatus;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", medicamentStatus=" + documentStatus +
                ", price=" + price +
                ", taux=" + taux +
                '}';
    }
}
