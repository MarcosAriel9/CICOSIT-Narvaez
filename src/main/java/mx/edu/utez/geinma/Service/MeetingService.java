package mx.edu.utez.geinma.Service;


import mx.edu.utez.geinma.Model.Meeting;

import java.util.Optional;

public interface MeetingService {
    public Iterable<Meeting> findAll();
    public Optional<Meeting> findById(Long id);
    public Meeting save(Meeting meeting);
    public void deleteById(Long id);
}
