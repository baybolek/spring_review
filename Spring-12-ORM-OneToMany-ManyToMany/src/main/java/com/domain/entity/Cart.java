package com.domain.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "catrs")
@NoArgsConstructor
@Data
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @ManyToMany
    @JoinTable(name ="cart_item_rel",
    joinColumns = @JoinColumn(name = "c_id"),
    inverseJoinColumns = @JoinColumn(name = "i_id"))
    private List<Item> itemList;
}
