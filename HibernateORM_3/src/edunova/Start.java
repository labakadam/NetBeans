package edunova;

// domaća zadaća:
import edunova.controller.ObradaSmjer;
import edunova.model.Smjer;
import edunova.pomocno.EdunovaException;
import java.math.BigDecimal;

//upogoniti Hibernate prateći https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-maven-example/
public class Start {

    public static void main(String[] args) {

        ObradaSmjer os = new ObradaSmjer();

        Smjer novi = new Smjer();
        novi.setNaziv("Java");
        novi.setCijena(new BigDecimal(200));

        try {
            os.spremi(novi);
        } catch (EdunovaException ex) {
            System.out.println(ex.getMessage());
        }

        for (Smjer s : os.getSmjerovi()) {
            System.out.println(s.getNaziv());
        }

    }

}
