package pers.talkshow;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class TalkshowApplication {

    public static void main(String[] args) {
        SpringApplication.run(TalkshowApplication.class, args);
        log.info("talk-show setup success");
    }

}
