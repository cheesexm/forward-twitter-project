package com.oaec.pojo;

import org.jsoup.nodes.Document;

public class Twitter {
	static Document doc;
	static String TwitterText;
    public static boolean isTemp() {
		return temp;
	}

	public static void setTemp(boolean temp) {
		Twitter.temp = temp;
	}

	static boolean temp;
    
	public String getTwitterText() {
	return TwitterText;
}

public void setTwitterText(String twitterText) {
	TwitterText = twitterText;
}

	public static Document getDoc() {
		return doc;
	}

	public void setDoc(Document doc) {
		this.doc = doc;
	}
}
