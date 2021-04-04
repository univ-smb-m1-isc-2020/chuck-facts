package fr.univ_smb.isc.m1.chuck_facts.application;

import fr.univ_smb.isc.m1.chuck_facts.infrastructure.persistence.ChuckFact;
import fr.univ_smb.isc.m1.chuck_facts.infrastructure.persistence.ChuckFactsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuckFactsService {

    private final ChuckFactsRepository repository;

    public ChuckFactsService(ChuckFactsRepository repository) {
        this.repository = repository;
    }

    public List<ChuckFact> facts() {
        return repository.findAll();
    }

}
