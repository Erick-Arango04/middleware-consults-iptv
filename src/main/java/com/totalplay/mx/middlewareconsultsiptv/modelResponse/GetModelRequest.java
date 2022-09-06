package com.totalplay.mx.middlewareconsultsiptv.modelResponse;

public class GetModelRequest  {

    private String stb ;

  public	GetModelRequest(){
		
	}
	
	public GetModelRequest(String stb){
		this.stb = stb;
	}
	
	public String getStb() {
		return stb;
	}

	public void setStb(String stb) {
		this.stb = stb;
	}
    
}
