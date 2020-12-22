package hello.apimodel;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AddDeveloperRequest {
    @NotNull
    String name;
    @NotNull
    Long number;
    @NotNull
    Integer teamId;

}
