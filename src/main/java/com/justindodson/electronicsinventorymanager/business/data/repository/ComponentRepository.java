package com.justindodson.electronicsinventorymanager.business.data.repository;

import com.justindodson.electronicsinventorymanager.business.data.entity.Component;
import org.springframework.data.repository.CrudRepository;

public interface ComponentRepository extends CrudRepository<Component, Long> {
}
