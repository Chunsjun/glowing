package org.myboard.domain;

import java.util.Date;

public class BoardVO extends PageVO{
	private int bno;
	private int uno;
	private String title;
	private String content;
	private String writer;
	private Date date;
	private int viewcnt;
	private int reviewcnt;
	private int fileStatus;

	public BoardVO() {
	}

	public BoardVO(int bno, String title, String content, String writer, Date date, int viewcnt, int uno, int reviewcnt, int fileStatus) {
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.viewcnt = viewcnt;
		this.uno = uno;
		this.reviewcnt = reviewcnt;
		this.fileStatus = fileStatus;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getViewcnt() {
		return viewcnt;
	}

	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	public int getReviewcnt() {
		return reviewcnt;
	}

	public void setReviewcnt(int reviewcnt) {
		this.reviewcnt = reviewcnt;
	}

	public int getFileStatus() {
		return fileStatus;
	}

	public void setFileStatus(int fileStatus) {
		this.fileStatus = fileStatus;
	}

	
}
