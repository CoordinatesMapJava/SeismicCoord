package com.coord.dao;

import com.coord.model.Coord;
import java.util.List;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public interface CoordDao extends JpaRepository <Coord, Long> {
    
    public List <Coord> findByName (String name);
    
}
