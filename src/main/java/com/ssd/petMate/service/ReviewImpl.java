package com.ssd.petMate.service;

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ssd.petMate.dao.ReviewDao;
import com.ssd.petMate.domain.Review;
import com.ssd.petMate.page.BoardSearch;

@Service
@Transactional
public class ReviewImpl implements ReviewFacade { 
	@Autowired
	private ReviewDao reviewDao;

	//-------------------------------------------------------------------------
	// Operation methods, implementing the PetStoreFacade interface
	//-------------------------------------------------------------------------
	public List<Review> getAllBoard(BoardSearch boardSearch){
		return reviewDao.getAllBoard(boardSearch);
	}
	
	public int boardPageCount(HashMap<String, Object> map) {
		return reviewDao.boardPageCount(map);
	}
}