package hello.model;

import hello.apimodel.AddDeveloperRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public String name;

    @Column(name = "number", unique = true)
    public Long number;

    @ManyToOne()
    @JoinColumn(name = "team_id")
    public Team team;

    public Developer(AddDeveloperRequest that, Team team) {
        this.name = that.getName();
        this.number = that.getNumber();
        this.team = team;
    }
}
