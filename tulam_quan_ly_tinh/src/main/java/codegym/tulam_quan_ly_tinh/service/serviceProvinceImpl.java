package codegym.tulam_quan_ly_tinh.service;

import codegym.tulam_quan_ly_tinh.model.province;
import codegym.tulam_quan_ly_tinh.repository.repositoryProvince;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class serviceProvinceImpl implements serviceProvince {
   @Autowired
   private repositoryProvince repositoryProvince;

    @Override
    public Iterable<province> findAll() {
        return  repositoryProvince.findAll();
    }

    @Override
    public province findById(Long id) {
        return repositoryProvince.findById(id).orElse(null);
    }

    @Override
    public void save(province province) {
        repositoryProvince.save(province);
    }

    @Override
    public void remove (Long id) {
        repositoryProvince.deleteById(id);
    }
}
