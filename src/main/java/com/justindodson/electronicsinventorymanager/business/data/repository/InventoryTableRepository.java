package com.justindodson.electronicsinventorymanager.business.data.repository;

import com.justindodson.electronicsinventorymanager.business.data.entity.InventoryTable;
import org.springframework.data.repository.CrudRepository;

public interface InventoryTableRepository extends CrudRepository<InventoryTable, Long> {
}
