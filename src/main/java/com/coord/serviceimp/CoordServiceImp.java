package com.coord.serviceimp;

import com.coord.model.Coord;
import com.coord.service.CoordService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service(value = "coordRepoService")
public class CoordServiceImp implements CoordService {

    @Override
    public List<Coord> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Coord save(Coord save) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
