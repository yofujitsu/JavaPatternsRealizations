package NotPatterns.PhoneDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PhoneDAO {
    private final PhoneRepository phoneRepository;

    @Autowired
    public PhoneDAO(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    public Phone findEntityById(int id) {
        Optional<Phone> phoneOptional = phoneRepository.findById(id);
        return phoneOptional.orElse(null);
    }

    public List<Phone> findAll() {
        return phoneRepository.findAll();
    }

    public boolean delete(int id) {
        if (phoneRepository.existsById(id)) {
            phoneRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public boolean delete(Phone phone) {
        if (phoneRepository.existsById(phone.getId())) {
            phoneRepository.delete(phone);
            return true;
        }
        return false;
    }

    public boolean create(Phone phone) {
        if (phone.getId() == null) {
            phoneRepository.save(phone);
            return true;
        }
        return false;
    }

    public Phone update(Phone phone) {
        if (phoneRepository.existsById(phone.getId())) {
            return phoneRepository.save(phone);
        }
        return null;
    }
}
