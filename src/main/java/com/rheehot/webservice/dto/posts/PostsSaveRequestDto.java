package com.rheehot.webservice.dto.posts;

import com.rheehot.webservice.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by rheehot@gmail.com on 2018-11-19
 * Blog : http://jowlee.blog.me
 * Github : http://github.com/rheehot
 */
@Getter
@Setter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
