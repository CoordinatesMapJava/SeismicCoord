package com.coord.dao;

import com.coord.model.Seismic3d;
import java.util.List;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public interface Seismic3dDao extends JpaRepository <Seismic3d, Long> {
    
    public List <Seismic3d> findByName (String name);
    
}
