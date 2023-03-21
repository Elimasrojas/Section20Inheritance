package com.elr.elr.domain.tableperclass;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Mammal {
    /*
    * @GeneratedValue(strategy = GenerationType.TABLE)
    * con IDENTIY sale Cannot use identity column kee generatio with union
    * sale error si no usamos esta opcion
    * se creat3 tablas HIBERNATE_SEQUENCES-DOLPHIN-DOG
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private Integer bodyTemp;

    private String species;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(Integer bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}