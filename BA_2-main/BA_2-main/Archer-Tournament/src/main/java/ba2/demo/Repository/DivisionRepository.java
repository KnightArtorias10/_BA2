package ba2.demo.Repository;

import ba2.demo.DTO.ArcherDTO;
import ba2.demo.Model.Archer;
import ba2.demo.Model.Division;
import org.springframework.data.repository.CrudRepository;

public interface DivisionRepository extends CrudRepository<Division, Integer> {
    Division findByArcher(Archer archer);
}
