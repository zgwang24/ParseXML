package parse.wsn;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ParseData {
	public static void main(String[] args) throws Exception {
		Set<String> set = new HashSet<String>();
		SAXReader reader = new SAXReader();
	    File file = new File("data.xml");
	    Document document = reader.read(file);
	    // graph
	    Element root = document.getRootElement();
	    List<Element> subs = root.elements();
	    for(Element sub : subs){
	    	List<Attribute> attrs = sub.attributes();
	    	if(Integer.parseInt(attrs.get(0).getValue()) == 1 && Integer.parseInt(attrs.get(1).getValue()) == 3 && Integer.parseInt(attrs.get(2).getValue()) == 1){
	    		String val = attrs.get(4).getValue();
	    		set.add(val);	    		
	    	}
	    	
	    }
	    System.out.println(set.size());
	}
}
