package com.ssd.petMate.domain;

import java.util.Date;

public class Secondhand {
	private int boardNum;
	private String boardDate;
	private String userID;
	private String boardContent;
	private int cartAdded;
	private int price;
	private String boardImage;
	private int boardHit;
	private int replyCnt;
	private String boardTitle;
	
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public int getCartAdded() {
		return cartAdded;
	}
	public void setCartAdded(int cartAdded) {
		this.cartAdded = cartAdded;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBoardImage() {
		return boardImage;
	}
	public void setBoardImage(String boardImage) {
		this.boardImage = boardImage;
	}
	public int getBoardHit() {
		return boardHit;
	}
	public void setBoardHit(int boardHit) {
		this.boardHit = boardHit;
	}
	public int getReplyCnt() {
		return replyCnt;
	}
	public void setReplyCnt(int replyCnt) {
		this.replyCnt = replyCnt;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	@Override
	public String toString() {
		return userID + " " +boardTitle + " " +boardContent + " " +price + " " +boardNum;
	}
	
}
