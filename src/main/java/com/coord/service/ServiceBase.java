package com.coord.service;

import com.coord.model.EntityBase;
import java.util.List;

public interface ServiceBase {

    public abstract List <EntityBase> getAll();
    public abstract EntityBase save (EntityBase s);

}