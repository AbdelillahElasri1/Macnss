package org.elasriabdelillah.entity;

import org.elasriabdelillah.Enum.FolderStatus;

import java.util.Date;

public class Folder {
    private int id;
    private String name;
    private Date depositDate;
    private FolderStatus folderStatus;

    public Folder(int id, String name, Date depositDate, FolderStatus folderStatus) {
        this.id = id;
        this.name = name;
        this.depositDate = depositDate;
        this.folderStatus = folderStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(Date depositDate) {
        this.depositDate = depositDate;
    }

    public FolderStatus getFolderStatus() {
        return folderStatus;
    }

    public void setFolderStatus(FolderStatus folderStatus) {
        this.folderStatus = folderStatus;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "id=" + id +
                ",name=" + name+
                ", depositDate=" + depositDate +
                ", folderStatus=" + folderStatus +
                '}';
    }
}
