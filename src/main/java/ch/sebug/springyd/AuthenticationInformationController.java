package ch.sebug.springyd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class AuthenticationInformationController {
    @Value("${springyd.app_id}")
    private String appID;

    @GetMapping("/authInfo")
    public AuthenticationInformation authInfo() {
        System.out.println("Some information from the application properties: " + this.appID);
        return new AuthenticationInformation("anonymous", "Anonymous User");
    }
}