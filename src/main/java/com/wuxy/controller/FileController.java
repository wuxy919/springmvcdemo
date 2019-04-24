package com.wuxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: wuxy
 * @create: 2019-04-23 18:45
 **/
@Controller
public class FileController {

    @PostMapping("/upload")
    public String upload(@RequestParam("img") MultipartFile multipartFile, HttpServletRequest request) {
        if (multipartFile.getSize() > 0) {
            String path = request.getSession().getServletContext().getRealPath("file");
            String fileName = multipartFile.getOriginalFilename();
            File file = new File(path, fileName);
            try {
                multipartFile.transferTo(file);
                // 保存上传之后的文件路径
                request.setAttribute("filePath", "file/" + fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "upload";
    }

    @PostMapping("uploads")
    public String uploads(@RequestParam("img") MultipartFile[] multipartFiles,HttpServletRequest request){
        List<String> filePaths = new ArrayList<>();
        for (MultipartFile multipartFile:multipartFiles){
            if(multipartFile.getSize()>0){
                String path = request.getServletContext().getRealPath("file");
                String fileName = multipartFile.getOriginalFilename();
                File file = new File(path,fileName);
                try {
                    multipartFile.transferTo(file);
                    filePaths.add("file/"+fileName);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        request.setAttribute("filePaths",filePaths);
        return "uploads";
    }


}
