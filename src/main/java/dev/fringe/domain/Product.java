package dev.fringe.domain;

import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.Type;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Product")
public class Product {
    @Id
    private Integer id;

    @NaturalId
    private String sku;

    @Type( type = "nstring" )
    private String name;

    @Type( type = "materialized_nclob" )
    private String description;
}
