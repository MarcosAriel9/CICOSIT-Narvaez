package mx.edu.utez.cicosit.Service;



import mx.edu.utez.cicosit.Model.Window;

import java.util.Optional;

public interface WindowService {
    public Iterable<Window> findAll();
    public Optional<Window> findById(Long id);
    public Window save(Window Window);
    public void deleteById(Long id);
}
