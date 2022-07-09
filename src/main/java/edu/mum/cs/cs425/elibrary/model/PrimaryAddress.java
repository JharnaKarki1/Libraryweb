package edu.mum.cs.cs425.elibrary.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="primary_addresses")
public class PrimaryAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    @OneToOne(mappedBy = "primaryAddress")
    @JsonIgnore
    private Publisher publisher;


    @Override
    public String toString() {
        return String.format("%s<br>%s %s %s"
                , street, city, state, zipCode);
    }
}

