/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;
import javax.management.loading.PrivateClassLoader;

/**
 *
 * @author nunes
 */
public class Cliente {
    private int id;
    private String nome;
    private char sexo;
    private Date nascimento;
    private String fone;
    private String email;
    private String rg;
    private String endereco;
    private String cep;

    public Cliente(int id, String nome, char sexo, Date nascimento, String fone, String email, String rg, String endereco, String cep) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.fone = fone;
        this.email = email;
        this.rg = rg;
        this.endereco = endereco;
        this.cep = cep;
    }

    
    
    public Cliente(int id, String nome, char sexo, String fone, String endereco) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.fone = fone;
        this.endereco = endereco;
    }

    public Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
}
