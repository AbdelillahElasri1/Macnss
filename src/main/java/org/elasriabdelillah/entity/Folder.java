package org.elasriabdelillah.entity;

import org.elasriabdelillah.Enum.FolderStatus;

import java.util.Date;

public class Folder {
    private int id;
    private Date depositDate;
    private FolderStatus folderStatus;

    public Folder(int id, Date depositDate, FolderStatus folderStatus) {
        this.id = id;
        this.depositDate = depositDate;
        this.folderStatus = folderStatus;
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
                ", depositDate=" + depositDate +
                ", folderStatus=" + folderStatus +
                '}';
    }
}
