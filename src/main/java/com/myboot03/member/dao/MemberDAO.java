package com.myboot03.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myboot03.member.vo.MemberVO;

@Mapper //Impl ���� �ٷ� member.xml�� ����
@Repository("memberDAO")
public interface MemberDAO {

	//�� ���� ���̹�Ƽ�������� DAO �������̽��� �߻�޼ҵ带 ������ �Ŀ� �������̽� ����Ŭ�������� SqlSession Ŭ������ ���� ������ 
	//SQL���� �����ؼ� ���� ������, ������ ��Ʈ������ ���� Ŭ������ �������� ���� Ŭ�������� DAO �������̽��� �߻� �޼��带 ȣ���ϸ�
	//�������̽������� ���� ���Ͽ��� ȣ��� �̸��� ������ id�� SQL���� �ٷ� ����� �� �ִ�.//�����ޤ���
	public List selectAllMemberList() throws DataAccessException;

	public int insertMember(MemberVO memberVO) throws DataAccessException;

	public int deleteMember(String id) throws DataAccessException;

	public MemberVO loginById(MemberVO memberVO) throws DataAccessException;
}
