package ch.sebug.springyd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationInformationController {
    @GetMapping("/authInfo")
    public AuthenticationInformation authInfo() {
        return new AuthenticationInformation("anonymous", "Anonymous User");
    }
}