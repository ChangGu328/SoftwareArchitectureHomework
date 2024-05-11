package cn.xmu.changgu;

import org.springframework.stereotype.Component;

@Component
public class SimpleGreetingService implements GreetingService{
    @Override
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
