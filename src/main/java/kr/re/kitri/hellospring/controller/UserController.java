package kr.re.kitri.hellospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.re.kitri.hellospring.model.User;
import kr.re.kitri.hellospring.service.UserService;

@Controller
@ResponseBody	//body 자체를 응답할때사용
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/greet")
	public String hello() {
		return "Hello world";
	}
	
	// 사용자 전체보기
	@GetMapping("/users")
	public List<User> getAllUsers(@RequestParam(value="page", defaultValue="0") int page){
		System.out.println("page number=" + page);
		return userService.searchUsers();
	}
	
	//.. 		http://localhost:8080/users/3
	// 사용자 상세보기
	@GetMapping("/users/{userId}")
	public User getUsersById(@PathVariable Integer userId) {
		System.out.println(userId + " ... from path variable");
		return userService.searchUserByUserid(userId);
	}
	
	// 사용자 등록
	@PostMapping("/users")
	public User registUser(@RequestBody User user) {
		return user;
	}
	// 사용자 수정
	// 사용자 삭제

	
	
}
