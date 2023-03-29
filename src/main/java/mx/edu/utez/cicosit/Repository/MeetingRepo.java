package mx.edu.utez.cicosit.Repository;

import mx.edu.utez.cicosit.Model.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRepo extends JpaRepository<Meeting, Long> {
}
