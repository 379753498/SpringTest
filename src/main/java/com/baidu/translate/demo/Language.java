package com.baidu.translate.demo;

/**
 * 语言简写	名称

 zh	中文
 en	英语
 yue	粤语
 wyw	文言文
 jp	日语
 kor	韩语
 fra	法语
 spa	西班牙语
 th	泰语
 ara	阿拉伯语
 ru	俄语
 pt	葡萄牙语
 de	德语
 it	意大利语
 el	希腊语
 nl	荷兰语
 pl	波兰语
 bul	保加利亚语
 est	爱沙尼亚语
 dan	丹麦语
 fin	芬兰语
 cs	捷克语
 rom	罗马尼亚语
 slo	斯洛文尼亚语
 swe	瑞典语
 hu	匈牙利语
 cht	繁体中文
 vie	越南语
 * 
 */
import java.util.HashMap;

public class Language {

	 private  static HashMap<String, String>  hs = null;  
		
	
	public static HashMap<String, String>  getlanguagemap() {

		
		
		   if (hs == null) {  
			   hs = new  HashMap<String, String>();
				hs.put("zh", "中文");
				hs.put("en", "英语");
				hs.put("yue", "粤语");
				hs.put("wyw", "文言文");
				hs.put("jp", "日语");
				hs.put("kor", "韩语");
				hs.put("fra", "法语");
				hs.put("spa", "西班牙语");
				hs.put("th", "泰语");
				hs.put("ara", "阿拉伯语");
				hs.put("ru", "俄语");
				hs.put("pt", "葡萄牙语");
				hs.put("de", "德语");
				hs.put("it", "意大利语");
				hs.put("el", "希腊语");
				hs.put("nl", "荷兰语");
				hs.put("pl", "波兰语");
				hs.put("bul", "保加利亚语");
				hs.put("est", "爱沙尼亚语");
				hs.put("dan", "丹麦语");
				hs.put("fin", "芬兰语");
				hs.put("cs", "捷克语");
				hs.put("rom", "罗马尼亚语");
				hs.put("slo", "斯洛文尼亚语");
				hs.put("swe", "瑞典语");
				hs.put("hu", "匈牙利语");
				hs.put("cht", "繁体中文");
				hs.put("vie", "越南语");
	        }  
			return hs;

	       
	    }  
	
	
	
}
