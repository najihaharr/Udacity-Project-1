package com.udacity.jwdnd.course1.cloudstorage.model;

public class File {
    private Integer fileId;
    private String fileName;
    private Integer userId;

    public File(Integer fileId, String fileName, Integer userId) {
        this.fileId = fileId;
        this.fileName = fileName;
        this.userId = userId;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


}
