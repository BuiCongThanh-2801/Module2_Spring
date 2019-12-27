package codegym.blogg.controller;

import codegym.blogg.model.Category;
import codegym.blogg.model.blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Calendar;

@Controller
public class blogcontroller {

    @Autowired
    private blogcontroller blogcontroller;
    @Autowired
    private categorycontroller categorycontroller;

    @ModelAttribute("categories")
    public Iterable<Category> categories() {
        return categorycontroller.findAll();
    }

    @GetMapping("/create-blog")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new blog());
        return modelAndView;

    }
    @PostMapping("/create-blog")
    public ModelAndView saveBlog (@ModelAttribute("blog") blog blog){
        Calendar calendar = Calendar.getInstance();
        blog.setCreateDate(calendar.getTime());
        blogService.save(blog);
    }

}
