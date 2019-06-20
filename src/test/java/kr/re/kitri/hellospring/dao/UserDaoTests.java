package kr.re.kitri.hellospring.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.re.kitri.hellospring.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTests {

	@Autowired
	private UserDao userdao;
	
	@Test
	public void testInsertUser() {
		User user = new User(500, "테스트계정", 32);
		User returned = userdao.insertUser(user);
		//괄호안에 있는게 참인지를 Check
		//Assert.assertTrue(user.getUserid() == returned.getUserid());
		Assert.assertNotNull(returned);
	}
}
