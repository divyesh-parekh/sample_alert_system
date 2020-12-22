package hello.apimodel;

import lombok.Data;

@Data
public class AlertRequest {
    String message;
    Integer teamId;
}
