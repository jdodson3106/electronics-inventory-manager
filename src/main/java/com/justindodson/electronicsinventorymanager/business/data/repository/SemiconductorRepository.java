package com.justindodson.electronicsinventorymanager.business.data.repository;

import com.justindodson.electronicsinventorymanager.business.data.entity.Semiconductor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemiconductorRepository extends CrudRepository<Semiconductor, Long> {
}
