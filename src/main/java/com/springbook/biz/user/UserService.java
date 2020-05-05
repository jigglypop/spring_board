package com.springbook.biz.user;

import com.springbook.biz.user.UserVO;

public interface UserService {

	// CRUD 기능의 메서드 구현
	// 회원 등록
	UserVO getUser(UserVO vo);

}