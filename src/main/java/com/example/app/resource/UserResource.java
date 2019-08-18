package com.example.app.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.dto.BlogProfileDTO;
import com.example.app.dto.BlogProfileResponseDTO;
import com.example.app.dto.UserRequestDTO;
import com.example.app.dto.UserResponseDTO;

@RestController
@RequestMapping("/rest/v1/user")
@Api(value = "User Resource REST Endpoint", description = "Shows the user info")
public class UserResource {
		
    @ApiOperation(value = "Returns registered user with userId passed in")
	@GetMapping("/{userId}")
	public BlogProfileResponseDTO getUser(@PathVariable("userId") final int userId){
		return new BlogProfileResponseDTO("Hana", "Blogname1" , "Sampleblog","traveller",
				"abc@test.com",userId);
	}
	
    @ApiOperation(value = "Register user with Blogger application")
	@PostMapping 
	public UserResponseDTO registerUser(@RequestBody final UserRequestDTO user) {
		return new UserResponseDTO(user.getUserName(),
				user.getEmail(),2);
	}
    
    @ApiOperation(value = "Update password of register user")
	@PatchMapping("/{userId}")
	public ResponseEntity<?> updateUser(@PathVariable("userId") final int userId,
			@RequestBody final String newPassword) {
		return ResponseEntity.ok("password change successful");
	}
	
    @ApiOperation(value = "Update profile of register user")
	@PutMapping("/{userId}")
	public BlogProfileResponseDTO updateUser(@PathVariable("userId") final int userId,
			@RequestBody BlogProfileDTO user) {
		return new BlogProfileResponseDTO(user.getDisplayName(), user.getBlogName() , 
				user.getAboutBlog(),user.getAboutUser(), "abc@test.com", userId);
	}
	
    @ApiOperation(value = "Delete register user")
 	@DeleteMapping("/{userId}")
 	public void deleteUser(@PathVariable("userId") final int userId){
 	}

}


