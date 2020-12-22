package hello.apimodel;

import hello.model.Team;
import lombok.Data;

@Data
public class AddTeamResponse {
    Integer id;
    String name;

    public AddTeamResponse(Team team) {
        this.id = team.getId();
        this.name = team.getName();
    }
}
