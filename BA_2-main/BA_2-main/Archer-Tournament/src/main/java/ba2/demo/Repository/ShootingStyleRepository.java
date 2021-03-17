package ba2.demo.Repository;

import ba2.demo.DTO.ShootingStyleDTO;
import ba2.demo.Model.Archer;
import ba2.demo.Model.ShootingStyle;
import org.springframework.data.repository.CrudRepository;

public interface ShootingStyleRepository extends CrudRepository<ShootingStyle, Integer> {
    ShootingStyle findByArcher(Archer archer);
}
