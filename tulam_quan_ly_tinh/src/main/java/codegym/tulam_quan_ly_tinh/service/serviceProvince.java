package codegym.tulam_quan_ly_tinh.service;

import codegym.tulam_quan_ly_tinh.model.province;

import java.util.Optional;


public interface serviceProvince {
    Iterable<province> findAll();
     province findById(Long id) ;
     void save(province province);
     void remove(Long id);
}
