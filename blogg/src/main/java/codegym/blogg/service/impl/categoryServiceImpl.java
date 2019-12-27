package codegym.blogg.service.impl;

import codegym.blogg.model.Category;
import codegym.blogg.repository.repositoryBlog;
import codegym.blogg.repository.repositoryCategory;
import codegym.blogg.service.categoryService;
import org.springframework.beans.factory.annotation.Autowired;

public class categoryServiceImpl implements categoryService {
    @Autowired
private repositoryCategory repositoryCategory;

    @Override
    public Iterable<Category> findAll() {
        return repositoryCategory.findAll();
    }

    @Override
    public Category findById(Long id) {
        return repositoryCategory.findById(id).orElse(null);
    }

    @Override
    public void save(Category province) {
        repositoryCategory.save(province);
    }

    @Override
    public void remove(Long id) {
        repositoryCategory.deleteById(id);
    }
}
