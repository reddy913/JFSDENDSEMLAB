package org.springframework.spring_webmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    // Display greeting message
    @RequestMapping("/welcome")
    public String showGreeting(Model model) {
        model.addAttribute("message", "Welcome to Spring MVC!");
        return "test";
    }

    // Render JSP for test
    @RequestMapping("/test")
    public String renderTest() {
        return "test";
    }

    // Display ID and Name
    @RequestMapping("/showInfo")
    public String showInfo(@RequestParam("id") int id, @RequestParam("name") String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "showInfo";
    }

    // Perform arithmetic operation (sum)
    @RequestMapping("/calculateSum/{num1}/{num2}")
    public String calculateSum(@PathVariable("num1") int num1, @PathVariable("num2") int num2, Model model) {
        int sum = num1 + num2;
        model.addAttribute("result", sum);
        return "calculate";
    }

    // Render Employee Form
    @RequestMapping("/employeeForm")
    public String employeeForm() {
        return "employeeForm";
    }

    // Add two numbers
    @RequestMapping("/addNumbers")
    public String addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int result = num1 + num2;
        model.addAttribute("result", result);
        return "addNumbers";
    }

    // Combine two strings
    @RequestMapping("/combine")
    public String combineStrings(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        String result = str1 + " " + str2;
        model.addAttribute("result", result);
        return "combine";
    }

    // Perform addition and multiplication
    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int sum = num1 + num2;
        int product = num1 * num2;
        model.addAttribute("sum", sum);
        model.addAttribute("product", product);
        return "calculate";
    }
}
