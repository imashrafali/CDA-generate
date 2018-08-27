package Algorithm;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sumit
 */
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class WriteXMLHospitalB {
    
    public void create(String pid, String pName, String did, String Gender, String pAge, String date, String pEmail, String docName, String Information, String Resion, String Medications, String immunization, String hospitalB) {
        System.out.println("pid+pName+did+Gender+pAge+date+pEmail = " + pid + pName + did + Gender + pAge + date + pEmail);
        
        try {
            
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
            
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Hostital-Information");
            doc.appendChild(rootElement);
            
            
            Element staff = doc.createElement("Patient");
            rootElement.appendChild(staff);
            
            Attr attr = doc.createAttribute("ID");
            attr.setValue(pid);
            staff.setAttributeNode(attr);
            
            Element nickname = doc.createElement("Patient-Name");
            nickname.appendChild(doc.createTextNode(pName));
            staff.appendChild(nickname);
            Element nickname1 = doc.createElement("Patient-Gender");
            nickname.appendChild(doc.createTextNode(Gender));
            staff.appendChild(nickname1);
            Element nickname2 = doc.createElement("Patient-Age");
            nickname.appendChild(doc.createTextNode(pAge));
            staff.appendChild(nickname2);
            Element nickname3 = doc.createElement("Patient-Date");
            nickname.appendChild(doc.createTextNode(date));
            staff.appendChild(nickname3);
            Element nickname4 = doc.createElement("Patient-Email");
            nickname.appendChild(doc.createTextNode(pEmail));
            staff.appendChild(nickname4);
            Element nickname5 = doc.createElement("Doctor-ID");
            nickname.appendChild(doc.createTextNode(did));
            staff.appendChild(nickname5);
            Element nickname6 = doc.createElement("Doctor-Name");
            nickname.appendChild(doc.createTextNode(docName));
            staff.appendChild(nickname6);
            Element nickname7 = doc.createElement("Patient-Information");
            nickname.appendChild(doc.createTextNode(Information));
            staff.appendChild(nickname7);
            Element nickname8 = doc.createElement("Hospitalized-Resion");
            nickname.appendChild(doc.createTextNode(Resion));
            staff.appendChild(nickname8);
            Element nickname9 = doc.createElement("Patient-Medications");
            nickname.appendChild(doc.createTextNode(Medications));
            staff.appendChild(nickname9);
            Element nickname10 = doc.createElement("Patient-Immunization");
            nickname.appendChild(doc.createTextNode(immunization));
            staff.appendChild(nickname10);
            Element nickname11 = doc.createElement("hospitalB");
            nickname.appendChild(doc.createTextNode(hospitalB));
            staff.appendChild(nickname11);
            
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("E://CDA Generation and Integration for Health Information/Files/" + pEmail + ".xml"));
            
            System.out.println("result = " + "E://CDA Generation and Integration for Health Information/Files/" + pEmail + ".xml");
            
            transformer.transform(source, result);
            
            System.out.println("File saved!");
            
        } catch (ParserConfigurationException pce) {// 7010901521, 9003613459
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
        
        
    }
}
