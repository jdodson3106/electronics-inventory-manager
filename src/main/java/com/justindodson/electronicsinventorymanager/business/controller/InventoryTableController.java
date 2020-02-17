package com.justindodson.electronicsinventorymanager.business.controller;

import com.justindodson.electronicsinventorymanager.business.data.entity.InventoryTable;
import com.justindodson.electronicsinventorymanager.business.service.InventoryTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/inventory-table")
public class InventoryTableController {

    @Autowired
    private InventoryTableService inventoryTableService;

    @GetMapping("/all")
    public String allTables(Model model) {
        model.addAttribute("tables", inventoryTableService.getTables());
        return "tables/all-tables";
    }

    @GetMapping("/new")
    public String newTable(Model model) {
        InventoryTable table = new InventoryTable();
        model.addAttribute("table", table);
        return "tables/new-table";
    }

    @PostMapping("/new")
    public String newTable(@ModelAttribute InventoryTable table) {
        inventoryTableService.createOrUpdateTable(table);
        return "redirect:/inventory-table/all";
    }
}
