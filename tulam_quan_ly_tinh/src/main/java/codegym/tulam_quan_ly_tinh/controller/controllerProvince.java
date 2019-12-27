package codegym.tulam_quan_ly_tinh.controller;

import codegym.tulam_quan_ly_tinh.model.province;
import codegym.tulam_quan_ly_tinh.service.serviceProvince;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class controllerProvince {

    @Autowired
    private serviceProvince serviceProvince;

    @GetMapping("/create-province")
    public ModelAndView showForm(){
        ModelAndView modelAndView= new ModelAndView("views/create");
        modelAndView.addObject("province", new province());
        return modelAndView;
    }

    @PostMapping("/create-province")
    public ModelAndView createProvince(@ModelAttribute("province") province province){
        serviceProvince.save(province);

        ModelAndView modelAndView= new ModelAndView("views/create");
        modelAndView.addObject("province", province);
        modelAndView.addObject("message", "New province created successfully");
        return modelAndView;
    }
    @GetMapping("/list-provinces")
    public ModelAndView listProvince(){
        Iterable<province> provinces= serviceProvince.findAll();
        ModelAndView modelAndView= new ModelAndView("views/list");
        modelAndView.addObject("provinces",provinces);
        return modelAndView;
    }
    @GetMapping("/edit-province/{id}")
    public ModelAndView showeditProvinces(@PathVariable Long id){
        province provinces= serviceProvince.findById(id);
        if (provinces!=null){
            ModelAndView modelAndView= new ModelAndView("views/edit");
            modelAndView.addObject("province",provinces);
             return modelAndView;
        }else {
            ModelAndView modelAndView= new ModelAndView("error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-province")
    public ModelAndView editProvinces(@ModelAttribute("province") province province){
        serviceProvince.save(province);
        ModelAndView modelAndView= new ModelAndView("views/edit");
        modelAndView.addObject("province",province );
        modelAndView.addObject("message","Province updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-province/{id}")
    public ModelAndView showDelete(@PathVariable Long id){
        province provinces=serviceProvince.findById(id);
        if (provinces!=null){
            ModelAndView modelAndView= new ModelAndView("views/delete");
            modelAndView.addObject("province",provinces);
            return modelAndView;
        }else {
            ModelAndView modelAndView= new ModelAndView("error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-province")
    public ModelAndView deleteProvince(@ModelAttribute("province") province province){
         serviceProvince.remove(province.getIdProvince());
        Iterable<province> provinces= serviceProvince.findAll();
        ModelAndView modelAndView1= new ModelAndView("views/list");
        modelAndView1.addObject("provinces",provinces);
        return modelAndView1;
    }



}
