package raphael.spitz.myfirstapp.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import raphael.spitz.myfirstapp.dao.entities.Car;
@Repository
public interface CarRepo extends JpaRepository<Car,Long> {

}
