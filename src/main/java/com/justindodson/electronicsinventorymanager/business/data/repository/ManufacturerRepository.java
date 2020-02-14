package com.justindodson.electronicsinventorymanager.business.data.repository;

import com.justindodson.electronicsinventorymanager.business.data.entity.Manufacturer;
import org.springframework.data.repository.CrudRepository;

public interface ManufacturerRepository extends CrudRepository<Manufacturer, Long> {
}
