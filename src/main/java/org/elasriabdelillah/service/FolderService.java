package org.elasriabdelillah.service;

import org.elasriabdelillah.Dao.impl.FolderDao;
import org.elasriabdelillah.entity.Folder;

import java.util.List;

public class FolderService {
    private FolderDao folderDao;
    public FolderService(FolderDao folderDao){
        this.folderDao = folderDao;
    }
    public Folder createFolder(Folder folder){
        return folderDao.save(folder);
    }
    public Folder update(Folder folder,int id){
        Folder existingFolder = folderDao.getOne(id);
//        existingFolder.setName(folder.getName());
//        existingFolder.setDepositDate(folder.getDepositDate());
        existingFolder.setFolderStatus(folder.getFolderStatus());

        folderDao.update(existingFolder);
        return existingFolder;
    }
    public Folder getFolderById(int id){
        Folder folder = folderDao.getOne(id);
        return folder;
    }
    public List<Folder> getAllFolders(){
        return folderDao.getAll();
    }
}
