package ba2.demo.Service;

import ba2.demo.DTO.ArcherDTO;
import ba2.demo.DTO.DivisionDTO;
import ba2.demo.DTO.TournamentDTO;
import ba2.demo.Model.Archer;
import ba2.demo.Model.Tournament;
import ba2.demo.Repository.ArcherRepository;
import ba2.demo.Repository.DivisionRepository;
import ba2.demo.Repository.TournamentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TournamentServiceImpl implements TournamentService {

    @Autowired
    private TournamentRepository tournamentRepository;

    @Autowired
    private ArcherRepository archerRepository;

    @Autowired
    private DivisionRepository divisionRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<Tournament> getAllTournaments() {
        return null;
    }

    @Override
    public Tournament getTournamentById(int id) {
        Tournament obj = tournamentRepository.findById(id).get();
        return obj;
    }

    @Override
    public TournamentDTO createTournament(TournamentDTO tournamentDTO) {
        Tournament tournamentModel = new Tournament();
                tournamentModel.setName(tournamentDTO.getName());
                tournamentModel.setStatusCode(tournamentDTO.getStatusCode());
        tournamentRepository.save(tournamentModel);
        return modelMapper.map(tournamentModel, TournamentDTO.class);
    }

    @Override
    public void editTournament(TournamentDTO tournamentDTO) {

    }

    @Override
    public void deleteTournament(int id) {

    }

    @Override
    public ArcherDTO registerArcher(ArcherDTO archerDTO, DivisionDTO divisionDTO) {
        Archer archerModel = new Archer();
        archerModel.setFirstName(archerDTO.getFirstName());
        archerModel.setLastName(archerDTO.getLastName());
        archerRepository.save(archerModel);
        return modelMapper.map(archerModel, ArcherDTO.class);
    }
}
