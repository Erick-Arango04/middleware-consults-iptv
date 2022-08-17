package com.totalplay.mx.middlewareconsultsiptv.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.totalplay.mx.consultsipts.wsdl.GetSuscriptor;
import com.totalplay.mx.consultsipts.wsdl.GetSuscriptorResponse;
import com.totalplay.mx.consultsipts.wsdl.ObjectFactory;
import com.totalplay.mx.consultsipts.wsdl.ResultVO;
import com.totalplay.mx.consultsipts.wsdl.SearchVO;
import com.totalplay.mx.consultsipts.wsdl.UserVO;
import com.totalplay.mx.middlewareconsultsiptv.cliente.SoapClient;
import com.totalplay.mx.middlewareconsultsiptv.config.SoapLoginApp;

@Service
public class SoapGetSusccriptor implements GetConsultResponse {

	@Autowired
	private SoapClient soapClient;
	@Autowired
    private SoapLoginApp  soapLoginApp;

	ObjectFactory objectFactory = new ObjectFactory();
	
	@Override
	public ResultVO getResponse(String account) {

		UserVO userVo = new UserVO();
		userVo.setIp(soapLoginApp.getIp());
		userVo.setUser(soapLoginApp.getUser());
		userVo.setPassword(soapLoginApp.getPassword());

		SearchVO searchVo = new SearchVO();

		searchVo.setContract(account);

		GetSuscriptor getSuscriptor = new GetSuscriptor();

		getSuscriptor.setArg0(userVo);
		getSuscriptor.setArg1(searchVo);

		GetSuscriptorResponse response = (GetSuscriptorResponse) soapClient
				.getResponse(objectFactory.createGetSuscriptor(getSuscriptor));

		return response.getReturn();
	}

}
