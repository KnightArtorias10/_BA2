package ba2.demo.Controller;

import ba2.demo.Service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TournamentController {

    @Autowired
    private TournamentService tournamentService;
}
