package springmvc;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
@Controller  
public class Welcome {  
    @RequestMapping("/welcome")  
    public ModelAndView helloWorld() {  
        String message = "Welcome";  
        return new ModelAndView("welcomepage", "message", message);  
    }  
}