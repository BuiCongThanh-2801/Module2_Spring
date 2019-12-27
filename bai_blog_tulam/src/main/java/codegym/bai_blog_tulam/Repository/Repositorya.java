package codegym.bai_blog_tulam.Repository;

import codegym.bai_blog_tulam.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorya extends JpaRepository<Blog,Long> {
    Blog findAllByNameBlog(String nameBlog);
}
