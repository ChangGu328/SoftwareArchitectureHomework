package cn.xmu.changgu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {
    private GreetingService greetingService;

    // 依赖注入通过构造函数
    @Autowired
    public Client(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void execute() {
        System.out.println(greetingService.greet("World"));
    }
}
