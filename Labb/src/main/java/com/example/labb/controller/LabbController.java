package com.example.labb.controller;

import com.example.labb.models.LabbPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/start")
public class LabbController {

    List<LabbPost> labbPostList = new ArrayList<>(List.of(
            new LabbPost("Post 1", "Testing"),
            new LabbPost("Post 2", "Testing 2")
    ));

    @GetMapping
    public List<LabbPost> getLabbPostList(){
        return labbPostList;
    }

    @GetMapping("/{id}")
    public LabbPost getLabbPostById(@PathVariable("id") int id){
        return labbPostList.stream()
                .filter(post -> post.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    @PostMapping
    public LabbPost createLabbPost(@RequestBody LabbPost labbPost){
        labbPostList.add(labbPost);
        return labbPost;
    }

    @DeleteMapping("/{id}")
    public void deleteLabbPostById(@PathVariable("id") int id){
        labbPostList.removeIf(post -> post.getId() == id);
    }

}
