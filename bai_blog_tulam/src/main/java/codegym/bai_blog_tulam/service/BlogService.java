package codegym.bai_blog_tulam.service;

import codegym.bai_blog_tulam.model.Blog;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    Blog findById(Long id);
    void save (Blog blog);
    void remove (Long id);
    Blog findALlByNameBlog(String nameBlog);
}
