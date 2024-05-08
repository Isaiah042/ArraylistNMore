package Notes;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        LinkedList<String> animals = new LinkedList<>();
//        animals.add("cat");
//        animals.add("dog");
//        animals.add("cow");
//
//
//        Iterator<String> iteratorObject = animals.iterator();
//        while (iteratorObject.hasNext()){
//            System.out.println(iteratorObject.next());
//        }

//        Set<Double> numbers = new TreeSet<>();
//        numbers.add(2.00);
//        numbers.add(12.00);
//        numbers.add(10.00);
//        numbers.add(4.00);
//        numbers.add(18.00);
//
//        Iterator<Double> iterator = numbers.iterator();
//        while (iterator.hasNext()) {
//            Double current = iterator.next();
//            if(current < 10){
//                iterator.remove();
//            }
//        }
//        System.out.println(numbers);

//        List<Long> list = new ArrayList<>();
//        list.add(2L);
//        list.add(12L);
//        list.add(10L);
//        list.add(4L);
//        list.add(18L);
//
//        ListIterator<Long> iterator = list.listIterator(list.size());
//        while (iterator.hasPrevious()) {
//            Long current = iterator.previous();
//            System.out.println(current);
//        }


        Map<Integer,String> wuTangClan = new HashMap<>();
        wuTangClan.put(1,"Rza");
        wuTangClan.put(2,"Gza");
        wuTangClan.put(3,"Inspectah deck");
        wuTangClan.put(4,"Ghostface");
        wuTangClan.put(5,"Method Man");

        Iterator<Map.Entry<Integer,String>> nameIterator = wuTangClan.entrySet().iterator();
        while (nameIterator.hasNext()){
            Map.Entry<Integer,String> entry = nameIterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


//        for (Map.Entry<Integer, String> entry : wuTangClan.entrySet()){
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }



    }


}
