package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.services.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

@Controller
@RequestMapping("/home/file-upload")
public class FileController {

    private final FileService fileService;
    private final UserService userService;
    private final NoteService noteService;
    private final EncryptionService encryptionService;
    private final CredentialService credentialService;

    public FileController(FileService fileService, UserService userService, NoteService noteService, EncryptionService encryptionService, CredentialService credentialService) {
        this.fileService = fileService;
        this.userService = userService;
        this.noteService = noteService;
        this.encryptionService = encryptionService;
        this.credentialService = credentialService;
    }

    @GetMapping()
    public String homepageView() {
        return "home";
    }

//    @PostMapping("/file-upload")
//    public String handleFileUpload(@RequestParam("fileUpload") MultipartFile fileUpload, Model model) {
//        InputStream fis = fileUpload.getInputStream();
//    }
}
