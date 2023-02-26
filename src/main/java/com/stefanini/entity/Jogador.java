package com.stefanini.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.stefanini.interfaces.messages.*;

@Entity
@Table(schema = "tb_jogador")
public class Jogador {
    @Id
    @Column(name = "id_jogador", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    @NotNull(message = NOT_NULL)
    private String nickname;

    @Column(nullable = false)
    @NotNull(message = NOT_NULL)
    @Size(min = 4, max = 10, message = PASSWORD_SIZE)
    private String password;

    @Column
    private BigDecimal saldo;


    @ManyToMany
    @JoinTable(name = "jogador_stefamon",
            joinColumns = {@JoinColumn(name = "idJogador")},
            inverseJoinColumns = {@JoinColumn(name = "idStefamon")})
    private List<Stefamon> stefamons = new ArrayList<>();

    public Jogador() {}

    public Jogador(String nickname, String password, BigDecimal saldo, List<Stefamon> stefamons) {
        this.nickname = nickname;
        this.password = password;
        this.saldo = saldo;
        this.stefamons = stefamons;
    }

    public Long getId() {
      return id;
    }

    public String getNickname() {
      return nickname;
    }

    public String getPassword() {
      return password;
    }

    public BigDecimal getSaldo() {
      return saldo;
    }

    public List<Stefamon> getStefamons() {
      return stefamons;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public void setNickname(String nickname) {
      this.nickname = nickname;
    }

    public void setPassword(String password) {
      this.password = password;
    }

    public void setSaldo(BigDecimal saldo) {
      this.saldo = saldo;
    }

    public void setStefamons(List<Stefamon> stefamons) {
      this.stefamons = stefamons;
    }

}
