package mx.edu.utez.geinma.Service;



import mx.edu.utez.geinma.Model.Window;

import java.util.Optional;

public interface WindowService {
    public Iterable<Window> findAll();
    public Optional<Window> findById(Long id);
    public Window save(Window Window);
    public void deleteById(Long id);
}
