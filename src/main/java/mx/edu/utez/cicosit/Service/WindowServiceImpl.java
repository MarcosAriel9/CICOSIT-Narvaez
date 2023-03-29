package mx.edu.utez.cicosit.Service;

import mx.edu.utez.cicosit.Model.Window;
import mx.edu.utez.cicosit.Repository.WindowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WindowServiceImpl implements WindowService {
    @Autowired
    WindowRepo windowRepository;

    @Override

    public Iterable<Window> findAll() {
        return windowRepository.findAll();
    }

    @Override

    public Optional<Window> findById(Long id) {
        return windowRepository.findById(id);
    }

    @Override

    public Window save(Window window) {
        return windowRepository.save(window);
    }

    @Override

    public void deleteById(Long id) {
        windowRepository.deleteById(id);
    }


}
