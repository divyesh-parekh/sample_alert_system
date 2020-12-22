package hello.model;

import hello.apimodel.AddTeamRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true)
    public String name;
    @OneToMany(mappedBy = "team")
    List<Developer> developers;

    public Team(AddTeamRequest that) {
        this.name = that.name;
    }
}
