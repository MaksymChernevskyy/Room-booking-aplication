package com.be.booker.business.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "rooms")
@Data
@Setter
@Getter
@EqualsAndHashCode
public class Room {
    @Id
    @Column(name = "name")
    private String roomName;

    @Column(name = "locationDescription", columnDefinition = "varchar (255) default 'na'")
    private String locationDescription;

    @Column(name = "numberOfSeats")
    private int numberOfSeats;

    @Column(name = "isContainsProjecctor", columnDefinition = "boolean default false")
    private boolean containProjector;

    @Column(name = "phoneNumber")
    private String phoneNumber;
}
