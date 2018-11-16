package com.rheehot.webservice.domain;

import com.rheehot.webservice.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rheehot@gmail.com on 2018-11-16
 * Blog : http://jowlee.blog.me
 * Github : http://github.com/rheehot
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {
}