package com.coord.serviceimp;

import com.coord.dao.BasinDao;
import com.coord.model.Basin;
import com.coord.service.BasinService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "basinRepoService")
public class BasinServiceImp implements BasinService {

    @Autowired
    private BasinDao basinDao;
    
    @Override
    public List<Basin> getAll() {
        System.out.println(basinDao);
        return basinDao.findAll();
    }
    
    @Override
    public Basin save(Basin s) {
        return basinDao.save(s);
    }
    
}
