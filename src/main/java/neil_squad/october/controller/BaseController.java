package neil_squad.october.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @ResponseBody
    @RequestMapping("/show")
    public String show(){
        return "hello";
    }
}
