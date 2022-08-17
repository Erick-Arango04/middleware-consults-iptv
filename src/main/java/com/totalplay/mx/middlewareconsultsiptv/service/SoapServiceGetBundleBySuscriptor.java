package com.totalplay.mx.middlewareconsultsiptv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.mx.consultsipts.wsdl.BundlesVO;
import com.totalplay.mx.consultsipts.wsdl.GetBundleBySuscriptor;
import com.totalplay.mx.consultsipts.wsdl.GetBundleBySuscriptorResponse;
import com.totalplay.mx.consultsipts.wsdl.ObjectFactory;
import com.totalplay.mx.consultsipts.wsdl.SearchVO;
import com.totalplay.mx.consultsipts.wsdl.UserVO;
import com.totalplay.mx.middlewareconsultsiptv.cliente.SoapClient;
import com.totalplay.mx.middlewareconsultsiptv.config.SoapLoginApp;

@Service
public class SoapServiceGetBundleBySuscriptor implements GetConsultResponse {

	@Autowired
	private SoapClient soapClient;
	@Autowired
    private SoapLoginApp soapLoginApp;

	ObjectFactory objectFactory = new ObjectFactory();

	@Override
	public List<BundlesVO> getResponse(String account) {

		UserVO userVo = new UserVO();
	    userVo.setIp(soapLoginApp.getIp());
		userVo.setUser(soapLoginApp.getUser());
		userVo.setPassword(soapLoginApp.getPassword());

		SearchVO searchVo = new SearchVO();

		searchVo.setContract(account);

		GetBundleBySuscriptor getBunddlebySuscriptor = new GetBundleBySuscriptor();

		getBunddlebySuscriptor.setArg0(userVo);
		getBunddlebySuscriptor.setArg1(searchVo);

		GetBundleBySuscriptorResponse response = (GetBundleBySuscriptorResponse) soapClient
				.getResponse(objectFactory
						.createGetBundleBySuscriptor(getBunddlebySuscriptor));

		List<BundlesVO> bundlesList = response.getReturn().getBundles();

		return bundlesList;

	}

}
