package com.example.app.resource;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.dto.CommentRequestDTO;
import com.example.app.dto.CommentResponseDTO;
import com.example.app.dto.PostRequestDTO;
import com.example.app.dto.PostResponseDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/rest/v1/post")
@Api(value = "Post Resource REST Endpoint", description = "Shows the post info of a blog")

public class PostResource {
	    @ApiOperation(value = "Returns posts for blog")
		@GetMapping 
		public List<PostResponseDTO> getPosts(){
	    	    	
	    	List<CommentResponseDTO> comments =  new ArrayList<CommentResponseDTO>();
	    	comments.add(new CommentResponseDTO(1,"Good",2,1,Date.valueOf("2019-10-23")));
	    	comments.add(new CommentResponseDTO(1,"Good",2,1,Date.valueOf("2019-10-23")));
	    	
			return Arrays.asList(new PostResponseDTO(1,"First Post", " This is first post",
					3, Date.valueOf("2019-10-23"),comments),
					new PostResponseDTO(1,"First Post", " This is first post",
							3, Date.valueOf("2019-10-23"),comments));
		}
		
	    @ApiOperation(value = "Returns Post with postId passed in")
		@GetMapping("/{postId}")
		public PostResponseDTO getPost(@PathVariable("postId") final int userId){
	    	List<CommentResponseDTO> comments =  new ArrayList<CommentResponseDTO>();
	    	comments.add(new CommentResponseDTO(1,"Good",2,1,Date.valueOf("2019-10-23")));

			return new PostResponseDTO(1,"First Post", " This is first post",
					3, Date.valueOf("2019-10-23"),comments);
		}
		
	    @ApiOperation(value = "Create a post for blog with id passed in")
		@PostMapping
		public PostResponseDTO createPost(@RequestBody final PostRequestDTO post) {
			return new PostResponseDTO(1,post.getPostName(), post.getPostText(),
					3, Date.valueOf("2019-10-23"), new ArrayList<>());
		}
		
	    @ApiOperation(value = "Update post postId passed in")
		@PutMapping("/{postId}")
		public  PostResponseDTO updatePost(@PathVariable("postId") final Integer postId,
				@RequestBody PostRequestDTO post) {
	    	List<CommentResponseDTO> comments =  new ArrayList<CommentResponseDTO>();
	    	comments.add(new CommentResponseDTO(1,"Good",2,1,Date.valueOf("2019-10-23")));

			return new PostResponseDTO(postId,post.getPostName(), post.getPostText(),
					3, Date.valueOf("2019-10-23"),comments);
	    	//return ResponseEntity.ok("post updated");

		}
	    
	    @ApiOperation(value = "Update like count of postId passed in")
		@PatchMapping("/{postId}")
		public Integer updateLikeCountOfPost(@RequestBody final int likeStatus,
				@PathVariable("postId") final int postId) {
	    	return 3;
	    }
		
	    @ApiOperation(value = "Delete post with postId passed in")
	 	@DeleteMapping("/{postId}")//("/remove")
	 	public void deletePost(@PathVariable("postId") final int postId){
	    	
	 	}
	    
	    @ApiOperation(value = "add comment to a post with postId passed in")
	    @PostMapping("/{postId}/comments")
		public CommentResponseDTO addComment(@PathVariable("postId") final int postId,
				@RequestBody final String comment) {
	    	
	    	return new CommentResponseDTO(1,comment,0,1,Date.valueOf("2019-10-23"));
		}
	    
	    @ApiOperation(value = "delete comment with commentId passed in")
	    @DeleteMapping("/{postId}/comments/{commentId}")
		public void deleteComment(@PathVariable("postId") final int postId, @PathVariable("commentId") final int commentId ) {
	    	
		}
	    @ApiOperation(value = "get comments to a post with postId passed in")
	    @GetMapping("/{postId}/comments")
		public List<CommentResponseDTO> getComments(@PathVariable("postId") final int postId) {
	    	List<CommentResponseDTO> comments =  new ArrayList<CommentResponseDTO>();

	    	comments.add(new CommentResponseDTO(1, "testComment", 2, 11,Date.valueOf("2019-10-23")));
	    	comments.add(new CommentResponseDTO(1, "testComment", 2, 11,Date.valueOf("2019-10-23")));
	    	return comments;
	    }
	    
	    @ApiOperation(value = "get comment details of commentId passed in")
	    @GetMapping("/{postId}/comments/{commentId}")
		public CommentResponseDTO getComment(@PathVariable("postId") final int postId, @PathVariable("commentId") final int commentId) {

	    	return new CommentResponseDTO(1, "testComment", 2, 11,Date.valueOf("2019-10-23"));
	    	
	    }
	    
	    @ApiOperation(value = "update likecount of a comment with id commentI")
		@PatchMapping("/{postId}/comments/{commentId}")
		public Integer updateLikeComment(@PathVariable("postId") final int postId,
				@PathVariable("commentId") final int commentId ,@RequestBody final int likeStatus ) {
	    	return 5;
		}
	    
	    
	}


