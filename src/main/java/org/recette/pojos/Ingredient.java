package org.recette.pojos;

public class Ingredient {
    private int idIngredient;
    private int idRecette;
    private String nom;
    private int quantite;
    private  String unit;

    public Ingredient() {
    }

    public Ingredient(int idRecette, String nom, int quantite, String unit) {
        this.idRecette = idRecette;
        this.nom = nom;
        this.quantite = quantite;
        this.unit = unit;
    }

    public int getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(int idIngredient) {
        this.idIngredient = idIngredient;
    }

    public int getIdRecette() {
        return idRecette;
    }

    public void setIdRecette(int idRecette) {
        this.idRecette = idRecette;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "idIngredient=" + idIngredient +
                ", idRecette=" + idRecette +
                ", nom='" + nom + '\'' +
                ", quantite=" + quantite +
                ", unit='" + unit + '\'' +
                '}';
    }
}
