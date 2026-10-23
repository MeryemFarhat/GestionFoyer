package tn.esprim.gestionfoyer.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor



public class Reservation   {
    @Id
    private String idReservation ;

    private String anneUniversitaire;

    private boolean estValide;
    @ManyToMany(cascade=CascadeType.ALL)
    private List<Etudiant> etudiants;

}
