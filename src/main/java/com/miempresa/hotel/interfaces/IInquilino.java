package com.miempresa.hotel.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miempresa.hotel.modelo.Inquilino;

@Repository
public interface IInquilino   extends CrudRepository <Inquilino,Integer> {

}
