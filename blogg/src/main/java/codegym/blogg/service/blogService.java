package codegym.blogg.service;

import codegym.blogg.model.blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface blogService {
    Page<blog> finAll(Pageable pageable);

    blog finById(Long id);

    void save(blog blog);

    void remove(blog blog);

    Page<Long> findAllByTitleContaining(String title, Pageable pageable);
}
