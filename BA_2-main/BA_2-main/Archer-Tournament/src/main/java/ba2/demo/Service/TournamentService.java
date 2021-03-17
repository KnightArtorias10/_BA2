package ba2.demo.Service;

import ba2.demo.DTO.ArcherDTO;
import ba2.demo.DTO.DivisionDTO;
import ba2.demo.DTO.TournamentDTO;
import ba2.demo.Model.Tournament;

import java.util.List;

public interface TournamentService {
    //Tournament related methods
    List<Tournament> getAllTournaments();
    Tournament getTournamentById(int id);
    TournamentDTO createTournament(TournamentDTO tournamentDTO);
    void editTournament(TournamentDTO tournamentDTO);
    void deleteTournament(int id);

    //Archer related methods
    ArcherDTO registerArcher(ArcherDTO archerDTO, DivisionDTO divisionDTO);
}
