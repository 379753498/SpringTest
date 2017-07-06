/**
  * Copyright 2017 bejson.com 
  */
package com.besjon.pojo;
import java.util.List;

/**
 * Auto-generated: 2017-07-05 13:59:27
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class JsonRootBean {

    @Override
	public String toString() {
		return "JsonRootBean [from=" + from + ", to=" + to + ", trans_result="
				+"----翻以前----"+ trans_result.get(0).getSrc()+"----翻译后---"+trans_result.get(0).getDst() + "]";
	}
	private String from;
    private String to;
    private List<Trans_result> trans_result;
    public void setFrom(String from) {
         this.from = from;
     }
     public String getFrom() {
         return from;
     }

    public void setTo(String to) {
         this.to = to;
     }
     public String getTo() {
         return to;
     }

    public void setTrans_result(List<Trans_result> trans_result) {
         this.trans_result = trans_result;
     }
     public List<Trans_result> getTrans_result() {
         return trans_result;
     }

}