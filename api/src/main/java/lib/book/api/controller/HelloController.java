package lib.book.api.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("HelloWord")
public class HelloController {

    @GetMapping
    public String hello(){
        return "Hello World🗺️";
    }
}
