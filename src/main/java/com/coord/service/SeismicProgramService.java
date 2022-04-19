package com.coord.service;

import com.coord.model.SeismicProgram;
import java.util.List;

public interface SeismicProgramService {

    public List <SeismicProgram> getAll();
    public SeismicProgram save (SeismicProgram s);
    
}
