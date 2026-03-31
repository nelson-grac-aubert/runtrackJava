/* Créer un programme java et définir un objet personne. Il doit disposer :
- D’attributs publics : nom, prénom
- D’attributs protégés : date de naissance, lieu de naissance
- D’attributs privés : adresse, téléphone
Quelles sont les différences de ces différents types d’attributs ?
Pour quels types a-t-on besoin d’accesseurs : getter et setter ? */

package jour02.job00;
import java.time.LocalDate;

public class Person {

    public String familyName;
    public String firstName;

    protected LocalDate birthDate;
    protected String birthPlace; 

    private String adress;
    private int phoneNumber; 

    Person(String famName, String firName, LocalDate birth, String birPla, String adr, int num) {

        this.familyName = famName;
        this.firstName = firName; 
        this.birthDate = birth;
        this.birthPlace = birPla; 
        this.adress = adr; 
        this.phoneNumber = num; 

    }

    public static void main(String[] args) { 

        LocalDate myDate = LocalDate.of(1996, 1, 16);

        Person leGrosNelson = new Person("Grac", "Nelson", 
                            myDate, "Hyères", "Ma grosse adresse", 666);

        System.out.println(leGrosNelson);

    }

    /* Les attributs publics sont accessibles "partout", même en dehors de la classe
    Les attributs protected sont accessibles dans la classe et ses enfants
    Les attributs private sont accessibles uniquement dans la classe
    Les attributs protected ont besoin d'accesseurs en dehors de la classe et de ses enfants
    Les attributs private ont besoun d'accesseurs en dehors de la classe
    */

}
