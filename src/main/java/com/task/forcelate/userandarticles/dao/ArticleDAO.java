package com.task.forcelate.userandarticles.dao;

import com.task.forcelate.userandarticles.entities.Article;
import com.task.forcelate.userandarticles.entities.Color;
import com.task.forcelate.userandarticles.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArticleDAO extends JpaRepository<Article,Integer> {
     List<Article> findByColor(String color);
}
