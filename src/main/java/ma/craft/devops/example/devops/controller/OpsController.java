package ma.craft.devops.example.devops.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OpsController {

   @RequestMapping("/")
   public @ResponseBody String greeting() {
        return "Ops is On";
    }
}
