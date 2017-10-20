package guru.springframework.didemo2.controllers;

import guru.springframework.didemo2.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingServiceImpl greetingService;

    public PropertyInjectedController() {
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}


