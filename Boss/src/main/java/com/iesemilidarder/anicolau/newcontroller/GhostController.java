package com.iesemilidarder.anicolau.newcontroller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GhostController {

    @RequestMapping("/getAll")
    public String getAll() {

        return "index";
    }

}

/*Alliners PowaH**/