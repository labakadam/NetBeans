package safeflyeu;

// domaća zadaća:

import safeflyeu.pomocno.HibernateUtil;

//upogoniti Hibernate prateći https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-maven-example/
public class Start {

    public static void main(String[] args) {
        HibernateUtil.getSession();
    }
    
}
