package mx.edu.utez.geinma.Repository;

import mx.edu.utez.geinma.Model.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRepo extends JpaRepository<Meeting, Long> {
}
