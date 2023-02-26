package com.stefanini.dto;

import java.math.BigDecimal;

public class StefamonDTO {

    private Long id;
    private String nome;
    private Integer vida;
    private Integer ataque;
    private Integer defesa;
    private Integer inteligencia;
    private Integer poder;
    private Integer velocidade;
    private String urlFoto;
    private BigDecimal preco;

    public StefamonDTO() {
    }

    public StefamonDTO(Long id, String nome, Integer vida, Integer ataque,
                      Integer defesa, Integer inteligencia, Integer poder,
                      Integer velocidade, String urlFoto) {
      this.id = id;
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

    public BigDecimal getPreco() {
      return BigDecimal.valueOf((vida + ataque + defesa + inteligencia + velocidade + poder) / 6.0);
    }
}
