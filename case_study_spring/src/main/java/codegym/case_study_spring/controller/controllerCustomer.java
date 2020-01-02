package codegym.case_study_spring.controller;

import codegym.case_study_spring.model.FuramaDichVu;
import codegym.case_study_spring.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controllerCustomer {
    @Autowired
    private DichVuService dichVuService;

    @GetMapping("/")
    public ModelAndView getHomePage(){
       return new ModelAndView("views/index", "listdichvu",dichVuService.getAllDichVu());
    }




}
