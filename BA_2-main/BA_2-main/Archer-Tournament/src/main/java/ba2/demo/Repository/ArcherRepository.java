package ba2.demo.Repository;

import ba2.demo.Model.Archer;
import org.springframework.data.repository.CrudRepository;

public interface ArcherRepository extends CrudRepository<Archer, Integer> {
}
