package hello.service;

import hello.apimodel.AlertRequest;
import hello.model.Developer;
import hello.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertService {

    @Autowired
    TeamQueryService teamQueryService;

    public void triggerAlert(AlertRequest request) {
        Team team = teamQueryService.getTeamById(request.getTeamId());
        if (team == null) {
            throw new RuntimeException("Team not Found");
        }
        List<Developer> developers = team.getDevelopers();
        if (developers.size() == 0) {
            throw new RuntimeException("No developer Assigned to this team");
        }
        int index = (int)(Math.random() * (developers.size()));

        sendAlert(request, getDeveloperForAlert(developers));
    }

    private Developer getDeveloperForAlert(List<Developer> developers) {
        int index = (int)(Math.random() * (developers.size()));
        return developers.get(index);
    }

    private void sendAlert(AlertRequest request, Developer developer) {
        System.out.println("Sending Alter to " + developer.number + " , with message " + request.getMessage());
    }
}
