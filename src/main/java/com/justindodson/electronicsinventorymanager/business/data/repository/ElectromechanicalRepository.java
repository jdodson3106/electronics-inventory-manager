package com.justindodson.electronicsinventorymanager.business.data.repository;

import com.justindodson.electronicsinventorymanager.business.data.entity.Electromechanical;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectromechanicalRepository extends CrudRepository<Electromechanical, Long> {
}
