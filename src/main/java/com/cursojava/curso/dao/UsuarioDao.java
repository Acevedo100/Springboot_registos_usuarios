package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;

import java.util.List;


public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void Eliminar(Long id);

    void registrar(Usuario usuario);

    boolean verificarCredenciales(Usuario usuario);
}
