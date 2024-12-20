package com.tarcisioproject.passwordgenerator.domain;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Table(name = "password")
@Entity(name = "password")
public class Password {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String password;

    private Date creationDate;

    public Password() {
        setCreationDate(new Date());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
