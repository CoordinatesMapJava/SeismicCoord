package com.coord.serviceimp;

import com.coord.dao.Seismic2dDao;
import com.coord.model.Seismic2d;
import com.coord.service.Seismic2dService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "seismic2dRepoService")
public class Seismic2dServiceImp implements Seismic2dService {

    @Autowired
    private Seismic2dDao seismic2dDao;
    
    @Override
    public List<Seismic2d> getAll() {
        System.out.println(seismic2dDao);
        return seismic2dDao.findAll();
    }

    @Override
    public Seismic2d save(Seismic2d s) {
        return seismic2dDao.save(s);
    }
    
}