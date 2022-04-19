package com.coord.serviceimp;

import com.coord.dao.Seismic3dDao;
import com.coord.model.Seismic3d;
import com.coord.service.Seismic3dService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "seismic3dRepoService")
public class Seismic3dServiceImp implements Seismic3dService {

    @Autowired
    private Seismic3dDao seismic3dDao;
    
    @Override
    public List<Seismic3d> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Seismic3d save(Seismic3d s) {
        return seismic3dDao.save(s);
    }
    
}
