package com.coord.serviceimp;

import com.coord.dao.SeismicProgramDao;
import com.coord.model.SeismicProgram;
import com.coord.service.SeismicProgramService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "seismicProgramRepoService")
public class SeismicProgramServiceImp implements SeismicProgramService {

    @Autowired
    private SeismicProgramDao seismicProgram;
    
    @Override
    public List<SeismicProgram> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SeismicProgram save(SeismicProgram s) {
        return seismicProgram.save(s);
    }
    
}