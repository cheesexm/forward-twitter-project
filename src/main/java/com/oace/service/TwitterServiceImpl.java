package com.oace.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import net.sf.json.JSONObject;
import twitter4j.EntitySupport;
import twitter4j.MediaEntity;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;
@Service
public class TwitterServiceImpl {
@Autowired

	
	//@Autowiredtring
	static String OldTwitter=null;
	static boolean confirm=false;
	static String imgUrl=null;
	static String qqGroup=null;
	 @Scheduled(cron = "0/30 * * * * ?")  
	public void inits() throws IOException{
        System.out.println("��ʼ������ִ��.....");

    	
    	if(OldTwitter!=null) {
    		for(Object ob:twitter()) {
				if(((Status) ob).getText().equals(OldTwitter)) {
					System.out.println("δ���£��˳�ѭ��");
					break;
				}else {
					System.out.println("�Ѹ���"+((Status) ob).getText());
					//confirm=true;
					twitter_pojo(ob,imgUrl);
				}
    	    }
    	}
    	List<Status> status = null;
		status=twitter();
		System.out.println(status);
    	Status statu= status.get(0);
    	OldTwitter=statu.getText();
    	

    }
		public static List<Status> twitter() throws IOException {
			List<Status> status = null;
			// Properties properties = new Properties();
		     // ʹ��ClassLoader����properties�����ļ����ɶ�Ӧ��������
		 //configΪ�����ļ��������ڰ�com.test.config�£�����Ƿ���src�£�ֱ����config����  
		ResourceBundle resource = ResourceBundle.getBundle("twitter4j");
		
	  
		   String consumerKey=resource.getString("oauth.consumerKey"),
		   consumerSecret=resource.getString("oauth.consumerSecret"),
		   twitterAccessToken=resource.getString("oauth.accessToken"),
		   twitterAccessTokenSecret=resource.getString("oauth.accessTokenSecret"),   
		    userName=resource.getString("userName");
		   imgUrl=resource.getString("imgUrl");
		   qqGroup=resource.getString("qqGroup");
		    ConfigurationBuilder builder = new ConfigurationBuilder();
		    builder.setOAuthConsumerKey(consumerKey);
		    builder.setOAuthConsumerSecret(consumerSecret);
		    Configuration configuration = builder.build();
		    TwitterFactory factory = new TwitterFactory(configuration);
		    final Twitter twitter = factory.getInstance();
		    AccessToken accessToken = new AccessToken(twitterAccessToken, twitterAccessTokenSecret);
		    twitter.setOAuthAccessToken(accessToken);
		    try {
				 
		         status =  twitter.getUserTimeline(userName); 
		         System.out.println(status);
		        if (status != null&&confirm) { //
		                 
		        	twitter_pojo(status,imgUrl);		        
		        }
		    } catch (
		            TwitterException e) {
		        System.err.print("Failed to search tweets: " + e.getMessage());
		    }
	     
		return status;
		}
		
		public static void twitter_pojo(Object ob,String imgUrl) {
			
			//  System.out.println("@" + ((Status) status).getUser().getScreenName()
//	                    + " - " + status.getText());
	        	//System.out.println(status.size());

	  //      	for(Object ob:status) {
	        		Status statu=(Status) ob;
	        		String texthead = null;
	        		if(statu.isRetweet()) {
	        			//System.out.println("ת��");
	        			texthead="ת��";
	        		}else
	        		if(statu.getInReplyToScreenName()!=null) {
	        			texthead="�ظ�";
	        		}else
	        		if(statu.getQuotedStatusId()!=-1) {
	        			texthead="����";
	        		}else {
	        			texthead="����";
	        		}
	        		
	        		   System.out.println("@" + statu.getUser().getScreenName()
			                    +texthead+ " - " +  statu.getText()+" - " + statu.getCreatedAt());
	        		
	        		   System.out.println("isRetweet"+((Status) statu).isRetweet());//�Ƿ�Ϊת��
	        		   System.out.println("getInReplyToScreenName"+((Status) statu).getInReplyToScreenName());//��ȡ���ظ��˵��ǳ�
	        		   System.out.println("getQuotedStatusId()"+((Status) statu).getQuotedStatusId());//���õ�����id
	        		   System.out.println("getRetweetedStatus"+((Status) statu).getRetweetedStatus());
	        		   System.out.println("getQuotedStatus()"+((Status) statu).getQuotedStatus());
	        		   
	        			MediaEntity[] media =  statu.getMediaEntities(); //get the media entities from the status
			        	for(MediaEntity m : media){ //search trough your entities
//			        		System.out.println("getExtAltText"+m.getExtAltText()); //get your url!
//			        		System.out.println("getText"+m.getText()); 
//			        	
//			        		System.out.println("����url"+m.getMediaURL()); //get your url!
			             	try {
								img(m.getMediaURL(),imgUrl);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

			        	}
			        	 String Twitters="@" + statu.getUser().getScreenName()+texthead+ " - " +  statu.getText()+"\n" + statu.getCreatedAt();
		        		   try {
							PostMessage(qqGroup,Twitters);
						} catch (ClientProtocolException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	        	}
		//}783907922
		public static void PostMessage(String group_id,String Twitters) throws ClientProtocolException, IOException {
			 JSONObject obj = new JSONObject();
	         obj.element("group_id", group_id);
	         obj.element("message", Twitters);
	         CloseableHttpClient httpClient = HttpClients.createDefault();
	         //����һ��post����
	         HttpPost post = new HttpPost("http://127.0.0.1:5700/send_group_msg");
	         post.addHeader("Content-Type", "application/json;charset=UTF-8");
	         // ���������������
	         StringEntity stringEntity = new StringEntity(obj.toString(), "UTF-8");
	         stringEntity.setContentEncoding("UTF-8");
	         post.setEntity(stringEntity);
	         //ִ��post����
	         CloseableHttpResponse response2 = httpClient.execute(post);
	         String string = EntityUtils.toString(response2.getEntity());
	         System.out.println(string);
	         response2.close();
	         httpClient.close();
		}
		public static void img(String src,String imgUrl) throws IOException {
		    String imageName = src.substring(src.lastIndexOf("/") + 1,src.length());
	        System.out.println(imageName);
		      //����url
	        URL url = new URL(src);
	        URLConnection uri=url.openConnection();
	        //��ȡ������
	        InputStream is=uri.getInputStream();
	        //д��������
	        OutputStream os = new FileOutputStream(new File(imgUrl, imageName));
	        byte[] buf = new byte[1024];
	        int l=0;
	        while((l=is.read(buf))!=-1){
	            os.write(buf, 0, l);
	        }
	        os.close();
		}

	
	
	
	
}
