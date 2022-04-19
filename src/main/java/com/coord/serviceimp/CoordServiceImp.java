package com.coord.serviceimp;

import com.coord.dao.CoordDao;
import com.coord.model.Coord;
import com.coord.service.CoordService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "coordRepoService")
public class CoordServiceImp implements CoordService {

    @Autowired
    private CoordDao coordDao;
    
    @Override
    public List<Coord> getAll() {
        System.out.println(coordDao);
        return coordDao.findAll();
    }

    @Override
    public Coord save(Coord s) {
        return coordDao.save(s);
    }
    
}
