package com.coord.service;

import com.coord.model.*;
import java.util.List;

public interface ServiceBase {

    public abstract List <EntityBase> getAll();
    public abstract EntityBase save (EntityBase s);
    public abstract List <Coord> getBySeismic2dEndCoord (String name);

}