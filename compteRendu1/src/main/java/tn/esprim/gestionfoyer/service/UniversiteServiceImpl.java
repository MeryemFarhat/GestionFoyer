package tn.esprim.gestionfoyer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestionfoyer.repository.UniversiteRepository;

@Service
public class UniversiteServiceImpl  implements IUniversiteService{
    @Autowired
    private UniversiteRepository universiteRepository;
}
