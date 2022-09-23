package org.launchcode.skillstracker.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String home() {
        return "<html>" +
                    "<body>" +
                        "<h1>**Skills Tracker**</h1>" +
                            "<ol>" +
                                "<li>Java</li>" +
                                "<li>JavaScript</li>" +
                                "<li>Python</li>" +
                                "<li>C#</li>" +
                                "<li>SQL</li>" +
                            "</ol>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String form(){
        return "<html>" +
                    "<body>" +
                        "<form method='post' action=''>" +
                            "<p><input placeholder='name' name='name'></p>" +
                            "<p><label for='firstFavorite'>Your first favorite programming language: </label>" +
                                "<select name='favoriteOne' id='firstFavorite'>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Python'>Python</option>" +
                                    "<option value='C#'>C#</option>" +
                                    "<option value='SQL'>SQL</option>" +
                                "</select></p>" +
                            "<p><label for='secondFavorite'>Your second favorite language: </label>" +
                                "<select name='favoriteTwo' id='secondFavorite'>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Python'>Python</option>" +
                                    "<option value='C#'>C#</option>" +
                                    "<option value='SQL'>SQL</option>" +
                                "</select></p>" +
                            "<p><label for='thirdFavorite'>Your third favorite: </label>" +
                                "<select name='favoriteThree' id='thirdFavorite'>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Python'>Python</option>" +
                                    "<option value='C#'>C#</option>" +
                                    "<option value='SQL'>SQL</option>" +
                              "</select></p>" +
                            "<p><input type='submit' value='Submit'></p>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String formSubmitted(@RequestParam String name, @RequestParam String favoriteOne, @RequestParam String favoriteTwo, @RequestParam String favoriteThree) {
        return "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1>" +
                            "<h2>Here are your favorite programming languages:</h2>" +
                                "<ul>" +
                                    "<li>" + favoriteOne + "</li>" +
                                    "<li>" + favoriteTwo + "</li>" +
                                    "<li>" + favoriteThree + "</li>" +
                                "</ul>" +
                    "</body>" +
                "</html>";
    }

}
