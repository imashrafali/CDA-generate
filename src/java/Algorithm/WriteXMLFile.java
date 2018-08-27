package Algorithm;

import java.io.FileWriter;
import java.io.IOException;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class WriteXMLFile {

    public void create(String pid, String pName, String Gender, String pAge, String date, String pEmail, String did, String docName, String Information, String Resion, String Medications, String immunization, String Problem, String FamilyHistory, String SocialHistory, String Allergies, String MedicalEquipment, String VitalSigns, String Results, String Procedures, String Encounter, String Planofcare, String hospital) throws IOException {

        Element company = new Element("Hospital");
        Document doc = new Document(company);
        doc.setRootElement(company);

        Element staff = new Element("Patient");
        staff.setAttribute(new Attribute("ID", pid));
        staff.addContent(new Element("Patient-Name").setText(pName));
        staff.addContent(new Element("Patient-Gender").setText(Gender));
        staff.addContent(new Element("Patient-Age").setText(pAge));
        staff.addContent(new Element("salary").setText(pAge));
        staff.addContent(new Element("Date-Of-Birth").setText(date));
        staff.addContent(new Element("Patient-Email").setText(pEmail));
        staff.addContent(new Element("Doctor-ID").setText(did));
        staff.addContent(new Element("Doctor-Name").setText(docName));
        staff.addContent(new Element("Patient-Information").setText(Information));
        staff.addContent(new Element("Hospitalized-Resion").setText(Resion));
        staff.addContent(new Element("Patient-Medications").setText(Medications));
        staff.addContent(new Element("Patient-Immunization").setText(immunization));


        staff.addContent(new Element("Patient-Problem").setText(Problem));
        staff.addContent(new Element("Patient-Family-History").setText(FamilyHistory));
        staff.addContent(new Element("Patient-Social-History").setText(SocialHistory));
        staff.addContent(new Element("Patient-Allergies").setText(Allergies));
        staff.addContent(new Element("Patient-Medical-Equipment").setText(MedicalEquipment));
        staff.addContent(new Element("Patient-Vital-Signs").setText(VitalSigns));
        staff.addContent(new Element("Patient-Results").setText(Results));
        staff.addContent(new Element("Patient-Procedures").setText(Procedures));
        staff.addContent(new Element("Patient-Encounter").setText(Encounter));
        staff.addContent(new Element("Patient-Plan-Of-Care").setText(Planofcare));
        staff.addContent(new Element("Hospital-Name").setText(hospital));

        doc.getRootElement().addContent(staff);
        XMLOutputter xmlOutput = new XMLOutputter();

        // display nice nice
        xmlOutput.setFormat(Format.getPrettyFormat());
        xmlOutput.output(doc, new FileWriter("E://CDA Generation and Integration for Health Information/Files/" + pid + ".xml"));

        System.out.println("File Saved!");
    }
}
