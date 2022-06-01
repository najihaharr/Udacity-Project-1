package com.udacity.jwdnd.course1.cloudstorage.controller;


import com.udacity.jwdnd.course1.cloudstorage.services.UploadService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/home")
public class HomepageController {
    private final UploadService uploadService;

    public HomepageController(UploadService uploadService) {
        this.uploadService = uploadService;
    }
}
