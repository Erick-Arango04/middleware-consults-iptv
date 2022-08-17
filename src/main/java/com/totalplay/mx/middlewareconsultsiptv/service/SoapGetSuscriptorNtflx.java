package com.totalplay.mx.middlewareconsultsiptv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.totalplay.mx.consultsipts.wsdl.GetSuscriptorAmzn;
import com.totalplay.mx.consultsipts.wsdl.GetSuscriptorAmznResponse;
import com.totalplay.mx.consultsipts.wsdl.GetSuscriptorNtflx;
import com.totalplay.mx.consultsipts.wsdl.GetSuscriptorNtflxResponse;
import com.totalplay.mx.consultsipts.wsdl.ObjectFactory;
import com.totalplay.mx.consultsipts.wsdl.SuscriptorNtflx;
import com.totalplay.mx.consultsipts.wsdl.UserVO;
import com.totalplay.mx.middlewareconsultsiptv.cliente.SoapClient;
import com.totalplay.mx.middlewareconsultsiptv.config.SoapLoginApp;

@Service
public class SoapGetSuscriptorNtflx implements GetConsultResponse {

	@Autowired
	private SoapClient soapClient;
	@Autowired
    private SoapLoginApp soapLoginApp;

	ObjectFactory objectFactory = new ObjectFactory();

	@Override
	public SuscriptorNtflx getResponse(String account) {

		UserVO userVo = new UserVO();
		userVo.setIp(soapLoginApp.getIp());
		userVo.setUser(soapLoginApp.getUser());
		userVo.setPassword(soapLoginApp.getPassword());

		GetSuscriptorNtflx getSuscriptorNtflx = new GetSuscriptorNtflx();

		getSuscriptorNtflx.setArg0(userVo);
		getSuscriptorNtflx.setArg1(account);

		GetSuscriptorNtflxResponse response = (GetSuscriptorNtflxResponse) soapClient
				.getResponse(objectFactory
						.createGetSuscriptorNtflx(getSuscriptorNtflx));

		return response.getReturn();
	}

}
