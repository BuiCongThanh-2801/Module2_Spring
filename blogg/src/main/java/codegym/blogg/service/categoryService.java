package codegym.blogg.service;

import codegym.blogg.model.Category;

public interface categoryService {
    Iterable<Category> findAll();

    Category findById(Long id);

    void save(Category category);

    void remove(Long id);
}
