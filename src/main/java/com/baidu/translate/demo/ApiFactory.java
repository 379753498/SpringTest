package com.baidu.translate.demo;  



  
public class ApiFactory {

	   private static final String APP_ID = "20170705000062796";
	    private static final String SECURITY_KEY = "2M9FsAYu7EXaSBjenGA7";
	 private static TransApi TransApi = null;  
	
	  private ApiFactory() {  
	    }  
	  
	  public static TransApi getTransApi() {  
	        if (TransApi == null) {  
	        	TransApi = new TransApi(APP_ID, SECURITY_KEY) ; 
	    
	        }  
	      
	        return TransApi;  
	    }  
	
	  
	  
}
