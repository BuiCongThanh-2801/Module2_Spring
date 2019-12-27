package codegym.blogg.service.impl;

import codegym.blogg.model.blog;
import codegym.blogg.repository.repositoryBlog;
import codegym.blogg.service.blogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class blogServiceImpl implements blogService {
    @Autowired
    private repositoryBlog repositoryBlog;

    @Override
    public Page<blog> finAll(Pageable pageable) {
        return repositoryBlog.findAll(pageable);
    }


    @Override
    public blog finById(Long id) {
        return repositoryBlog.findById(id).orElse(null);
    }

    @Override
    public void save(blog blog) {
        repositoryBlog.save(blog);

    }

    @Override
    public void remove(blog blog) {

    }

    @Override
    public void remove(long id) {
        repositoryBlog.deleteById(id);
    }

    @Override
    public Page<Long> findAllByTitleContaining(String title, Pageable pageable) {
        return repositoryBlog.findAllByTitleContaining(title, pageable);
    }
}
