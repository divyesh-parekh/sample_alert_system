package hello.apimodel;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AddTeamRequest {
    @NotNull
    public String name;
}
