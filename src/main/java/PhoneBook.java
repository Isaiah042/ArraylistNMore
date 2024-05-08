import java.util.*;

public class PhoneBook{

    public Map<String, List<String>> phoneRecords;

    public PhoneBook(){
        this(new HashMap<>());
    }

    public PhoneBook(Map<String, List<String>> phoneRecords) {
        this.phoneRecords = phoneRecords;
    }

    public void add(String name, String phoneNumber){
        List<String> numbers = new ArrayList<>();
        numbers.add(phoneNumber);
        phoneRecords.put(name,numbers);
    }

    public void addAll(String name, String... phoneNumber) {
        if (!phoneRecords.containsKey(name)) {
            phoneRecords.put(name, new ArrayList<>());
        }List<String> numbers = phoneRecords.get(name);
        for (String number : phoneNumber) {
            numbers.add(number);
        }
    }
    public void remove(String name){
        List<String> numbers = phoneRecords.get(name);
        numbers.remove(name);
        phoneRecords.remove(name,numbers);
    }

    public Boolean hasEntry(String name){
        for (Map.Entry<String, List<String>> entry : phoneRecords.entrySet()) {
            if (entry.getKey().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public List<String> lookUp(String name){
        List<String> phoneNumbers = phoneRecords.get(name);
        return phoneNumbers;
    }

    public List<String> lookUpNum(String phoneNumber){
        List<String> nameOfPerson = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : phoneRecords.entrySet()) {
            String name = entry.getKey();
            if (entry.getValue().contains(phoneNumber)) {
                nameOfPerson.add(name);
                }
            }
        return nameOfPerson;
    }
    public List<String> getAllContacts(){
        List<String> everyone = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : phoneRecords.entrySet()) {
            String name = entry.getKey();
            everyone.add(name);
        }
        return everyone;
    }

    public Map<String, List<String>> getPhoneRecords() {
        return phoneRecords;
    }

    public void setPhoneRecords(Map<String, List<String>> phoneRecords) {
        this.phoneRecords = phoneRecords;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneRecords=" + phoneRecords +
                '}';
    }
}
