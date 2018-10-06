package com.task.forcelate.userandarticles.controllers;

import com.task.forcelate.userandarticles.entities.Article;
import com.task.forcelate.userandarticles.entities.Color;
import com.task.forcelate.userandarticles.entities.User;
import com.task.forcelate.userandarticles.services.ArticleService;
import com.task.forcelate.userandarticles.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    UserService userService;
    @Autowired
    ArticleService articleService;
     @GetMapping("/api")
         public String startDATA(){
            User u1=User.builder().Name("Valik").Age(20).build();
            userService.save(u1);
            User u2=User.builder().Name("Sveta").Age(15).build();
         userService.save(u2);
            User u3=User.builder().Name("Nata").Age(36).build();
         userService.save(u3);
            User u4=User.builder().Name("Sasha").Age(10).build();
         userService.save(u4);
            User u5=User.builder().Name("Max").Age(18).build();
         userService.save(u5);
            User u6=User.builder().Name("Dima").Age(5).build();
         userService.save(u6);
            User u7=User.builder().Name("Sonia").Age(59).build();
         userService.save(u7);
           Article a1 =Article.builder().text("My love").user(u1).color(Color.BLACK).build();
           articleService.save(a1);
         Article a2 =Article.builder().text("Hello").user(u1).color(Color.WHITE).build();
         articleService.save(a2);
         Article a3 =Article.builder().text("Good day").user(u1).color(Color.GREEN).build();
         articleService.save(a3);
         Article a4 =Article.builder().text("Good back").user(u1).color(Color.YELLOW).build();
         articleService.save(a4);
         Article a5 =Article.builder().text("Good day").user(u2).color(Color.GREEN).build();
         articleService.save(a5);
         Article a6 =Article.builder().text("Good back").user(u2).color(Color.YELLOW).build();
         articleService.save(a6);
         Article a7 =Article.builder().text("My weather").user(u3).color(Color.WHITE).build();
         articleService.save(a7);
         Article a8 =Article.builder().text("Mr tender").user(u4).color(Color.YELLOW).build();
         articleService.save(a8);
         Article a9 =Article.builder().text("Good luck ").user(u5).color(Color.SNOW).build();
         articleService.save(a9);
         Article a10 =Article.builder().text("Miner null pointer").user(u6).color(Color.GRAY).build();
         articleService.save(a10);
         Article a11 =Article.builder().text("Father").user(u7).color(Color.YELLOW).build();
         articleService.save(a11);





             return "START DATA IS LOADED";
         }
    @PostMapping("/api/user")
    void create(@RequestBody Map<String,String> params)
    {
        String name=params.get("name");
        int age=Integer.parseInt(params.get("age")) ;
        User user = User.builder().Name(name).Age(age).build();
        userService.save(user);
    }
     @GetMapping("/api/users")
         public List<User> findAll (){
             return userService.findAll();
         }
    @GetMapping("/api/user/{id}")
    public User findById (@PathVariable int id){
        return userService.findById(id);
    }
    @PostMapping("/api/user/age")
    public List<User> findByAgeAfter (@RequestBody Map<String,String> params){
         int age=Integer.parseInt(params.get("age")) ;
        return userService.findByAgeAfter(age);
    }
    @PostMapping("/api/user/article/color")
    public List<User> findByColor (@RequestBody Map<String,String> params)
    {   String color =params.get("color") ;
            return userService.findByColorIs(color);
    }
    @DeleteMapping("/api/user/{id}")
    public boolean deleteById (@PathVariable int id){
             userService.deleteById(id);
            return true;
            }
    @PostMapping("/api/user/{id}/article")
    void createArticle(@RequestBody Map<String,String> params,
                       @PathVariable int id                       )
    {  User user=userService.findById(id);
        String text=params.get("text");
        Color color =Color.valueOf(params.get("color")) ;
        Article article = Article.builder().text(text).color(color).user(user).build();
        articleService.save(article);
    }
    @PostMapping("/api/user/countarticle/overthree")
    public List<User> findWhereArticleOver (){
        return userService.findWhereArticlesOverThree();
    }
    @GetMapping("/api/article/{id}")
    public Article findByIdArt (@PathVariable int id){
                return articleService.findById(id);
    }
    @DeleteMapping("/api/article/{id}")
    public boolean deleteByIdArt (@PathVariable int id){
        articleService.deleteById(id);
        return true;
    }
    @GetMapping("/api/articles")
    public List<Article> findAllArt (){
        return articleService.findAll();
    }
}
