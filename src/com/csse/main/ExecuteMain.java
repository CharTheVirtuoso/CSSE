package com.csse.main;


import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import com.csse.common.c3;
import com.csse.service.a;

public class ExecuteMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		a a1 = new a();
		try {
			c3.rEQUESTtRANSFORM();
			a1.a2();
			a1.a3();
			a1.a4();
			a1.a5();
		} catch (Exception e) {
		}

	}

}
