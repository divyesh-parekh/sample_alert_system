package hello.apimodel;

import hello.model.Developer;
import hello.model.Team;
import lombok.Data;

@Data
public class AddDeveloperResponse {
    Integer id;
    String name;
    Long number;
    String teamName;

    public AddDeveloperResponse(Developer that, Team team) {
        this.id = that.getId();
        this.name = that.getName();
        this.number = that.getNumber();
        this.teamName = team.getName();
    }
}
