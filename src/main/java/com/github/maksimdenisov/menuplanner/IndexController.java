package com.github.maksimdenisov.menuplanner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @RequestMapping("")
    public String index(@RequestParam(value = "msg", required = false) String message, ModelMap model) {
        if (message == null)
            message = "";
        model.put("msg", message);
        return "index";
    }
}
