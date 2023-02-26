package com.stefanini.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import static com.stefanini.interfaces.messages.NOT_NULL;

@Entity
@Table(name = "tb_stefamon")
public class Stefamon {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotNull(message = NOT_NULL)
    private String nome;

    @Column(nullable = false)
    @NotNull(message = NOT_NULL)
    private Integer vida;

    @Column(nullable = false)
    @NotNull(message = NOT_NULL)
    private Integer ataque;

    @Column(nullable = false)
    @NotNull(message = NOT_NULL)
    private Integer defesa;

    @Column(nullable = false)
    @NotNull(message = NOT_NULL)
    private Integer inteligencia;

    @Column(nullable = false)
    @NotNull(message = NOT_NULL)
    private Integer poder;

    @Column(nullable = false)
    @NotNull(message = NOT_NULL)
    private Integer velocidade;

    @Column(nullable = false)
    @NotNull(message = NOT_NULL)
    private String urlFoto;

    public Stefamon() {}

    public Stefamon(String nome, Integer vida, Integer ataque,
                    Integer defesa, Integer inteligencia,
                    Integer poder, Integer velocidade, String urlFoto) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.inteligencia = inteligencia;
        this.poder = poder;
        this.velocidade = velocidade;
        this.urlFoto = urlFoto;
    }

    public Integer getAtaque() {
      return ataque;
    }
    public Integer getDefesa() {
      return defesa;
    }
    public Long getId() {
      return id;
    }
    public Integer getInteligencia() {
      return inteligencia;
    }
    public String getNome() {
      return nome;
    }
    public Integer getPoder() {
      return poder;
    }
    public String getUrlFoto() {
      return urlFoto;
    }
    public Integer getVelocidade() {
      return velocidade;
    }
    public Integer getVida() {
      return vida;
    }
    
    public void setAtaque(Integer ataque) {
      this.ataque = ataque;
    }
    public void setDefesa(Integer defesa) {
      this.defesa = defesa;
    }
    public void setId(Long id) {
      this.id = id;
    }
    public void setInteligencia(Integer inteligencia) {
      this.inteligencia = inteligencia;
    }
    public void setNome(String nome) {
      this.nome = nome;
    }
    public void setPoder(Integer poder) {
      this.poder = poder;
    }
    public void setUrlFoto(String urlFoto) {
      this.urlFoto = urlFoto;
    }
    public void setVelocidade(Integer velocidade) {
      this.velocidade = velocidade;
    }
    public void setVida(Integer vida) {
      this.vida = vida;
    }
}
