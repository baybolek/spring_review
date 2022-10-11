package com.domain;

import com.domain.model.Comment;
import com.domain.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DomainApplication {

    public static void main(String[] args) {

        Comment comment=new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context=SpringApplication.run(DomainApplication.class, args);

        CommentService cs=context.getBean(CommentService.class);
        cs.publishComment(comment);
           }

}
