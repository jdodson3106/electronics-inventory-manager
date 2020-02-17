package com.justindodson.electronicsinventorymanager.business.data.entity;

import javax.persistence.Entity;

@Entity
public class Connector extends Component {
    private String category;
    private String type;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
