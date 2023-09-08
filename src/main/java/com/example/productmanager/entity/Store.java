package com.example.productmanager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Store {
    @Id
    private Long Id;
    private String name;
    private String address;
    private String phoneNumber;

}
