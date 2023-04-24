package com.myboot03.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myboot03.member.vo.MemberVO;

@Mapper //Impl 없이 바로 member.xml과 매핑
@Repository("memberDAO")
public interface MemberDAO {

	//그 전에 마이바티스에서는 DAO 인터페이스에 추상메소드를 선언한 후에 인터페이스 구현클래스에서 SqlSession 클래스로 매퍼 파일의 
	//SQL문에 접근해서 실행 헀지만, 스프링 부트에서는 구현 클래스가 없어지고 서비스 클래스에서 DAO 인터페이스의 추상 메서드를 호출하면
	//인터페이스에서는 매퍼 파일에서 호출된 이름과 동일한 id의 SQL문을 바로 사용할 수 있다.//ㅎㄴ읻ㅈㄷ
	public List selectAllMemberList() throws DataAccessException;

	public int insertMember(MemberVO memberVO) throws DataAccessException;

	public int deleteMember(String id) throws DataAccessException;

	public MemberVO loginById(MemberVO memberVO) throws DataAccessException;
}
