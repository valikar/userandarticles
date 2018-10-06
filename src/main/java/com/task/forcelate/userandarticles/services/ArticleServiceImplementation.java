package com.task.forcelate.userandarticles.services;

import com.task.forcelate.userandarticles.dao.ArticleDAO;
import com.task.forcelate.userandarticles.entities.Article;
import com.task.forcelate.userandarticles.entities.Color;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ArticleServiceImplementation implements ArticleService {
    @Autowired
    ArticleDAO articleDAO;
    @Override
    public void save(Article article) {
    articleDAO.save(article);
    }

    @Override
    public Article findById(int id) {
       return articleDAO.findById(id).get();
    }

//    @Override
//    public List<Article> findByColor(String color) {
//        return articleDAO.findByColor(color);
//    }

    @Override
    public List<Article> findAll() {
        return articleDAO.findAll();
    }

    @Override
    public void deleteById(int id) {
    articleDAO.deleteById(id);
    }


}
