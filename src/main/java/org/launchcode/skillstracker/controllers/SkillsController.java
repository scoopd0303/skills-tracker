package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("")
    public String possibleLanguages() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</h2>";
    }

    @GetMapping("form")
    public String orderFavorites() {
        return "<html>" +
                "<body>" +
                "<form action='completed-form' method='post'>" +
                "<label>Name:</label><br>" +
                "<input type='text' name='name'><br>" +
                "<label for='firstChoice'>My favorite language:</label><br>" +
                "<select id='firstChoice' name='firstLanguage'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +
                "<label for='secondChoice'>My second favorite language:</label><br>" +
                "<select id='secondChoice' name='secondLanguage'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +
                "<label for='thirdChoice'>My third favorite language:</label><br>" +
                "<select id='thirdChoice' name='thirdLanguage'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +
                "<input type='submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("completed-form")
    public String postUsersOrder(@RequestParam String name, String firstLanguage, String secondLanguage, String thirdLanguage) {

        return "<h1>" + name + "</h1>" +
                "<h2>" +
                "<ol>" +
                "<li>" + firstLanguage + "</li>" +
                "<li>" + secondLanguage + "</li>" +
                "<li>" + thirdLanguage + "</li>" +
                "</ol>" +
                "</h2>";
    }


}
