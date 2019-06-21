package kr.re.kitri.hellospring.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.re.kitri.hellospring.model.User;

@Repository
public class UserDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public User insertUser(User user) {
		//몇개가 업데이트 되었는지 리턴함.
		int updated = sqlSession.update(
				"kr.re.kitri.hellospring.dao.UserDao.insertUser"
				, user);
		return user;
	}

	public User selectUserByKey(Integer userId) {
		User user = sqlSession.selectOne(
				"kr.re.kitri.hellospring.dao.UserDao.selectUserByKey"
				, userId);
		return user;
	}
	
}
