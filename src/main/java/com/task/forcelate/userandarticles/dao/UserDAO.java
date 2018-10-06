package com.task.forcelate.userandarticles.dao;

import com.task.forcelate.userandarticles.entities.Color;
import com.task.forcelate.userandarticles.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface UserDAO extends JpaRepository<User,Integer> {
//@Query("select u from User u where u.age=:age"  )
//List<User> findByAgeAfter(/*@Param("age")*/int age);
//@Query("select u from User u join Article a  where a.color=:color")
// List<User> findByColorIs( @Param("color")String color);
//@Query("select  distinct u from User u  join Article a group by u.id having count(a.id)>3 ")
// List<User> findWhereArticlesOverThree();
 }
