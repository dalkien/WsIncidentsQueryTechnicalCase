package co.com.claro.incidentsQueryTechnicalCase.dao;

import co.com.claro.incidentsQueryTechnicalCase.entity.*;
import lombok.NoArgsConstructor;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

@Stateless
@NoArgsConstructor
public class PqrCaseCvDao extends AbstractDao<PqrCaseCv> {

    private EntityManager entityManager;

    public PqrCaseCvDao(EntityManager entityManager){
        super(PqrCaseCv.class);
        this.entityManager = entityManager;
    }

    @Override
    public EntityManager getEntityManager() {
        return this.entityManager;
    }

    public EntityManager setEntityManager(){
        return this.entityManager;
    }
}
