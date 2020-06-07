package com.ssd.petMate.dao.mybatis.mapper;

import java.util.HashMap;
import java.util.List;

import com.ssd.petMate.domain.ReviewReply;
import com.ssd.petMate.page.pageMaker;

public interface ReviewReplyMapper {

	List<ReviewReply> getReplyList(pageMaker page);
	
	void insertReply(ReviewReply reply);
	
	void updateReply(ReviewReply reply);
	
	void deleteReply(int replyNum);
	
	ReviewReply getReply(int replyNum);
	
	int replyCount(int boardNum);
	
	void setReplyOrder(HashMap<String, Object> map);
	
	int findLastReplyID(int replyNum);
	
	int countSameGID(int replyNum);
}
