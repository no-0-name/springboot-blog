package com.example.springbootblog.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Authority implements Serializable {

    @Id
    @Column(length = 16)
    private String name;

    @Override
    public String toString() {
        return "Authority{" + "name='" + name + "'" + "}";
    }
}
