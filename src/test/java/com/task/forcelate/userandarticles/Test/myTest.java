package com.task.forcelate.userandarticles.Test;
import com.task.forcelate.userandarticles.entities.Article;
import com.task.forcelate.userandarticles.entities.Color;
import com.task.forcelate.userandarticles.entities.User;
import com.task.forcelate.userandarticles.services.ArticleService;
import com.task.forcelate.userandarticles.services.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.util.AssertionErrors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class myTest {
//Test amethodthat find user that have age over 50
    @Test
    public void testSave() {
        List<User> users=new ArrayList<>();
        User u1=User.builder().Name("Valik").Age(20).build();
        User u2=User.builder().Name("Sveta").Age(15).build();
        User u3=User.builder().Name("Nata").Age(36).build();
        User u4=User.builder().Name("Sasha").Age(10).build();
        User u5=User.builder().Name("Max").Age(18).build();
        User u6=User.builder().Name("Dima").Age(5).build();
        User u7=User.builder().Name("Sonia").Age(59).build();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);
        users.add(u6);
        users.add(u7);
        List<User> actual = users.stream().filter(a->a.getAge()>50).collect(Collectors.toList());
        List<User> expected=new ArrayList<>();
        expected.add(u7);
        assertEquals(expected,actual);
    }}