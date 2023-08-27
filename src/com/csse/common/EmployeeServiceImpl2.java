package com.csse.common;


import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.csse.service.AbstractService;

public class EmployeeServiceImpl2 extends AbstractService {
	
	public static String Q(String id) throws Exception {
		NodeList n; Element e = null;
		n = DocumentBuilderFactory.newInstance().newDocumentBuilder()
				.parse(new File("src/e/EmployeeQuery.xml"))
				.getElementsByTagName("query");
		for (int x = 0; x < n.getLength(); x++) {
			e = (Element) n.item(x);
			if (e.getAttribute("id").equals(id))
				break;
		}
		return e.getTextContent().trim();
	}
}
