package com.coord.dao;

import com.coord.model.Coord;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public interface CoordDao extends JpaRepository <Coord, Long> {
    
//    @Query("SELECT c FROM Coord as c "
//            + "INNER JOIN Seismic2d as s "
//            + "ON s = c.seismic2d "
//            + "WHERE s.name = ?1")
//    public List <Coord> findByName (String name);
    
}
