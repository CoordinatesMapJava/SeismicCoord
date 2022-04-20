package com.coord.dao;

import com.coord.model.*;
import java.util.List;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public interface DaoBase extends JpaRepository <EntityBase, Long> {
    
    @Query("SELECT c FROM Coord as c "
            + "INNER JOIN Seismic2d as s "
            + "ON s = c.idSeismic2d "
            + "WHERE s.name = ?1")
    public abstract List <Coord> findByName (String name);

}