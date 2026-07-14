package com.langhanz.workshopmongodb.resources;

import com.langhanz.workshopmongodb.domain.Post;
import com.langhanz.workshopmongodb.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/posts")
public class PostResources {

    @Autowired
    private PostService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id){

        Post post = service.findById(id);

        return ResponseEntity.ok().body(post);

    }

}
