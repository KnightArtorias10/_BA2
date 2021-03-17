package ba2.demo.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
public class Tournament {

    @Id
    private String id;

    private String name;

    private int statusCode;

    private Round round;
 }

