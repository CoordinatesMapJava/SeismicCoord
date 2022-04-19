package com.coord.main;

import com.coord.model.*;
import com.coord.service.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunTest implements CommandLineRunner {

    @Autowired
    private BasinService basinService;
    @Autowired
    private BlockService blockService;
    @Autowired
    private CoordService coordService;
    @Autowired
    private EadService eadService;
    @Autowired
    private Seismic2dService seismic2dService;
    @Autowired
    private Seismic3dService seismic3dService;
    @Autowired
    private SeismicProgramService seismicProgramService;
    
    private final static DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
    @Override
    public void run(String... args) throws Exception {
        
        Basin b1 = new Basin(null, "Campos");
//        basinService.save(b1);
        Basin b2 = new Basin(null, "Santos");
//        basinService.save(b2);
        Basin b3 = new Basin(null, "Espírito Santo");
//        basinService.save(b3);
        Basin b4 = new Basin(null, "Jequitinhonha");
//        basinService.save(b4);
        Basin b5 = new Basin(null, "Camamu");
//        basinService.save(b5);
        Basin b6 = new Basin(null, "Almada");
//        basinService.save(b6);
        Basin b7 = new Basin(null, "Recôncavo");
//        basinService.save(b7);
        Basin b8 = new Basin(null, "Tucano");
//        basinService.save(b8);
        Basin b9 = new Basin(null, "Sergipe/Alagoas");
//        basinService.save(b9);
        Basin b10 = new Basin(null, "Potiguar");
//        basinService.save(b10);
        Basin b11 = new Basin(null, "Solimões");
//        basinService.save(b11);

        Ead e1 = new Ead(null, "Empresa A");
//        eadService.save(e1);
        Ead e2 = new Ead(null, "Empresa B");
//        eadService.save(e2);
        Ead e3 = new Ead(null, "Empresa C");
//        eadService.save(e3);
        Ead e4 = new Ead(null, "Empresa D");
//        eadService.save(e4);

        SeismicProgram sp1 = new SeismicProgram(null, "Programa sismica 1", e1);
//        seismicProgramService.save(sp1);
        SeismicProgram sp2 = new SeismicProgram(null, "Programa sismica 2", e2);
//        seismicProgramService.save(sp2);
        SeismicProgram sp3 = new SeismicProgram(null, "Programa sismica 3", e3);
//        seismicProgramService.save(sp3);
        SeismicProgram sp4 = new SeismicProgram(null, "Programa sismica 4", e4);
//        seismicProgramService.save(sp4);
        
        Block bl1 = new Block(null, "SPOT-AUP2", b1, e1);
//        blockService.save(bl1);
        Block bl2 = new Block(null, "SPOT-AP2", b2, e1);
//        blockService.save(bl2);
        Block bl3 = new Block(null, "SC-AP1", b3, e2);
//        blockService.save(bl3);
        Block bl4 = new Block(null, "SC-AP3", b4, e2);
//        blockService.save(bl4);
        Block bl5 = new Block(null, "SC-AUP2", b5, e2);
//        blockService.save(bl5);
        Block bl6 = new Block(null, "SS-AUP5", b6, e3);
//        blockService.save(bl6);
        Block bl7 = new Block(null, "SS-AP4", b7, e3);
//        blockService.save(bl7);
        Block bl8 = new Block(null, "SS-AUP4", b8, e3);
//        blockService.save(bl8);
        Block bl9 = new Block(null, "SP-AR1", b9, e4);
//        blockService.save(bl9);
        Block bl10 = new Block(null, "SP-AP1", b10, e4);
//        blockService.save(bl10);
        Block bl11 = new Block(null, "SP-AUP1", b11, e4);
//        blockService.save(bl11);
        
        Seismic2d s2d1 = new Seismic2d(null, "0294-0181", dateFormat.parse("10-01-2019"), sp1);
//        seismic2dService.save(s2d1);
        Seismic2d s2d2 = new Seismic2d(null, "0294-0181", dateFormat.parse("10-01-2019"), sp2);
//        seismic2dService.save(s2d2);
        Seismic2d s2d3 = new Seismic2d(null, "0294-0182", dateFormat.parse("25-01-2019"), sp3);
//        seismic2dService.save(s2d3);
        Seismic2d s2d4 = new Seismic2d(null, "0294-0182", dateFormat.parse("25-01-2019"), sp4);
//        seismic2dService.save(s2d4);
        
        Coord c1 = new Coord(null, 101, "50032S", "30460W", 1008.0, 2002.0, 1000.0, s2d1);
//        coordService.save(c1);
        Coord c2 = new Coord(null, 102, "50043S", "30660W", 1070.0, 2002.0, 1008.0, s2d1);
//        coordService.save(c2);
        Coord c3 = new Coord(null, 103, "50054S", "30770W", 1008.0, 2003.0, 1007.0, s2d2);
//        coordService.save(c3);
        Coord c4 = new Coord(null, 104, "57500S", "30087W", 1070.0, 2010.0, 1006.0, s2d2);
//        coordService.save(c4);
        Coord c5 = new Coord(null, 105, "50760S", "30098W", 1200.0, 2006.0, 1005.0, s2d3);
//        coordService.save(c5);
        Coord c6 = new Coord(null, 106, "50540S", "30045W", 1040.0, 2008.0, 1003.0, s2d3);
//        coordService.save(c6);
        Coord c7 = new Coord(null, 107, "50077S", "30056W", 1060.0, 2050.0, 1002.0, s2d3);
//        coordService.save(c7);
        Coord c8 = new Coord(null, 108, "50033S", "30087W", 1400.0, 2070.0, 1090.0, s2d4);
//        coordService.save(c8);
        Coord c9 = new Coord(null, 109, "50045S", "30033W", 1030.0, 2080.0, 1009.0, s2d4);
//        coordService.save(c9);
        Coord c10 = new Coord(null, 110, "50780S", "30670W", 1010.0, 2080.0, 1008.0, s2d4);
//        coordService.save(c10);
        
        Seismic3d s3d1 = new Seismic3d(null, "0394-0181", dateFormat.parse("14-03-2019"), e1, sp1);
//        seismic3dService.save(s3d1);
        Seismic3d s3d2 = new Seismic3d(null, "0394-0181", dateFormat.parse("14-03-2019"), e2, sp2);
//        seismic3dService.save(s3d2);
        Seismic3d s3d3 = new Seismic3d(null, "0394-0182", dateFormat.parse("15-03-2019"), e3, sp3);
//        seismic3dService.save(s3d3);
        Seismic3d s3d4 = new Seismic3d(null, "0394-0182", dateFormat.parse("15-03-2019"), e4, sp4);
//        seismic3dService.save(s3d4);
        
    }
    
}
