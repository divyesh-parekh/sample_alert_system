package hello.controller;

import hello.apimodel.AlertRequest;
import hello.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@RequestMapping(path = "/alert")
public class AlertController {

    @Autowired
    AlertService alertService;

    @PostMapping("/triggerAlter")
    public void triggerAlert(@RequestBody AlertRequest request) {
        alertService.triggerAlert(request);
    }

}
