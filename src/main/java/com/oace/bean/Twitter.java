package com.oace.bean;

public class Twitter {
    public Twitter(String twtId, String selfid, String twitterhead, String userid, String date, String imgurl,
			String twitterType) {
		super();
		this.twtId = twtId;
		this.selfid = selfid;
		this.twitterhead = twitterhead;
		this.userid = userid;
		this.date = date;
		this.imgurl = imgurl;
		this.twitterType = twitterType;
	}

	private String twtId;

    private String selfid;

    private String twitterhead;

    private String userid;

    private String date;

    private String imgurl;

    private String twitterType;

    public String getTwtId() {
        return twtId;
    }

    public void setTwtId(String twtId) {
        this.twtId = twtId == null ? null : twtId.trim();
    }

    public String getSelfid() {
        return selfid;
    }

    public Twitter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setSelfid(String selfid) {
        this.selfid = selfid == null ? null : selfid.trim();
    }

    public String getTwitterhead() {
        return twitterhead;
    }

    public void setTwitterhead(String twitterhead) {
        this.twitterhead = twitterhead == null ? null : twitterhead.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getTwitterType() {
        return twitterType;
    }

    public void setTwitterType(String twitterType) {
        this.twitterType = twitterType == null ? null : twitterType.trim();
    }
}