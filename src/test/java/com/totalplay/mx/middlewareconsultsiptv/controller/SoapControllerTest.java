package com.totalplay.mx.middlewareconsultsiptv.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.totalplay.mx.consultsipts.wsdl.ResultVO;
import com.totalplay.mx.middlewareconsultsiptv.modelResponse.AccountModelRequest;
import com.totalplay.mx.middlewareconsultsiptv.modelResponse.GetModelRequest;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SoapControllerTest {

    @Autowired
    private SoapController soapController;


    @BeforeAll
    public void start() {

        soapController = new SoapController();
        
    }

    @Test
   public void searchSuscriptor() {

    AccountModelRequest accountModelRequest = new AccountModelRequest();

    accountModelRequest.setAccount("0102030405");
       
    ResultVO resultVO = soapController.getSuscriptor(accountModelRequest);

    assertEquals(resultVO.getResponseVO().getCode(), -202);

    }

    @Test
    public void searchStb() {

        GetModelRequest getModelSTB = new GetModelRequest();
        getModelSTB.setStb("M37210942652EE99C1");
 
       String model = soapController.getModelSTB(getModelSTB);

        assertEquals(model, "M370");
 
     }

    
}
 