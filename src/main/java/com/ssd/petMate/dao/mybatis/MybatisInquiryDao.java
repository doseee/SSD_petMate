package com.ssd.petMate.dao.mybatis;

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.ssd.petMate.dao.InquiryDao;
import com.ssd.petMate.dao.mybatis.mapper.InquiryMapper;
import com.ssd.petMate.domain.Inquiry;
import com.ssd.petMate.page.BoardSearch;

@Repository
public class MybatisInquiryDao implements InquiryDao {

	@Autowired
	private InquiryMapper inquiryMapper;
	
	public List<Inquiry> getAllBoard(BoardSearch boardSearch) throws DataAccessException {
		return inquiryMapper.getAllBoard(boardSearch);
	}
	
	public int boardPageCount(HashMap<String, Object> map) throws DataAccessException {
		return inquiryMapper.boardPageCount(map);
	}
	
	public Inquiry boardDetail(int boardNum) throws DataAccessException {
		return inquiryMapper.boardDetail(boardNum);
	}

	public void insertBoard(Inquiry inquiry) {
		inquiryMapper.insertBoard(inquiry);
	}
}