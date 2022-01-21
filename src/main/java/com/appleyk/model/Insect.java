package com.appleyk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

public class Insect extends BaseEntity{
    private Long id;
    private String name;
    private String alias;
    private String from;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    private String point;
    private String method;

//    @Relationship(type = "is")
//    @JsonProperty("昆虫")
//    private List<Insect> insectList;


    public Insect() {

    }
}
