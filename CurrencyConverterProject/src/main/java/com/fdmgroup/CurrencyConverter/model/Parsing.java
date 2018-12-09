package com.fdmgroup.CurrencyConverter.model;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class Parsing {

	private File Xml = null;

	public Map<String, Currency> ParsingXmlFile() {
		Xml = new File("eurofxref-daily.xml");
		Currency exchangeRate = null;
		SAXBuilder builder = new SAXBuilder();
		// Creating an empty hashmap
		Map<String, Currency> currencyMap = new HashMap<String, Currency>();
		// System.out.println("Parsing FILE: " + Xml.getAbsolutePath());

		try {

			Document document = (Document) builder.build(Xml);
			Element rootNode = document.getRootElement();
			Element mainCube = rootNode.getChildren().get(2);
			Element timeCube = mainCube.getChildren().get(0);
			List<Element> currencyCubes = timeCube.getChildren();

			for (int i = 0; i < currencyCubes.size(); i++) {

				Element node = (Element) currencyCubes.get(i);
				// Saving into ExchangeRate
				exchangeRate = new Currency();
				exchangeRate.setRate(Double.parseDouble(node.getAttributeValue("rate")));
				exchangeRate.setName(node.getAttributeValue("currency"));
				// putting elements into the map
				currencyMap.put(exchangeRate.getName(), exchangeRate);

			}
			// System.out.println(currencyMap);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (JDOMException e) {
			System.out.println(e.getMessage());
		}
		return currencyMap;
	}

}
