package codegym.blogg.repository;

import codegym.blogg.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface repositoryCategory extends PagingAndSortingRepository<Category, Long> {
}
