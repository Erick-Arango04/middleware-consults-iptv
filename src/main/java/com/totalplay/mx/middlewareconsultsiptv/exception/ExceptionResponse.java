package com.totalplay.mx.middlewareconsultsiptv.exception;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {
	
	private String result;
	private ArrayList<String> resultRescription;
	
}
