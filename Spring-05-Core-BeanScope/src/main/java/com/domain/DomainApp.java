package com.domain;

import com.domain.config.ProjectConfig;
import com.domain.model.Comment;
import com.domain.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DomainApp {

    public static void main(String[] args) {

        Comment comment=new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext container=new AnnotationConfigApplicationContext(ProjectConfig.class);

//        Singleton Scope these objects will be the same
//        prototype will tell spring create different objects from the same class
        CommentService cs1=container.getBean(CommentService.class);
//        CommentService cs2=container.getBean(CommentService.class);
//
//
//        System.out.println(cs1);
//        System.out.println(cs2);
//
//        System.out.println(cs1==cs2);


    }
}
