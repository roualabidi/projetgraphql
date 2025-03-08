package graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import entite.Logement;
import repository.LogementRepository;

public class Mutations implements GraphQLRootResolver {
    private final LogementRepository logementRepository;

    public Mutations(LogementRepository logementRepository) {
        this.logementRepository = logementRepository;
    }

    public Logement addLogement(int reference, String adresse, String delegation, String gouvernorat, Logement.TypeL typeL, String description, float prix) {
        Logement newLogement = new Logement(reference, adresse, delegation, gouvernorat, typeL, description, prix);
        logementRepository.saveLogement(newLogement);
        return newLogement;
    }
}
