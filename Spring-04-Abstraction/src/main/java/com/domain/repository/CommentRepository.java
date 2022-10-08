package com.domain.repository;

import com.domain.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
