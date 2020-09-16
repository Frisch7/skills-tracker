package com.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String index(){
        return "<html>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                "<ol>" +
                "<li> java </li>" +
                "<li> javascript </li>" +
                "<li> python </li>" +
                "</ol>" +
                "<html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String helloForm(){
        String dropDownMenu = "<option value = 'java'>Java</option>" +
                "<option value = 'python'>Python</option>" +
                "<option value = 'javascript'>JavaScript</option>";

        return "<html>" +
                "<body>" +
                "<form action='completeForm' method='post'>" +
                "Name: <br>" +
                "<input type='text' name='name'> <br>" +
                "<br> My favorite language: <br>" +
                "<select name='favoriteLanguage'>" +
                 dropDownMenu +
                "</select>" +
                "<br> My second favorite language: <br>" +
                "<select name='secondFavoriteLanguage'>" +
                dropDownMenu +
                "</select>" +
                "<br> My third favorite language: <br>" +
                "<select name='thirdFavoriteLanguage'>" +
                dropDownMenu +
                "</select> <br>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "completeForm")
    @ResponseBody
    public String createMessage(@RequestParam String name, @RequestParam String favoriteLanguage, @RequestParam String secondFavoriteLanguage, @RequestParam String thirdFavoriteLanguage){
        return "<html>" +
                "<h1> " +
                name +
                " </h1>" +
                "<ol>" +
                "<li> " +
                favoriteLanguage +
                "</li>" +
                "<li> " +
                secondFavoriteLanguage +
                " </li>" +
                "<li> " +
                thirdFavoriteLanguage +
                "</li>" +
                "</ol>" +
                "<html>";
    }

}
