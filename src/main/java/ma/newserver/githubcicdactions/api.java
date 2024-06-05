package ma.newserver.githubcicdactions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class api {


    @GetMapping("/hello")
    public String welcome(){
        return "Hamza lwa3err is here on the server li dwa ndih lblyssa";
    }

}
