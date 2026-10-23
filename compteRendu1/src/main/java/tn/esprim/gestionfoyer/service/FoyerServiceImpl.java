package tn.esprim.gestionfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestionfoyer.repository.FoyerRepository;

@Service
public class FoyerServiceImpl implements IFoyerService {
    @Autowired
    private FoyerRepository  foyerRepository;
}
