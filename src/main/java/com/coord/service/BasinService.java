package com.coord.service;

import com.coord.model.Basin;
import java.util.List;

public interface BasinService {
    
    public List <Basin> getAll();
    public Basin save (Basin save);
    
}
