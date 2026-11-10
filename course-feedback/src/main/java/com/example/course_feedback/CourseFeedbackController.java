package com.example.course_feedback;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseFeedbackController {

    @GetMapping("/")
    public String showForm() {
        return "feedback-form";
    }

    @PostMapping("/submit")
    public String submitFeedback(@RequestParam String courseName,
                                 @RequestParam int rating,
                                 Model model) {
        model.addAttribute("courseName", courseName);
        model.addAttribute("rating", rating);
        return "feedback-success";
    }
}
