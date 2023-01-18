package org.recette.pojos;

import java.util.Date;

public class Recette {
    private int idRecette;
    private String titre;
    private String autheur;
    private int note;
    private Date dateCreation;

    public Recette() {
    }

    public Recette(String titre, String autheur, int note, Date dateCreation) {
        this.titre = titre;
        this.autheur = autheur;
        this.note = note;
        this.dateCreation = dateCreation;
    }

    public int getIdRecette() {
        return idRecette;
    }

    public void setIdRecette(int idRecette) {
        this.idRecette = idRecette;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAutheur() {
        return autheur;
    }

    public void setAutheur(String autheur) {
        this.autheur = autheur;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "Recette{" +
                "idRecette=" + idRecette +
                ", titre='" + titre + '\'' +
                ", autheur='" + autheur + '\'' +
                ", note=" + note +
                ", dateCreation=" + dateCreation +
                '}';
    }
}
