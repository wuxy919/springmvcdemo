package com.wuxy.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
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

    @PostMapping("/uploads")
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

    @GetMapping("/download")
    public void downloadFile(String fileName, HttpServletRequest request, HttpServletResponse response) {
        if (fileName != null) {
            String path = request.getServletContext().getRealPath("file");
            File file = new File(path, fileName);
            OutputStream os = null;
            if (file.exists()) {
                // 设置下载文件
                response.setContentType("application/force-download");
                // 设置文件名
                response.setHeader("content-Disposition", "attachment;filename=" + fileName);
                try {
                    os = response.getOutputStream();
                    os.write(FileUtils.readFileToByteArray(file));
                    os.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        os.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


}
