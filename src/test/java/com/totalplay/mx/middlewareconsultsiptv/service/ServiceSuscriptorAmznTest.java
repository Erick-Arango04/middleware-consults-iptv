package com.totalplay.mx.middlewareconsultsiptv.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.totalplay.mx.consultsipts.wsdl.SuscriptorAmznVO;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ServiceSuscriptorAmznTest {
    
   @Autowired
   private SoapGetSuscriptorAmzn soapGetSuscriptorAmzn;
   
    
    @BeforeAll
    public void start() {
  
        soapGetSuscriptorAmzn = new SoapGetSuscriptorAmzn();
 
    }

    @Test
    public void test() {
        SuscriptorAmznVO suscriptorAmznVO = soapGetSuscriptorAmzn.getResponse("079008721");
        assertEquals(suscriptorAmznVO.getCode(), -202);
    }
}
