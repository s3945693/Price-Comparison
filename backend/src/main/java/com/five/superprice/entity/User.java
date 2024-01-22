package com.five.superprice.entity;
import jakarta.persistence.*;
//This class specifies the talbe name and the unique constraints for the table 'userAccounts'
@Entity
@Table(name = "userAccounts",uniqueConstraints = {
        @UniqueConstraint(columnNames = "email"),
})
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name="password")
    private String password;
    @Column(name="email")
    private String email;
    
    @Column(name = "firstname")
    private String firstname;
    @Column(name="lastname")
    private String lastname;

    @Column(name="role")
    private String role;

    public long getId() {
        return id;
    }

    public long setId(long id) {
        return this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role=role;
    }
}
