package com.eventos.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Event implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, unique = true, nullable = false)
    private UUID id;

    @CreatedDate
    @Column(updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate createdDate;

    @LastModifiedDate
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate updatedDate;

    @Column(nullable = false)
    private String eventName;

    @Column(nullable = false)
    private String local;


    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate eventDate;


    private int peopleQty;

    @Column(nullable = false)
    private String imageURL;

    @Column(nullable = false)
    private String telephone;

    @Column(nullable = false)
    private String email;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Lot> lots;


}
