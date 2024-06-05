package ma.newserver.githubcicdactions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class api {


    @GetMapping("hello")
    public String index() {
        return "Hello hamza";
    }
}
