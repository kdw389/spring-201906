package kr.re.kitri.hellospring.service;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.re.kitri.hellospring.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {

	@Autowired
	private UserService userService;
	
	// ignore 를 걸면 test에서 제외된다.
	@Ignore
	@Test
	public void testRegistUser() {
		User user = new User(600, "for test", 10);
		User result = userService.registUser(user);
		Assert.assertTrue(user.getUserid() == result.getUserid());
	}
	
	@Test
	public void testSearchUserByUserid() {
		User user = userService.searchUserByUserid(1);
		Assert.assertTrue(user.getUserid() == 1);
	}
}
