package com.udacity.jwdnd.course1.cloudstorage.services;

import com.udacity.jwdnd.course1.cloudstorage.mapper.FileMapper;
import com.udacity.jwdnd.course1.cloudstorage.mapper.UserMapper;
import com.udacity.jwdnd.course1.cloudstorage.model.File;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;

@Service
public class FileService {
    private final UserMapper userMapper;
    private final FileMapper fileMapper;

    // Using which "databases"
    public FileService (UserMapper userMapper, FileMapper fileMapper) {
        this.userMapper = userMapper;
        this.fileMapper = fileMapper;
    }

    public List<String> getAllFileNames(Integer userId) {
        return fileMapper.getAllFileNames(userId);
    }

    public File getFile(String fileName) {
        return fileMapper.getFile(fileName);
    }

    public void deleteFile(String fileName) {
        fileMapper.deleteFile(fileName);
    }

}
