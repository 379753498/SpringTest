package com.besjon.pojo;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.baidu.translate.demo.ApiFactory;
import com.baidu.translate.demo.Language;
import com.baidu.translate.demo.TransApi;
import com.besjon.pojo.JsonRootBean;
import com.besjon.pojo.Trans_result;


/**
 * 
 * 实现百度翻译api的调用
 * 
 * 语言简写	名称
auto	自动检测
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
 *@Title:  
 *@Description:  
 *@Author:Administrator  
 *@Since:2017年7月6日  
 *@Version:1.1.0
 */
public class Main {

 

    public static void main(String[] args) throws UnsupportedEncodingException {
     
    	
    	TransApi transApi = ApiFactory.getTransApi();
//    	BaiduFanyi(transApi, "语言", "en");
//    	BaiduFanyi(transApi, "素人的框架是最棒的吗", "jp");
    	
    	HashMap<String, String> getlanguagemap = Language.getlanguagemap();
    	
//    	for (String string : getlanguagemap.keySet()) {
//    		
//    		System.out.println(getlanguagemap.get(string));    		
//    		
//
//    		BaiduFanyi(transApi, "程刚是帅哥", string);
//    		System.out.println("--------------------------");
//		}
    	
    	
    	BaiduFanyi(transApi, "Jenkins is a self-contained, open source automation server which can be used to automate all sorts of tasks such as building, testing, and deploying software. Jenkins can be installed through native system packages, Docker, or even run standalone by any machine with the Java Runtime Environment installed", "zh");
    }

	public static void BaiduFanyi(TransApi api ,String query ,String to ) throws UnsupportedEncodingException {

        String transResult = api.getTransResult(query, "auto", to);
        JSONObject  jsonarray = JSONObject.fromObject(transResult);
        Object object = jsonarray.get("from");
        JsonRootBean josnb= new JsonRootBean();
        josnb.setFrom(object.toString());
        Object object1 = jsonarray.get("to");
        josnb.setTo(object1.toString());
        Trans_result tr= new Trans_result();
        
        Object obj = jsonarray.get("trans_result");
        JSONArray  jobj = JSONArray.fromObject(obj.toString());
        JSONObject js=jobj.getJSONObject(0);
        
        Object object2 = js.get("src");
        Object object3 = js.get("dst");
        tr.setSrc(object2.toString());
        tr.setDst(object3.toString());
        
        ArrayList<Trans_result> arrayList = new ArrayList<Trans_result>();
        arrayList.add(tr);
        josnb.setTrans_result(arrayList);
        
        System.out.println(josnb.toString());
	}

}
