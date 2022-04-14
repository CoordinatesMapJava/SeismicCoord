package com.coord.service;

import com.coord.model.Coord;
import java.util.List;

public interface CoordService {
    
    public List <Coord> getAll();
    public Coord save (Coord save);
    
}
