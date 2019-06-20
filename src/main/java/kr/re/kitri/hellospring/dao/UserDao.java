package kr.re.kitri.hellospring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.re.kitri.hellospring.exception.BizException;
import kr.re.kitri.hellospring.model.User;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public User selectUserByKey(Integer userId) {
		String tmpSql = "select * from user where userId = ?";
		try {
			User user = jdbcTemplate.queryForObject(tmpSql, new RowMapper<User>() {
				@Override
				public User mapRow(ResultSet rs, int rowNum) throws SQLException {
					return new User(rs.getInt(1), rs.getString(2), rs.getInt(3));
				}
				
			}, userId);
			return user;
		} catch (DataAccessException e) {
			throw new BizException("사용자 상세조회 에러", e);
		}
		
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

	public User insertUser(User user) {
	    String tmpSql = "insert into user(userid,username,age) values(?,?,?)";
	    jdbcTemplate.update(tmpSql, user.getUserid(), user.getUsername(), user.getAge());
	    System.out.println(tmpSql);
		return user;
	}
}
