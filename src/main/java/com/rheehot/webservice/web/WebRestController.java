package com.rheehot.webservice.web;

import com.rheehot.webservice.domain.PostsRepository;
import com.rheehot.webservice.domain.PostsSaveRequestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rheehot@gmail.com on 2018-11-16
 * Blog : http://jowlee.blog.me
 * Github : http://github.com/rheehot
 */
@RestController
public class WebRestController {

    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    public WebRestController(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }
}
