package com.task.forcelate.userandarticles.services;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.task.forcelate.userandarticles.dao.ArticleDAO;
import com.task.forcelate.userandarticles.dao.UserDAO;
import com.task.forcelate.userandarticles.entities.Article;
import com.task.forcelate.userandarticles.entities.Color;
import com.task.forcelate.userandarticles.entities.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Service
@Transactional
public class UserServiceImplemention implements UserService {
    @Autowired
    UserDAO userDAO;
    @Autowired
    ArticleDAO articleDAO;
    @Override
    public void save(User user) {
     userDAO.save(user);
    }



    @Override
    public User findById(int id) {
        return userDAO.findById(id).get();
    }

    @Override
    public List<User> findByAgeAfter(int age) {
        return userDAO.findAll().stream().filter(a->a.getAge()>age).collect(Collectors.toList());
    }

    @Override
    public List<User> findByColorIs(String color) {
         //List<User>users

//                 userDAO.findAll().stream()..filter(a->a.getArticles().stream().filter(b->b.getColor().toString().equals(color)));
        return articleDAO.findAll().stream().filter(a->a.getColor().toString().equals(color)).map(article ->article.getUser()).collect(Collectors.toList());
    }
//
    @Override
    public List<User> findWhereArticlesOverThree() {
        return userDAO.findAll().stream().filter(a->a.getArticles().size()>3).distinct().collect(Collectors.toList());
    }
//
  @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }



    @Override
    public void deleteById(int id) {
    userDAO.deleteById(id);
    }


}
