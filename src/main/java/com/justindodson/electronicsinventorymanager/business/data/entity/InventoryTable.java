package com.justindodson.electronicsinventorymanager.business.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class InventoryTable {

    // == Fields ==
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
//    private Set<Component> componentSet;

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

//    public Set<Component> getComponentSet() {
//        return componentSet;
//    }
//
//    public void setComponentSet(Set<Component> componentSet) {
//        this.componentSet = componentSet;
//    }
}
