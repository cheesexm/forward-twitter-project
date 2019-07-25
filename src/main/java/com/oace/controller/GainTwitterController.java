//package com.oace.controller;
//
//import java.io.IOException;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.select.Elements;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Controller;
//
//import com.oace.service.IndexServiceImpl;
//import com.oace.service.InsertTwitterService;
//
//@Controller
//public class GainTwitterController {
//	@Autowired
//	InsertTwitterService its;
//
//		
//		//@Autowiredtring
//		static String OldTwitter;
//		 @Scheduled(cron = "0/40 * * * * ?")  
//		public void inits(){
//	        System.out.println("初始化方法执行.....");
//	      	String proxyHost = "127.0.0.1";
//	    	String proxyPort = "1080";
//	    	      
//	    	System.setProperty("http.proxyHost", proxyHost);
//	    	System.setProperty("http.proxyPort", proxyPort);
//	    	      
//	    	// 对https也开启代理s
//	    	System.setProperty("https.proxyHost", proxyHost);
//	    	System.setProperty("https.proxyPort", proxyPort);
//	        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//	        System.out.println(df.format(new Date()));
//	       // TwitterServiceImpl test=new TwitterServiceImpl();
//	        try {
//				setTwitter();
//			} catch (MalformedURLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	    }
//		
//		public void setTwitter() throws MalformedURLException, IOException {
//			String url="https://twitter.com/cheesexm";
//	   	Document doc = Jsoup.parse(new URL(url).openStream(), "UTF-8", url);
//	   	com.oaec.pojo.Twitter  a=new com.oaec.pojo.Twitter();
//	   	Elements test = doc.select("div[^data-tweet-id]");//获取所有推文
//	    Elements test2=  test.get(1).select("div.js-tweet-text-container");//获取最新推文
//	    String selfId2=  doc.select("div.ProfileNav").attr("data-user-id");//获取本人id
//	   // System.out.println(doc.text());
//	   	a.setDoc(doc);
//	   	if(test2.text().equals(OldTwitter)|OldTwitter==null) {
//			com.oaec.pojo.Twitter.setTemp(false);
//			System.out.println("未更新"+com.oaec.pojo.Twitter.isTemp());
//			//OldTwitter=test2.text();
//		}else {
//			com.oaec.pojo.Twitter.setTemp(true);
//			System.out.println("已更新"+com.oaec.pojo.Twitter.isTemp());
//			for(int s=0;s<test.size();s++) {
//				/*System.out.println(test.size());
//				System.out.println(1);
//				System.out.println(selfId2);*/
//				//InsertTwitterService it=new InsertTwitterService();
//				its.InsertTwitterService(test,s,selfId2);
//			}
//			
//			
//			IndexServiceImpl ms=new IndexServiceImpl();
//			
//			ms.PostMessage(700587151, ms.Twitter(1));
//		}
//		OldTwitter=test2.text();
//	   	
//	   	
//		}
//		public String Twitter(int i) throws MalformedURLException, IOException {
//			
////			String url="https://twitter.com/tokino_sora";
////	    	Document doc = Jsoup.parse(new URL(url).openStream(), "UTF-8", url);
//
//	        Elements test = com.oaec.pojo.Twitter.getDoc().select("div[^data-tweet-id]");//获取所有推文
//	        Elements test2=  test.get(i).select("div.js-tweet-text-container");//获取最新推文
//	    	System.out.println(test2.text());
//	    	
//	    	com.oaec.pojo.Twitter a=new com.oaec.pojo.Twitter();
//	    	
//	    	return test2.text();
//		}
//
//}
