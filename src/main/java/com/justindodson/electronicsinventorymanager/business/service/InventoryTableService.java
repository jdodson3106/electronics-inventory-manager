package com.justindodson.electronicsinventorymanager.business.service;

import com.justindodson.electronicsinventorymanager.business.data.entity.InventoryTable;

import java.util.List;

public interface InventoryTableService {
    InventoryTable createOrUpdateTable(InventoryTable table);
    void deleteTable(long id) throws Exception;
    List<InventoryTable> getTables();
}
