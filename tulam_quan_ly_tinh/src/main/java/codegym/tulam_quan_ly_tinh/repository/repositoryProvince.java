package codegym.tulam_quan_ly_tinh.repository;

import codegym.tulam_quan_ly_tinh.model.province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoryProvince extends PagingAndSortingRepository < province, Long> {

}
