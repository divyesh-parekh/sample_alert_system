package hello.controller;

import hello.apimodel.AddTeamRequest;
import hello.apimodel.AddTeamResponse;
import hello.service.TeamCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/team")
public class TeamController {

    @Autowired
    TeamCommandService teamCommandService;

    @PostMapping("/add")
    public AddTeamResponse addTeam(@RequestBody AddTeamRequest addTeamRequest) {
        return teamCommandService.addTeam(addTeamRequest);
    }

}
