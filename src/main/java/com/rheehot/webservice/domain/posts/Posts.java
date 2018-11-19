package com.rheehot.webservice.domain.posts;

//import com.rheehot.webservice.domain.BaseTimeEntity;
import com.rheehot.webservice.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by rheehot@gmail.com on 2018-11-16
 * Blog : http://jowlee.blog.me
 * Github : http://github.com/rheehot
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED) //기본 생성자 자동 추가
@Getter
@Entity
public class Posts extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
