package com.coord.dao;

import com.coord.model.Block;
import java.util.List;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public interface BlockDao extends JpaRepository <Block, Long> {
    
    public List <Block> findByName (String name);
    
}
