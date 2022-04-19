package com.coord.serviceimp;

import com.coord.dao.EadDao;
import com.coord.model.Ead;
import com.coord.service.EadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "eadRepoService")
public class EadServiceImp implements EadService {

    @Autowired
    private EadDao eadDao;
    
    @Override
    public List<Ead> getAll() {
        System.out.println(eadDao);
        return eadDao.findAll();
    }

    @Override
    public Ead save(Ead s) {
        return eadDao.save(s);
    }
    
}
