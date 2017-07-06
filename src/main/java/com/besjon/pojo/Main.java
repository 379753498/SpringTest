package com.besjon.pojo;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.baidu.translate.demo.TransApi;
import com.besjon.pojo.JsonRootBean;
import com.besjon.pojo.Trans_result;

public class Main {

    // 在平台申请的APP_ID 详见 http://api.fanyi.baidu.com/api/trans/product/desktop?req=developer
    private static final String APP_ID = "20170705000062796";
    private static final String SECURITY_KEY = "2M9FsAYu7EXaSBjenGA7";

    public static void main(String[] args) throws UnsupportedEncodingException {
        TransApi api = new TransApi(APP_ID, SECURITY_KEY);

        String query = "thank you ";
        String transResult = api.getTransResult(query, "auto", "zh");
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
