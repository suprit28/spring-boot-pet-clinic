package com.springboot.petclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Override
    public String toString() {
        return name;
    }

    @Builder
    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }
}
