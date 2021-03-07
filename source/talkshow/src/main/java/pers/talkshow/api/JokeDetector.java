package pers.talkshow.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("detector")
public class JokeDetector {

    @GetMapping("/h")
    public String helloWorld() {
        return "hello world";
    }

}
