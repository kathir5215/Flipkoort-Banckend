package com.example.flipkart.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // e.g., ROLE_ADMIN, ROLE_SELLER, ROLE_BUYER
    @Column(nullable = false, unique = true)
    private String name;
}
