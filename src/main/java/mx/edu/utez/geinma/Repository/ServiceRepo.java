package mx.edu.utez.geinma.Repository;

import mx.edu.utez.geinma.Model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepo extends JpaRepository<Service, Long> {

}
