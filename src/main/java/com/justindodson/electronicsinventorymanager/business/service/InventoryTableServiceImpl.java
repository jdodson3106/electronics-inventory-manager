package com.justindodson.electronicsinventorymanager.business.service;

import com.justindodson.electronicsinventorymanager.business.data.entity.InventoryTable;
import com.justindodson.electronicsinventorymanager.business.data.repository.InventoryTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InventoryTableServiceImpl implements InventoryTableService {

    @Autowired
    private InventoryTableRepository inventoryTableRepository;

    @Override
    public InventoryTable createOrUpdateTable(InventoryTable tableEntity) {
        Optional<InventoryTable> table = inventoryTableRepository.findById(tableEntity.getId());

        if(table.isPresent()) {
            InventoryTable newTable = table.get();
            newTable.setName(tableEntity.getName());
//            newTable.setComponentSet(tableEntity.getComponentSet());

            newTable = inventoryTableRepository.save(newTable);
            return newTable;
        } else {
            tableEntity = inventoryTableRepository.save(tableEntity);
            return tableEntity;
        }
    }

    @Override
    public void deleteTable(long id) throws Exception{
        Optional<InventoryTable> table = inventoryTableRepository.findById(id);

        if(table.isPresent()) {
            inventoryTableRepository.deleteById(id);
        } else {
            throw new Exception("No table record found with id " + id);
        }
    }

    @Override
    public List<InventoryTable> getTables() {
        Iterable<InventoryTable> tables = inventoryTableRepository.findAll();
        List<InventoryTable> tableList = new ArrayList<>();

        tables.forEach(table -> {tableList.add(table);});

        return tableList;
    }
}
