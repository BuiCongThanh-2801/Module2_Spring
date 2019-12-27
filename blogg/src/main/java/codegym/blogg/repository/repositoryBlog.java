package codegym.blogg.repository;

import codegym.blogg.model.blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface repositoryBlog extends PagingAndSortingRepository<blog, Long> {
    Page<Long> findAllByTitleContaining(String title, Pageable pageable);
}
