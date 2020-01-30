package com.springboothackathon.models;

import javax.persistence.*;

@Entity
@Table(name = "Employees")
public class Theater {

    private int id;

    private String name;
    private float latitude;
    private float longitude;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    @Column(name = "longitude", nullable = false)
    public float getLongitude() {
        return longitude;
    }

    @Column(name = "latitude", nullable = false)
    public float getLatitude() {
        return latitude;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
