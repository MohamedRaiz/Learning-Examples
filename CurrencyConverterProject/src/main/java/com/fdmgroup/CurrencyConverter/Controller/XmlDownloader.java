package com.fdmgroup.CurrencyConverter.Controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class XmlDownloader {

	public void savingXmlFile() {
		String url = "https://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml";
		SAXBuilder builder = new SAXBuilder();

		try {
			// if(eurofxref-daily.xml exist, must compare timecube.)
			downloadUsingStream(url, "./temporary.xml");
			File tempXml = new File("temporary.xml");
			Document tempDocument = (Document) builder.build(tempXml);
			String tempTime = tempDocument.getRootElement().getChildren().get(2).getChildren().get(0)
					.getAttributeValue("time");

			downloadUsingStream(url, "./eurofxref-daily.xml");
			File mainXml = new File("eurofxref-daily.xml");
			Document mainDocument = (Document) builder.build(mainXml);
			String mainTime = mainDocument.getRootElement().getChildren().get(2).getChildren().get(0)
					.getAttributeValue("time");

			if (tempTime.equals(mainTime)) {
				System.out.println("I need to delete temporary.xml");
				System.out.println(tempTime);
			} else {
				System.out.println(
						"I need to delete eurofxref-daily.xml. Then save temporary.xml as eurofxref-daily.xml ");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			System.out.println(e.getMessage());
		}
	}

	public void downloadUsingStream(String urlStr, String file) throws IOException {
		URL url = new URL(urlStr);
		BufferedInputStream bis = new BufferedInputStream(url.openStream());
		FileOutputStream fis = new FileOutputStream(file);
		byte[] buffer = new byte[1024];
		int count = 0;
		while ((count = bis.read(buffer, 0, 1024)) != -1) {
			fis.write(buffer, 0, count);
		}
		fis.close();
		bis.close();
	}

}
