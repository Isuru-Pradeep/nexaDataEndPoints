package com.example.nexa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@IdClass(MyKey.class)
public class Generate {
    @Id
    private String email;
    @Id
    private int id;

    @Id
    private int color_pallet_id;
}
