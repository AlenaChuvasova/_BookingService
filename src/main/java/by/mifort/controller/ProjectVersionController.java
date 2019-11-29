package by.mifort.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectVersionController {

    @Value("${version}")
    private String version;

    @RequestMapping(value = "/version", method = RequestMethod.GET,
            produces = "application/json")
    public String getVersion() {
        return "{\"version\":" + version + "}";
    }
}
