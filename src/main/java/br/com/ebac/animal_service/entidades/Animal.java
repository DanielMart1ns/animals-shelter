package br.com.ebac.animal_service.entidades;

import jakarta.persistence.*;

import java.sql.Date;

//Nossa entidade com metadados para a manipulação e modelagem dos dados ao banco
@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId(){
        return id;
    }

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String nomeProvisorio;

    @Column(nullable = false)
    private String idadeEstimada;

    @Column(nullable = false)
    private String raca;

    @Column(nullable = false)
    private Date dataEntrada;

    @Column
    private Date dataAdocao;

    @Column
    private Date dataObito;

    @Column(nullable = false)
    private String condicoesDeChegada;

    @Column(nullable = false)
    private String nomeRecebedor;

    @Column(nullable = false)
    private String porte;

    //Getters and Setters
    public String getNomeProvisorio() {
        return nomeProvisorio;
    }

    public void setNomeProvisorio(String nomeProvisorio) {
        this.nomeProvisorio = nomeProvisorio;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCondicoesDeChegada() {
        return condicoesDeChegada;
    }

    public void setCondicoesDeChegada(String condicoesDeChegada) {
        this.condicoesDeChegada = condicoesDeChegada;
    }

    public Date getDataObito() {
        return dataObito;
    }

    public void setDataObito(Date dataObito) {
        this.dataObito = dataObito;
    }

    public Date getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(Date dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getIdadeEstimada() {
        return idadeEstimada;
    }

    public void setIdadeEstimada(String idadeEstimada) {
        this.idadeEstimada = idadeEstimada;
    }
}
