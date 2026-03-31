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

    /* Les attributs publics sont accessibles "partout", même en dehors de la classe
    Les attributs protected et private ont besoin d'accesseurs
    */

}
