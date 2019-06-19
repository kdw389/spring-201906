package kr.re.kitri.hellospring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitri.hellospring.model.User;

@Repository
public class UserDao {

	public User selectUserByKey(Integer userId) {
		
		// 데이터를 확보 .. from anywhere
		
		User user = new User(userId, "김동욱", 30);
		return user;
	}
	
	public List<User> selectAllUsers(){
		List<User> listOfUser = new ArrayList<>();
		listOfUser.add(new User(1, "김동욱", 30));
		listOfUser.add(new User(2, "홍길동", 55));
		listOfUser.add(new User(3, "박서준", 43));
		listOfUser.add(new User(4, "이효리", 32));
		listOfUser.add(new User(5, "김간장", 11));
		listOfUser.add(new User(6, "애간장", 15));
		listOfUser.add(new User(7, "고길동", 16));
		return listOfUser;
	}
}
