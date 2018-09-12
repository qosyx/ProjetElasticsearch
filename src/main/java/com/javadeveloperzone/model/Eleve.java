package com.javadeveloperzone.model;

import com.sun.tracing.dtrace.ProviderAttributes;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "eleve", type = "eleve")
public class Eleve {
    @Id
    private String idEleve;
    private String nomEleve;
    private String prenomEleve;
    private String idClasse;

    public String getIdEleve() {
        return idEleve;
    }

    public void setIdEleve(String idEleve) {
        this.idEleve = idEleve;
    }

    public String getNomEleve() {
        return nomEleve;
    }

    public void setNomEleve(String nomEleve) {
        this.nomEleve = nomEleve;
    }

    public String getPrenomEleve() {
        return prenomEleve;
    }

    public void setPrenomEleve(String prenomEleve) {
        this.prenomEleve = prenomEleve;
    }

    public String getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(String idClasse) {
        this.idClasse = idClasse;
    }
}
