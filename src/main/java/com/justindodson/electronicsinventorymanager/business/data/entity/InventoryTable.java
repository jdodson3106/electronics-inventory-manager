package com.justindodson.electronicsinventorymanager.business.data.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class InventoryTable {

    // == Fields ==
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToMany(mappedBy = "inventoryTable")
    private Set<Component> componentSet = new HashSet<>();

    // == Accessors and Mutators ==
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Component> getComponentSet() {
        return componentSet;
    }

    public void setComponentSet(Set<Component> componentSet) {
        this.componentSet = componentSet;
    }
}
