package org.sid.orderservice.model;

import lombok.Data;

@Data
public class Customer {
    private long id;
    private String name;
    private String email;

}
