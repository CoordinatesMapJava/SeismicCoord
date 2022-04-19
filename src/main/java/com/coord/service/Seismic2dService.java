package com.coord.service;

import com.coord.model.Seismic2d;
import java.util.List;

public interface Seismic2dService {
    
    public List <Seismic2d> getAll();
    public Seismic2d save (Seismic2d s);
    
}
