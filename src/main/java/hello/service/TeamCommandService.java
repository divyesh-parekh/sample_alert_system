package hello.service;

import hello.apimodel.AddTeamRequest;
import hello.apimodel.AddTeamResponse;
import hello.model.Team;
import hello.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamCommandService {

    @Autowired
    TeamRepository teamRepository;

    public AddTeamResponse addTeam(AddTeamRequest request) {
        Team team = teamRepository.findByName(request.getName());
        if (team != null) {
            throw new RuntimeException("Team already exist");
        }
        team = new Team(request);
        team = teamRepository.save(team);
        return new AddTeamResponse(team);
    }
}
