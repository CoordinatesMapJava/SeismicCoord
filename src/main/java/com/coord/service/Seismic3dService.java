package com.coord.service;

import com.coord.model.Seismic3d;
import java.util.List;

public interface Seismic3dService {
    
    public List <Seismic3d> getAll();
    public Seismic3d save (Seismic3d s);
    
}
