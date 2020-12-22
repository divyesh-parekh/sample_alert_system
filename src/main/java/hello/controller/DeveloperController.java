package hello.controller;

import hello.apimodel.AddDeveloperRequest;
import hello.apimodel.AddDeveloperResponse;
import hello.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@RequestMapping(path = "/developer")
public class DeveloperController {

    @Autowired
    DeveloperCommandService developerCommandService;

    @PostMapping("/add")
    public AddDeveloperResponse addDeveloper(@RequestBody AddDeveloperRequest request) {
        return developerCommandService.addDeveloper(request);
    }
}
