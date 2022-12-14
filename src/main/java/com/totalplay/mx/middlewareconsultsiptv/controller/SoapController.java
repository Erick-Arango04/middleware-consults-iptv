package com.totalplay.mx.middlewareconsultsiptv.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.totalplay.mx.consultsipts.wsdl.BundlesVO;
import com.totalplay.mx.consultsipts.wsdl.ResultVO;
import com.totalplay.mx.consultsipts.wsdl.SuscriptorAmznVO;
import com.totalplay.mx.consultsipts.wsdl.SuscriptorNtflx;
import com.totalplay.mx.middlewareconsultsiptv.modelResponse.AccountModelRequest;
import com.totalplay.mx.middlewareconsultsiptv.modelResponse.GetModelRequest;
import com.totalplay.mx.middlewareconsultsiptv.modelResponse.IdPackageId;
import com.totalplay.mx.middlewareconsultsiptv.service.SoapGetBundleInfo;
import com.totalplay.mx.middlewareconsultsiptv.service.SoapGetCatalogBundlesAmzn;
import com.totalplay.mx.middlewareconsultsiptv.service.SoapGetCatalogBundlesNetflix;
import com.totalplay.mx.middlewareconsultsiptv.service.SoapGetModelSTB;
import com.totalplay.mx.middlewareconsultsiptv.service.SoapGetSusccriptor;
import com.totalplay.mx.middlewareconsultsiptv.service.SoapGetSuscriptorAmzn;
import com.totalplay.mx.middlewareconsultsiptv.service.SoapGetSuscriptorNtflx;
import com.totalplay.mx.middlewareconsultsiptv.service.SoapServiceGetBundleBySuscriptor;

@RestController
@RequestMapping("/provisionig/consults-iptv")
public class SoapController {

	@Autowired
	private SoapServiceGetBundleBySuscriptor soapServiceGetBundleBySuscriptor;

	@Autowired
	private SoapGetCatalogBundlesNetflix soapGetCatalogBundlesNetflix;

	@Autowired
	private SoapGetCatalogBundlesAmzn soapGetCatalogBundlesAmzn;
	
	@Autowired
	private SoapGetSusccriptor soapGetSusccriptor;
	
	@Autowired
	private SoapGetSuscriptorAmzn soapGetSuscriptorAmzn;
	
	@Autowired
	private SoapGetSuscriptorNtflx soapGetSuscriptorNtflx;
	
	@Autowired
	private SoapGetModelSTB soapGetModelSTB;

	@Autowired
	private SoapGetBundleInfo soapGetBundleInfo;
	
	
	
	@PostMapping("/getBundleBySuscriptor")
	public List<BundlesVO> getBundleBySuscriptor(@RequestBody AccountModelRequest accountModelRequest) {
		return soapServiceGetBundleBySuscriptor.getResponse(accountModelRequest.getAccount());
	}

	
	@PostMapping("/getCatalogBundlesAmzn")
	public boolean getCatalogBundlesAmzn(@Valid @RequestBody IdPackageId packageId) {
		return soapGetCatalogBundlesAmzn.validateAmz(packageId.getId_package());
	}

	
	@PostMapping("/getCatalogBundlesNetflix")
	public boolean getCatalogBundlesNetflix(@Valid @RequestBody IdPackageId packageId) {
		return soapGetCatalogBundlesNetflix.validateNetflix(packageId.getId_package());
	}

	
	
	@PostMapping("/getSuscriptor")
	public ResultVO getSuscriptor(@RequestBody AccountModelRequest accountModelRequest) {
		return soapGetSusccriptor.getResponse(accountModelRequest.getAccount());
	}
	
	
	@PostMapping("/getSuscriptorAmzn")
	public SuscriptorAmznVO getSuscriptorAmzn(@RequestBody AccountModelRequest accountModelRequest) {
	   return  soapGetSuscriptorAmzn.getResponse(accountModelRequest.getAccount());
	}
	
	@PostMapping("/getSuscriptorNtflx")
	public SuscriptorNtflx getSuscriptorNtflx(@RequestBody AccountModelRequest accountModelRequest ) {
	   return  soapGetSuscriptorNtflx.getResponse(accountModelRequest.getAccount());
	}
	
	@PostMapping("/getModelSTB")
	public String getModelSTB(@RequestBody GetModelRequest getModelRequest) {
	  return  soapGetModelSTB.getResponse(getModelRequest.getStb());
	}

	@PostMapping("/getBundleInfo")
	public Object getBundleInfo(@RequestBody GetModelRequest getModelRequest) {

		return soapGetBundleInfo.getResponse("115346980840");
	  
	}

}
