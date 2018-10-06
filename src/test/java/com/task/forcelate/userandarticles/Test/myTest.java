package com.task.forcelate.userandarticles.Test;
import com.task.forcelate.userandarticles.entities.User;
import com.task.forcelate.userandarticles.services.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.util.AssertionErrors;

import static org.junit.Assert.assertEquals;

public class myTest {
@Autowired
    UserService userService;
    @Test
    public void testSave() {
        User us=User.builder().Name("Valik").Age(20).build();
       // userService.save(us));
        //String actual =userService.findById(1).getName();
        String actual=us.getName();
        String expected = "Valik";
        assertEquals(expected,actual);
    }}