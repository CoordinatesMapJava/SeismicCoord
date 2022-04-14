package com.coord.service;

import com.coord.model.Ead;
import java.util.List;

public interface EadService {
    
    public List <Ead> getAll();
    public Ead save (Ead save);
    
}
