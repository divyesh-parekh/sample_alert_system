package hello.service;

import hello.apimodel.AddDeveloperRequest;
import hello.apimodel.AddDeveloperResponse;
import hello.model.Developer;
import hello.model.Team;
import hello.repository.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
public class DeveloperCommandService {

    @Autowired
    DeveloperRepository developerRepository;

    @Autowired
    TeamQueryService teamQueryService;

    public AddDeveloperResponse addDeveloper(AddDeveloperRequest request) {
        Developer dev = developerRepository.findByNumber(request.getNumber());
        if (dev != null) {
            throw new RuntimeException("Developer Already Exist");
        }
        Team team = teamQueryService.getTeamById(request.getTeamId());
        if (team == null) {
            throw new RuntimeException("Team not found");
        }
        dev = developerRepository.save(new Developer(request, team));

        return new AddDeveloperResponse(dev, team);
    }

}
