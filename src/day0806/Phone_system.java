package day0806;

import java.util.HashMap;
import java.util.Map;

public class Phone_system{
    private Map<String, Person> person_list = new HashMap<String, Person>();
    private int sumofperson=0;
    public void addPerson(Person person){
        this.person_list.put(person.getName(),person);
    }
    public void deletePerson(Person person){
        this.person_list.remove(person.getName());
    }
    public void editPerson(Person person_1, Person person_2){
        this.person_list.remove(person_1.getName());
        this.person_list.put(person_2.getName(), person_2);
    }
    public void findAll(){
        for(Map.Entry<String, Person> entry : person_list.entrySet()){
            System.out.println(entry.getValue().toString());
        }
    }

    public void findByName(String name){
        System.out.println(person_list.get(name).toString());
    }
}