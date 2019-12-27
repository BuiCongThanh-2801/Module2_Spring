package codegym.bai_blog_tulam.controller;

import codegym.bai_blog_tulam.model.Blog;
import codegym.bai_blog_tulam.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("views/create");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @RequestMapping("/create-blog")
    public ModelAndView saveBlog(@ModelAttribute("blog") Blog blog) {
        blogService.save(blog);

        ModelAndView modelAndView = new ModelAndView("views/create");
        modelAndView.addObject("blog", new Blog());
        modelAndView.addObject("message", "New blog create successfully");
        return modelAndView;
    }

    @GetMapping("/blogs")
    public ModelAndView listBlog() {
        ModelAndView modelAndView = new ModelAndView("views/list");
        modelAndView.addObject("blogs", blogService.findAll());
        return modelAndView;
    }

    @GetMapping("/delete-blog/{id}")
    public ModelAndView showdeleteBlog(@PathVariable Long id) {
        // Blog blog= blogService.findById(id);
        blogService.remove(id);
        ModelAndView modelAndView = new ModelAndView("views/list");
        // modelAndView.addObject("blog",blog);
        return modelAndView;
    }

    @GetMapping("/edit-blog/{id}")
    public ModelAndView showeditBlog(@PathVariable Long id) {
        Blog blog = blogService.findById(id);
        if (blog != null) {
            ModelAndView modelAndView = new ModelAndView("views/edit");
            modelAndView.addObject("blog", blog);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/erro.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-blog")
    public ModelAndView editBlog(@ModelAttribute("Blog") Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView= new ModelAndView("views/edit");
        modelAndView.addObject("blog",blog);
        modelAndView.addObject("message", "Blog update successful");
        return modelAndView;

    }

}
