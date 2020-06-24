package HW_2_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    HashMap<String, HashSet<String>> pb;

    public PhoneBook(){
        this.pb = new HashMap<>();
    }

    public void add(String name, String phone){
        HashSet<String> book = pb.getOrDefault(name, new HashSet<>());
        book.add(phone);
        pb.put(name, book);
    }
    public HashSet<String> get (String name){
        return pb.get(name);
    }
}
