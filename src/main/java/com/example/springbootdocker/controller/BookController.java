import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    
    @GetMapping("/")
    public String book() {
        return "Hello, Book!";
    }

    @GetMapping("/test")
    public String test() {
        return "Hello, Test!";
    }
}
