import person.Person;

public class Main {
    public static void main(String[] args) {

        Person pessoa = new Person();
        pessoa.setName("Gabriel");
        pessoa.setDateOfBirth("01/10/2003");
        pessoa.setAge(19);
        
        System.out.println(pessoa.getName().concat(" nascido em " + pessoa.getDateOfBirth() + " e tem " + pessoa.getAge() + " anos "));
    }
}