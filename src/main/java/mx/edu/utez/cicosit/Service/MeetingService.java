package mx.edu.utez.cicosit.Service;


import mx.edu.utez.cicosit.Model.Meeting;

import java.util.Optional;

public interface MeetingService {
    public Iterable<Meeting> findAll();
    public Optional<Meeting> findById(Long id);
    public Meeting save(Meeting meeting);
    public void deleteById(Long id);
}
