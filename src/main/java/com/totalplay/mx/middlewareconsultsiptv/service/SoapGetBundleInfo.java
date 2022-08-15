package com.totalplay.mx.middlewareconsultsiptv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.mx.consultsipts.wsdl.GetBundleInfo;
import com.totalplay.mx.consultsipts.wsdl.GetBundleInfoResponse;
import com.totalplay.mx.consultsipts.wsdl.ObjectFactory;
import com.totalplay.mx.middlewareconsultsiptv.cliente.SoapClient;


@Service
public class SoapGetBundleInfo implements GetConsultResponse {

	@Autowired
	private SoapClient soapClient;

	ObjectFactory objectFactory = new ObjectFactory();

	@Override
	public Object getResponse(String input) {
		
		GetBundleInfo getBundleInfo = new GetBundleInfo();
		
		getBundleInfo.setArg0(input);

		GetBundleInfoResponse response = (GetBundleInfoResponse) soapClient
		.getResponse(objectFactory.createGetBundleInfo(getBundleInfo));

		return response.getReturn();
	}
    
}