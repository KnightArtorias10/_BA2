package ba2.demo.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class TournamentDTO {

    private String id;
    private String name;
    private int statusCode;

    private String roundName;
}
