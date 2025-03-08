package graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import entite.RendezVous;
import entite.Logement;
import repository.RendezVousRepository;
import repository.LogementRepository;

import java.util.List;

public class Querries implements GraphQLRootResolver {
    private final RendezVousRepository rdvRepo;
    private final LogementRepository logementRepo;

    public Querries(RendezVousRepository rdvRepo, LogementRepository logementRepo) {
        this.rdvRepo = rdvRepo;
        this.logementRepo = logementRepo;
    }

    public List<RendezVous> allRendezVous() {
        return rdvRepo.getListeRendezVous();
    }

    public List<Logement> allLogements() {
        return logementRepo.getAllLogements();
    }
}
