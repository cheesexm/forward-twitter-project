package com.oace.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;




import net.sf.json.JSONObject;

@Controller 
public class HiContraller {


 private Map<String, String> fuduMap = new HashMap<>();
 private Map<Integer, Integer> fuduInt = new HashMap<>();
 int an=0;
 int temp1=0;
boolean secondFudu=false;
boolean fuduTemp = false;



@RequestMapping(value="cd",method=RequestMethod.POST)
	@ResponseBody
	
	public String TopShow(HttpServletRequest request,HttpServletResponse response) throws IOException, InterruptedException {
		System.out.println("�յ���Ϣ");

		String id=request.getParameter("id");
		String nickname=request.getParameter("message");

		  // ��ȡ��������
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while((line = br.readLine())!=null){
            sb.append(line);
        }       
        // �����Ͻ���
        String reqBody = sb.toString();
        System.out.println("���������"+reqBody);

        String jsonObjectData=sb.toString();
        JSONObject jsonObject = JSONObject.fromObject(jsonObjectData);
         
        Map<String, Object> mapJson = JSONObject.fromObject(jsonObject);
         
        for(Entry<String, Object> entry : mapJson.entrySet()){
            Object strval1 = entry.getValue();
            
          // System.out.println("KEY1:"+entry.getKey()+"  -->  Value1:"+entry.getValue()+"\n");
           
        }
        String panduan=(String) mapJson.get("message");
		int group_id=(int) mapJson.get("group_id");
        String tms=null;       
		System.out.println("�жϣ�"+panduan);
		System.out.println("group_id:"+group_id);
	
	
	
		boolean moreFudu=false;
		 for(Entry<String, String> o:fuduMap.entrySet()) {
				System.out.println("����map"+o);
				if(panduan.equals(o.getValue())&&(group_id+"").equals(o.getKey())){
					System.out.println("�ظ�һ��");
					if(fuduTemp==false) {
					//	ms.PostMessage(group_id, panduan);
						
						//ms.PostMessage(group_id, "[CQ:record,file=��Ҫͣ������.aac]");
					}
					
				
					moreFudu=true;
					fuduTemp=true;
				}else if(panduan.equals(o.getValue())==false&&(group_id+"").equals(o.getKey())) {
					System.out.println("�ж�������Ϣ��ͬ");
					fuduTemp=false;
				}
			}

			 fuduMap.put(group_id+"",panduan); 

		
		 System.out.println("�����жϣ�"+fuduMap);

 
//������Ϣ��Ⱥ
		//if(panduan.contains("!t")|panduan.contains("��t")) {
		if(panduan.contains("����")) {
			String a=panduan.substring(2, panduan.length()).trim();
			int b=Integer.valueOf(a);
		       // String Twitters=ms.Twitter(b);
				//System.out.println(Twitters);
			//ms.PostMessage(group_id, Twitters);
		}
		if(panduan.contains("rbq")) {
			//ms.PostMessage(group_id, "�������RBQ!");
		}
		

		
		return null;
	
		
	}

}
