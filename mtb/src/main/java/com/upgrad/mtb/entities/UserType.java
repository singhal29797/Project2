package com.upgrad.mtb.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, unique = true)
    private String userType;

    @OneToMany(mappedBy = "customer",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference("userType_customer")
    private List<Customer> customer;

    public UserType() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "UserType{" +
                "id=" + id +
                ", userType='" + userType + '\'' +
                ", customer=" + customer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserType userType1 = (UserType) o;
        return id == userType1.id &&
                Objects.equals(userType, userType1.userType) &&
                Objects.equals(customer, userType1.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userType, customer);
    }
}
