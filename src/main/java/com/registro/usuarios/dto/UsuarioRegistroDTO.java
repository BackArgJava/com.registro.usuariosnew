package com.registro.usuarios.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class UsuarioRegistroDTO {


    private Long Id;
    private String nombre;
    private String apellido;
    private String email;
    private String password;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UsuarioRegistroDTO(Long id, String nombre, String apellido, String email, String password) {
        super();
        Id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
    }

    public UsuarioRegistroDTO(String nombre, String apellido, String email, String password) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
    }

    public UsuarioRegistroDTO(String email) {
        this.email = email;
    }

    public UsuarioRegistroDTO() {
    }
}
