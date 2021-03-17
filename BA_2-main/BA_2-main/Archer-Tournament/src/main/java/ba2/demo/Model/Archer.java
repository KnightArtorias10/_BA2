package ba2.demo.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
public class Archer {

    @Id
    private String id;
    private String firstName;
    private String lastName;

    private Division division;

    private ShootingStyle shootingStyle;
}
