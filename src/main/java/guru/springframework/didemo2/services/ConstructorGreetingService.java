package guru.springframework.didemo2.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected vis the constructor!!!";
    }
}
