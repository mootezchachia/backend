package tn.esprit.teriak.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codePCT;
    private String designation;
    private int uniteParCaisse;
    private double prix;
    private double remise;
    private int carton;
    private int vrac;
    private int quantiteTotale;
    private double montantApresRemise;
    private boolean disponible;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodePCT() {
        return codePCT;
    }

    public void setCodePCT(String codePCT) {
        this.codePCT = codePCT;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getUniteParCaisse() {
        return uniteParCaisse;
    }

    public void setUniteParCaisse(int uniteParCaisse) {
        this.uniteParCaisse = uniteParCaisse;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public int getCarton() {
        return carton;
    }

    public void setCarton(int carton) {
        this.carton = carton;
    }

    public int getVrac() {
        return vrac;
    }

    public void setVrac(int vrac) {
        this.vrac = vrac;
    }

    public int getQuantiteTotale() {
        return quantiteTotale;
    }

    public void setQuantiteTotale(int quantiteTotale) {
        this.quantiteTotale = quantiteTotale;
    }

    public double getMontantApresRemise() {
        return montantApresRemise;
    }

    public void setMontantApresRemise(double montantApresRemise) {
        this.montantApresRemise = montantApresRemise;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
