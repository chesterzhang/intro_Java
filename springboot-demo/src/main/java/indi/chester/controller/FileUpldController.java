package indi.chester.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
public class FileUpldController {
    @PostMapping("upload")
    public String upload(MultipartFile file) throws Exception {
        file.transferTo(new File("D:\\intro_Java\\picture\\springbooy-demo\\" + file.getOriginalFilename()));
        return "上传成功";
    }
}
