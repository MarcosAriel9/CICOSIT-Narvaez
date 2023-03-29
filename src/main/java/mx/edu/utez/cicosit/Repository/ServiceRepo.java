package mx.edu.utez.cicosit.Repository;

import mx.edu.utez.cicosit.Model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepo extends JpaRepository<Service, Long> {

}
