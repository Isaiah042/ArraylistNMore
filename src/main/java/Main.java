import java.util.*;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Nelson", "302-203-555");
        phoneBook.add("Isaiah", "302-654-6546");
        phoneBook.add("Rene", "123-456-7890");
        phoneBook.add("Juan", "789-456-1230");

        phoneBook.remove("Isaiah");

//        Iterator<Map.Entry<String,List<String>>> nameIterator = phoneBook.getPhoneRecords().entrySet().iterator();
//        while(nameIterator.hasNext()){
//            Map.Entry<String,List<String>> entry = nameIterator.next();
//            System.out.println(entry);
//        }


        PhoneBook phoneBook1 = new PhoneBook();
        phoneBook1.addAll("Hola", "586-887-9632","347-585-12340","646-598-7894");

        Iterator<Map.Entry<String,List<String>>> allNumberIterator = phoneBook1.getPhoneRecords().entrySet().iterator();
        while(allNumberIterator.hasNext()) {
            Map.Entry<String,List<String>> entry = allNumberIterator.next();
            System.out.println("Name: " + entry.getKey() + " " + entry.getValue());
        }
        System.out.println(phoneBook.hasEntry("Juan"));

        System.out.println(phoneBook1.lookUp("Hola"));
        System.out.println(phoneBook.lookUpNum("123-456-7890"));

        System.out.println(phoneBook.getAllContacts());

    }



}
