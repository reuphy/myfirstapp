package raphael.spitz.myfirstapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class MyFirstController {

    @RequestMapping("/")
    public @ResponseBody String simple(){
        return "Hello.";
    }


}
