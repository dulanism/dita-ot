package org.dita.dost.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Properties;

import javax.xml.transform.TransformerException;

import org.dita.dost.log.DITAOTJavaLogger;
import org.dita.dost.resolver.DitaURIResolverFactory;
import org.dita.dost.resolver.URIResolverAdapter;


public class ListUtils {	
	private ListUtils(){
		// nop
	}
	
	/**
	 * 1. Try reading from dita.xml.properties.
	 * 2. or, read dita.list
	 * 3. or, log exceptions
	 */
	public static Properties getDitaList() throws IOException{
		Properties properties = new Properties();
		try{
			InputStream source = URIResolverAdapter.convertTOInputStream(DitaURIResolverFactory.getURIResolver().resolve(Constants.FILE_NAME_DITA_LIST_XML, null));
			if (source != null) {
				properties.loadFromXML(source);
			}
			else{
				source = URIResolverAdapter.convertTOInputStream(DitaURIResolverFactory.getURIResolver().resolve(Constants.FILE_NAME_DITA_LIST, null));
				properties.load(source);
			}			
		}catch(TransformerException e){
			DITAOTJavaLogger javaLogger = new DITAOTJavaLogger();
			javaLogger.logException(e);
		}
		return properties;
	}
	
	/**
	 * @deprecated -never used right now
	 */
	public static Properties loadList(String name, String base, boolean isXML) throws IOException{
		Properties properties = new Properties();
		try {
			InputStream source = URIResolverAdapter.convertTOInputStream(DitaURIResolverFactory.getURIResolver().resolve(name, base));
			if(isXML){
				properties.loadFromXML(source);
			}
			else{
				properties.load(source);
			}
		} catch (TransformerException e) {
			DITAOTJavaLogger javaLogger = new DITAOTJavaLogger();
			javaLogger.logException(e);
		}
		return properties;
	}
	
	/**
	 * How?
	 * @deprecated -never used right now
	 */
	public static void storeList(String name, String base, boolean isXML, Properties properties) throws IOException{
		try {
			InputStream source = URIResolverAdapter.convertTOInputStream(DitaURIResolverFactory.getURIResolver().resolve(name, base));
			if(isXML){
				properties.storeToXML(new FileOutputStream(name), null);
			}
			else{
				properties.store(new FileOutputStream(name), null);
			}
		} catch (TransformerException e) {
			DITAOTJavaLogger javaLogger = new DITAOTJavaLogger();
			javaLogger.logException(e);
		}
	}
}