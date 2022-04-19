package com.coord.serviceimp;

import com.coord.dao.BlockDao;
import com.coord.model.Block;
import com.coord.service.BlockService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "blockRepoService")
public class BlockServiceImp implements BlockService {

    @Autowired
    private BlockDao blockdao;
    
    @Override
    public List<Block> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Block save(Block s) {
        return blockdao.save(s);
    }
    
}
