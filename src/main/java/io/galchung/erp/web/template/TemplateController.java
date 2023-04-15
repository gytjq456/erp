package io.galchung.erp.web.template;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/template")
@Controller
public class TemplateController {

    @GetMapping("/fragment")
    public String template(){
        return "template/fragment/fragmentMain";
    }


    @GetMapping("/layout")
    public String layout(){
        return "template/layout/layoutMain";

    }


    @GetMapping("/layoutExtend")
    public String layoutExtend(){
        return "template/layoutExtend/layoutExtendMain";
    }

}
