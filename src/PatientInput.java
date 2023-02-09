import java.util.Scanner;

public class PatientInput {
    private String name,surname,surgery,therapy,diseases,drugs,previousconditions;
    private char gender;
public PatientInput(){
    Scanner k = new Scanner(System.in);
    System.out.println("Ingrése el nombre del paciente");
    name = k.nextLine();
    System.out.println("Ingrése el apellido del paciente");
    surname = k.nextLine();
    System.out.println("Ingrése el sexo del paciente (M o F");
    gender = k.next().charAt(0);
    System.out.println("Ingrése cirugias realizadas en el paciente");
    surgery = k.nextLine();
    System.out.println("Ingrése enfermedades actuales del paciente");
    diseases = k.nextLine();
    System.out.println("Ingrése terapias actuales");
    therapy = k.nextLine();
    System.out.println("Ingrése la/s medicación/es que el paciente esta tomando, su cantidad y frecuencia");
    drugs = k.nextLine();
    System.out.println("Ingrése condiciones medicas previas");
    previousconditions = k.nextLine();
}
    public void setName(String name){this.name = name;}
    public void setSurname(String surname){this.surname = surname;}
    public void setGender(char gender){this.gender = gender;}
    public void setSurgery(String surgery){this.surgery = surgery;}
    public void setTherapy(String therapy){this.therapy = therapy;}
    public void setDiseases(String diseases){this.diseases = diseases;}
    public void setDrugs(String drugs){this.drugs = drugs;}
    public void setPreviousconditions(String previousconditions){this.previousconditions = previousconditions;}

    public String getName(){return name;}
    public String getSurname(){return surname;}
    public char getGender(){return gender;}
    public String getSurgery(){return surgery;}
    public String getTherapy(){return therapy;}
    public String getDiseases(){return diseases;}
    public String getDrugs(){return drugs;}
    public String getPreviousconditions() {return previousconditions;}
}
