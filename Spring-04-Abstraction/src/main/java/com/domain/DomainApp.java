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

        CommentService commentService=container.getBean(CommentService.class);

        commentService.publishComment(comment);

    }
}
