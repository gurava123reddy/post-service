package com.thinkconstructive.postservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {
	
	@GetMapping(value = "/{postId}")
	public Posts getPost(@PathVariable("postId") String postId) {
		Posts postOne  = new Posts("1", "Post Description for "+postId);
		return postOne;
	}

}
