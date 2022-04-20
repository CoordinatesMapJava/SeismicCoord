package com.coord.serviceimp;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coord.dao.DaoBase;
import com.coord.model.*;
import com.coord.service.ServiceBase;

@Service(value = "serviceGenericRepo")
public class ServiceBaseImp implements ServiceBase, Serializable {

    @Autowired
    private DaoBase daoBase;
    
    @Override
    public List<EntityBase> getAll() {
       System.out.println(daoBase);
       return daoBase.findAll();
    }

    @Override
    public EntityBase save(EntityBase s) {
        return daoBase.save(s);
    }
    
    @Override
    public List<Coord> getBySeismic2dEndCoord(String name) {
       return daoBase.findByName(name);
    }
    
    private static final long serialVersionUID = 1L;

    @PersistenceContext
    protected EntityManager entityManager;

}
