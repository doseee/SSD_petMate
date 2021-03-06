package com.ssd.petMate.service;

import java.util.HashMap;
import java.util.List;

import com.ssd.petMate.domain.ReviewReply;

public interface ReviewReplyFacade {

	List<ReviewReply> getReplyList(int boardNum);
	
	void insertReply(ReviewReply reply);
	
	void updateReply(ReviewReply reply);
	
	void deleteReply(int replyNum);
	
	ReviewReply replyDetail(int replyNum);
	
	int replyCnt(int boardNum);
	
	void setReplyOrder(HashMap<String, Object> map);
	
	int countSameGID(int replyNum);
}
