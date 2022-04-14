package com.coord.service;

import com.coord.model.Block;
import java.util.List;

public interface BlockService {
    
    public List <Block> getAll();
    public Block save (Block save);
    
}
