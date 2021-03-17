package ba2.demo.Repository;

import ba2.demo.Model.Tournament;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface TournamentRepository extends CrudRepository<Tournament,Integer> {
}
