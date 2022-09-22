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
                        "<h1>Skills Tracker</h1>" +
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
                            "<p><label for='firstFavorite'>First Favorite Programming Language: </label>" +
                                "<select name='favoriteOne' id='firstFavorite'>" +
                                    "<option value='java'>Java</option>" +
                                    "<option value='javascript'>JavaScript</option>" +
                                    "<option value='python'>Python</option>" +
                                    "<option value='c#'>C#</option>" +
                                    "<option value='sql'>SQL</option>" +
                                "</select></p>" +
                            "<p><label for='secondFavorite'>Second Favorite Programming Language: </label>" +
                                "<select name='favoriteTwo' id='secondFavorite'>" +
                                    "<option value='java'>Java</option>" +
                                    "<option value='javascript'>JavaScript</option>" +
                                    "<option value='python'>Python</option>" +
                                    "<option value='c#'>C#</option>" +
                                    "<option value='sql'>SQL</option>" +
                                "</select></p>" +
                            "<p><label for='thirdFavorite'>Third Favorite Programming Language: </label>" +
                                "<select name='favoriteThree' id='thirdFavorite'>" +
                                    "<option value='java'>Java</option>" +
                                    "<option value='javascript'>JavaScript</option>" +
                                    "<option value='python'>Python</option>" +
                                    "<option value='c#'>C#</option>" +
                                    "<option value='sql'>SQL</option>" +
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
                            "<h2>Your Favorite Languages</h2>" +
                                "<ol>" +
                                    "<li>" + favoriteOne + "</li>" +
                                    "<li>" + favoriteTwo + "</li>" +
                                    "<li>" + favoriteThree + "</li>" +
                                "</ol>" +
                    "</body>" +
                "</html>";
    }

}
