package codegym.thuchanh_quanlytinh.service;

import codegym.thuchanh_quanlytinh.model.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}