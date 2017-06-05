package com.ml.web;

import com.ml.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ArticleController {

    @RequestMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    @RequestMapping("/add")
    public String article(String article, Model model) {
        System.out.println(article);
        model.addAttribute("article", article);
        return "article";
    }

    @RequestMapping("/uploadImage")
    @ResponseBody
    public Result uploadImage(@RequestParam(name = "editormd-image-file") MultipartFile file) {
        System.out.println(file.getSize());
        return new Result(1,"提示的信息，上传成功或上传失败及错误信息等。","/static/editormd/images/loading.gif");
    }

}
