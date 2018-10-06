package com.task.forcelate.userandarticles.services;

import com.task.forcelate.userandarticles.entities.Article;
import com.task.forcelate.userandarticles.entities.Color;
import com.task.forcelate.userandarticles.entities.User;


import java.util.List;

public interface ArticleService   {
    void save(Article article);
    Article findById(int id);
//    List<Article> findByColor(String color);
    List<Article> findAll();
    void deleteById(int id);
}
