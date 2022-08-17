package com.totalplay.mx.middlewareconsultsiptv.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.totalplay.mx.consultsipts.wsdl.GetSuscriptorAmzn;
import com.totalplay.mx.consultsipts.wsdl.GetSuscriptorAmznResponse;
import com.totalplay.mx.consultsipts.wsdl.ObjectFactory;
import com.totalplay.mx.consultsipts.wsdl.SuscriptorAmznVO;
import com.totalplay.mx.consultsipts.wsdl.UserVO;
import com.totalplay.mx.middlewareconsultsiptv.cliente.SoapClient;
import com.totalplay.mx.middlewareconsultsiptv.config.SoapLoginApp;

@Service
public class SoapGetSuscriptorAmzn implements GetConsultResponse {

	@Autowired
	private SoapClient soapClient;
	@Autowired
    private SoapLoginApp soapLoginApp;
	
	ObjectFactory objectFactory = new ObjectFactory();
	

	@Override
	public SuscriptorAmznVO getResponse(String account) {

		UserVO userVo = new UserVO();
		userVo.setIp(soapLoginApp.getIp());
		userVo.setUser(soapLoginApp.getUser());
		userVo.setPassword(soapLoginApp.getPassword());

		GetSuscriptorAmzn getSuscriptorAmzn = new GetSuscriptorAmzn();

		getSuscriptorAmzn.setArg0(userVo);
		getSuscriptorAmzn.setArg1(account);

		GetSuscriptorAmznResponse response = (GetSuscriptorAmznResponse) soapClient
				.getResponse(objectFactory
						.createGetSuscriptorAmzn(getSuscriptorAmzn));

		return response.getReturn();
	}

}
