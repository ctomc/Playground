package org.jboss.as.tests.as71234.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Tomaz Cerar
 * @created 11.7.11 14:58
 */
@Entity
@Table(name = "MY_ENTITY")
public class MyEntity {
    private String id;
    private String name;

    @Id
    @Column(name = "ENTITY_ID", length = 40)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "NAME", length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
