package com.Eventi.Mercury.Model;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class Evento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String nomeEvento;
    private String oraEvento;
    private String regioneEvento;
    private String provinciaEvento;
    private String comuneEvento;
    private String descrizioneEvento;
    private String dataEvento;
    private String immagineURl;
    @Column(nullable = false,updatable = false)
    private String codiceEvento;
    private boolean ban;

    public Evento(){}


    public Evento(String nomeEvento,String oraEvento,String regioneEvento,String provinciaEvento,String comuneEvento,String descrizioneEvento,String dataEvento,String immagineURl,String codiceEvento, boolean ban)
    {
        this.nomeEvento =nomeEvento;
        this.oraEvento =oraEvento;
        this.regioneEvento =regioneEvento;
        this.provinciaEvento =provinciaEvento;
        this.comuneEvento =comuneEvento;
        this.descrizioneEvento =descrizioneEvento;
        this.dataEvento =dataEvento;
        this.immagineURl =immagineURl;
        this.codiceEvento =codiceEvento;
        this.ban =ban;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getOraEvento() {
        return oraEvento;
    }

    public void setOraEvento(String oraEvento) {
        this.oraEvento = oraEvento;
    }

    public String getRegioneEvento() {
        return regioneEvento;
    }

    public void setRegioneEvento(String regioneEvento) {
        this.regioneEvento = regioneEvento;
    }

    public String getProvinciaEvento() {
        return provinciaEvento;
    }

    public void setProvinciaEvento(String provinciaEvento) {
        this.provinciaEvento = provinciaEvento;
    }

    public String getComuneEvento() {
        return comuneEvento;
    }

    public void setComuneEvento(String comuneEvento) {
        this.comuneEvento = comuneEvento;
    }

    public String getDescrizioneEvento() {
        return descrizioneEvento;
    }

    public void setDescrizioneEvento(String descrizioneEvento) {
        this.descrizioneEvento = descrizioneEvento;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getImmagineURl() {
        return immagineURl;
    }

    public void setImmagineURl(String immagineURl) {
        this.immagineURl = immagineURl;
    }

    public String getCodiceEvento() {
        return codiceEvento;
    }

    public void setCodiceEvento(String codiceEvento) {
        this.codiceEvento = codiceEvento;
    }

    public boolean isBan() {
        return ban;
    }

    public void setBan(boolean ban) {
        this.ban = ban;
    }

    @Override
    public String toString()
    {
        return "Evento{"+
                "id" +id +
                "Nome" +nomeEvento + '/'+
                "data" +dataEvento +'/'+
                "codice" +codiceEvento +'/'+
                "regione" +regioneEvento +'/'+
                "comune" +comuneEvento +'/'+
                "provincia" +provinciaEvento ;




    }

}
