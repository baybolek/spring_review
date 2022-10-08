package com.domain.proxy;

import com.domain.model.Comment;

public interface CommentNotificationProxy {


    void sendComment(Comment comment);

}
