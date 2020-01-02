package codegym.case_study_spring.repository;

import codegym.case_study_spring.model.FuramaDichVu;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DichVuRepository extends PagingAndSortingRepository<FuramaDichVu, Long> {

}
