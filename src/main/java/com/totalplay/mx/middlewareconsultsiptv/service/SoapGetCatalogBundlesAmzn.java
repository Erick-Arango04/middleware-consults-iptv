package com.totalplay.mx.middlewareconsultsiptv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.mx.consultsipts.wsdl.BundleNtflxVO;
import com.totalplay.mx.consultsipts.wsdl.GetCatalogBundlesAmzn;
import com.totalplay.mx.consultsipts.wsdl.GetCatalogBundlesAmznResponse;
import com.totalplay.mx.consultsipts.wsdl.ObjectFactory;
import com.totalplay.mx.middlewareconsultsiptv.cliente.SoapClient;


@Service
public class SoapGetCatalogBundlesAmzn {

	@Autowired
	private SoapClient soapClient;

	ObjectFactory objectFactory = new ObjectFactory();

	
	public List<BundleNtflxVO> getResponse() {

		GetCatalogBundlesAmzn getCatalogAmzn = new GetCatalogBundlesAmzn();

		GetCatalogBundlesAmznResponse response = (GetCatalogBundlesAmznResponse) soapClient
				.getResponse(objectFactory
						.createGetCatalogBundlesAmzn(getCatalogAmzn));

		List<BundleNtflxVO> bundlesListAmzn = response.getReturn().getBundles();
		return bundlesListAmzn;
	}

	
    public boolean validateAmz(String id_package) {

		List<BundleNtflxVO> response = getResponse();

		for (BundleNtflxVO bundleNtflxVO : response) {
          
            if (id_package.equals(bundleNtflxVO.getPlanID())) {
				
				return true;
				
			}
			
		}

		return false;
		
	}
}
