package com.gsma.springxml.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author sureshkumar
 *
 */
@Entity
@Table(name="PERSON")
public class Person {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="PERSON_SEQ")
    @SequenceGenerator(name="PERSON_SEQ",sequenceName="PERSON_SEQ",allocationSize=1)
    private int id;

    private String name;

    private String country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString(){
        return "id="+id+", name="+name+", country="+country;
    }
}