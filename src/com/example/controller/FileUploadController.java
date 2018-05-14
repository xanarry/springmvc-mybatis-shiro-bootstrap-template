package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Part;
import java.io.*;

@Controller
@RequestMapping("/file-upload")
public class FileUploadController {
    @GetMapping
    public String getPage() {
        return "fileUpload";
    }

    @PostMapping
    @ResponseBody
    public String upload(Part image, Part file) {
        if (writeFile(image) && writeFile(file)) {
            return "上传成功";
        } else {
            return "上传失败";
        }
    }

    private boolean writeFile(Part part) {
        try {
            InputStream inputStream = part.getInputStream();
            String path = "/home/xanarry/Desktop/" + part.getSubmittedFileName();
            OutputStream outputStream = new FileOutputStream(new File(path));
            byte[] buff = new byte[4096];
            while (inputStream.read(buff) > 0) {
                outputStream.write(buff);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
