package pro.terv.server.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class ExampleController {

    @GetMapping("/example")
    public String exampleEndpoint() {
        return "This is an example endpoint.";
    }
}

