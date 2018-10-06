package com.task.forcelate.userandarticles.services;

import com.task.forcelate.userandarticles.entities.Color;
import com.task.forcelate.userandarticles.entities.User;


import java.util.List;

public interface UserService {
    void save(User user);
    User findById(int id);
    List<User> findAll();
    void deleteById(int id);
    List<User> findByAgeAfter(int age);
  List<User> findByColorIs(String color);
   List<User> findWhereArticlesOverThree();

    //void AddArticle(User user,String text,String color);

}
