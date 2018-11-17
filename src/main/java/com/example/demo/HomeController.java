package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    CourseRepository courseRepository;
    @RequestMapping("/update/{id}")
    public String updateCourse(@PathVariable("id") long id,
                               Model model){
        model.addAttribute("course", courseRepository.findOne(id));
        return "courseform";
    }
    @RequestMapping("/delete/{id}")
    public String delCourse(@PathVariable("id") long id){
        courseRepository.deleteById(id);
        return "redirect:/";
    }
}
