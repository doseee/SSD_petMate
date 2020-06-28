package com.ssd.petMate.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ssd.petMate.domain.Gpurchase;
import com.ssd.petMate.domain.Info;
import com.ssd.petMate.domain.Inquiry;
import com.ssd.petMate.domain.Order;
import com.ssd.petMate.domain.OrderCommand;
import com.ssd.petMate.domain.Petsitter;
import com.ssd.petMate.domain.Review;
import com.ssd.petMate.domain.SOrderCommand;
import com.ssd.petMate.domain.Secondhand;
import com.ssd.petMate.page.BoardSearch;

public interface MyPageFacade {

	int getPrivateInfoCount(HashMap<String, Object> map); 

	List<Info> getPrivateInfoList(BoardSearch boardSearch);
	
	int getPrivateInquiryCount(HashMap<String, Object> map) throws DataAccessException; 

	List<Inquiry> getPrivateInquiryList(BoardSearch boardSearch) throws DataAccessException; 
	
	int getPrivateSecondhandCount(HashMap<String, Object> map) throws DataAccessException; 

	List<Secondhand> getPrivateSecondhandList(BoardSearch boardSearch) throws DataAccessException; 
	
	int getPrivateGpurchaseCount(HashMap<String, Object> map) throws DataAccessException; 

	List<Gpurchase> getPrivateGpurchaseList(BoardSearch boardSearch) throws DataAccessException; 
	
	int getPrivatePetsitterCount(HashMap<String, Object> map) throws DataAccessException; 

	List<Petsitter> getPrivatePetsitterList(BoardSearch boardSearch) throws DataAccessException; 
	
	int getPrivateReviewCount(HashMap<String, Object> map) throws DataAccessException; 

	List<Review> getPrivateReviewList(BoardSearch boardSearch) throws DataAccessException; 
	
	//여기서부턴 덧글
	int getPrivateInquiryReplyCount(HashMap<String, Object> map) throws DataAccessException; 
	
	List<Inquiry> getPrivateInquiryReplyList(BoardSearch boardSearch) throws DataAccessException;
	
	int getPrivateInfoReplyCount(HashMap<String, Object> map) throws DataAccessException; 

	List<Info> getPrivateInfoReplyList(BoardSearch boardSearch) throws DataAccessException; 
	
	int getPrivateGpurchaseReplyCount(HashMap<String, Object> map) throws DataAccessException; 

	List<Gpurchase> getPrivateGpurchaseReplyList(BoardSearch boardSearch) throws DataAccessException;
	
	int getPrivateSecondhandReplyCount(HashMap<String, Object> map) throws DataAccessException; 

	List<Secondhand> getPrivateSecondhandReplyList(BoardSearch boardSearch) throws DataAccessException;
	
	int getPrivatePetsitterReplyCount(HashMap<String, Object> map) throws DataAccessException; 

	List<Petsitter> getPrivatePetsitterReplyList(BoardSearch boardSearch) throws DataAccessException;
	
	int getPrivateReviewReplyCount(HashMap<String, Object> map); 

	List<Review> getPrivateReviewReplyList(BoardSearch boardSearch);
	
	List<Order> getPrivateOrderList(BoardSearch boardSearch) throws DataAccessException;
	
	int getPrivateOrderListCount(String userID) throws DataAccessException;
	
	OrderCommand getOrderLineItems(int orderNum) throws DataAccessException;
	
	SOrderCommand getOrderSLineItems(int orderNum) throws DataAccessException;

	List<Info> getPrivateInfoLike(BoardSearch boardSearch) throws DataAccessException;

	List<Inquiry> getPrivateInquiryLike(BoardSearch boardSearch) throws DataAccessException;
	
	int getPrivateInfoLikeCount(HashMap<String, Object> map) throws DataAccessException;
	
	int getPrivateInquiryLikeCount(HashMap<String, Object> map)throws DataAccessException;
}