package com.coord.main;

import com.coord.model.Basin;
import com.coord.model.Seismic3d;
import com.coord.model.Seismic2d;
import com.coord.model.SeismicProgram;
import com.coord.model.Ead;
import com.coord.model.Coord;
import com.coord.model.Block;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.coord.service.ServiceBase;

@Component
public class RunTest implements CommandLineRunner {

    @Autowired
    private ServiceBase serviceBase;
    
    private final static DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
    @Override
    public void run(String... args) throws Exception {
        
        Basin basin = new Basin();
        Block block = new Block();
        Coord coord = new Coord();
        Ead ead = new Ead();
        Seismic2d s2d = new Seismic2d();
        Seismic3d s3d = new Seismic3d();
        SeismicProgram sprogram = new SeismicProgram();

        ead.setName("Empresa J");
        serviceBase.save(ead);
        
        System.out.println("Dados salvos com sucesso!");
        
    }
    
}
