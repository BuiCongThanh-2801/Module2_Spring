package codegym.bai_blog_tulam.service;

import codegym.bai_blog_tulam.Repository.Repositorya;
import codegym.bai_blog_tulam.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private Repositorya repository;

    @Override
    public List<Blog> findAll() {
        return repository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        repository.save(blog);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }


    @Override
    public Blog findALlByNameBlog(String nameBlog) {
        return repository.findAllByNameBlog(nameBlog);
    }


}
