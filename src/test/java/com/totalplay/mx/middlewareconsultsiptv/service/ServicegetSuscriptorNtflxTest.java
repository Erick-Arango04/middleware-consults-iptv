package com.totalplay.mx.middlewareconsultsiptv.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.totalplay.mx.consultsipts.wsdl.SuscriptorNtflx;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ServicegetSuscriptorNtflxTest {

    @Autowired
   private SoapGetSuscriptorNtflx soapGetSuscriptorNtflx;

   @BeforeAll
   public void start() {
 
    soapGetSuscriptorNtflx = new SoapGetSuscriptorNtflx();

   }

   @Test
   public void test() {
    SuscriptorNtflx suscriptorNtflx = soapGetSuscriptorNtflx.getResponse("079008721");
       assertEquals(suscriptorNtflx.getCode(), "-202");
   }
    
}
