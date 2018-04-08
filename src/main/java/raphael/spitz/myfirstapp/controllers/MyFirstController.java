package raphael.spitz.myfirstapp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import raphael.spitz.myfirstapp.services.MyFirstService;

@Controller
public class MyFirstController {

    private final MyFirstService service;


    @Autowired
    public MyFirstController(MyFirstService service) {
        this.service = service;
    }


    @RequestMapping("/")
    public ResponseEntity simple(){
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping("/service")
    public @ResponseBody String neMwethod() {
        System.out.println("New method changes.");
        return  service.myServiceMethod();
    }


}
