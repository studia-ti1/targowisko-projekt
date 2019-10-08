package pl.weeia.targowisko.targowisko.web.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldTestController {
    @RequestMapping("/test")
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }
}