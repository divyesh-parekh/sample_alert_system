package hello.service;

import hello.model.Team;
import hello.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamQueryService {

    @Autowired
    TeamRepository teamRepository;

    public Team getTeamById(Integer id) {
        return teamRepository.findById(id).orElse(null);
    }

}
