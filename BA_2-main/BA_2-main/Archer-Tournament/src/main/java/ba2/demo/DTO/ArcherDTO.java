package ba2.demo.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@ToString
@NoArgsConstructor
public class ArcherDTO {

    @Id
    private String id;
    private String firstName;
    private String lastName;

    private String divisionName;
    private String shootingStyleName;
 }
