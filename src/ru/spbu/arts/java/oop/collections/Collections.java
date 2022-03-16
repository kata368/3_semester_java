package ru.spbu.arts.java.oop.collections;

import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class Collections {
    public static void main(String[] args) throws Exception {
        System.out.println( count(5));
        List<String> list1 = List.of("abc", "xyz", "ooo");
        printList(list1);
        List<String> list2 = List.of("ab", "xyz", "oooo");
        printListWithIndices(list2);

        List<String> list3 = List.of("aaa", "bbb", "ccc");
        List<String> list4 = List.of("xxx", "yyy", "zzz");
        List<String> list3plusList4 = concatenateLists(list3, list4);
        System.out.println(list3plusList4);


        List<String> list5 = new ArrayList<>(List.of("first", "middle", "last"));
        List<String> list5rev = reverseList(list5);
        System.out.println("list5rev = " + list5rev + ", but list5 = " + list5);

        reverseListInPlace(list5);
        System.out.println("list5 = " + list5);

        List<String> list6 = new ArrayList<>(List.of("s", "l", "a", "d", "a", "n","a"));
        reverseListInPlace(list6);
        System.out.println("list6 = " + list6);

        List<String> list7 = new ArrayList<>(List.of("s", "l", "a", "d", "j", "a", "n","a"));
        reverseListInPlace(list7);
        System.out.println("list7 = " + list7);

        List<Integer> ints =new ArrayList<>(List.of(11, 22, 33, 55, 66, 88, 100, 3, 4));
        System.out.println(filterEvenIndices(ints));
        System.out.println(filterEven(ints));

        System.out.println(" ============= mutable lists =================== ");

        List<Integer> mutableInts = new ArrayList<>(ints);
        mutableFilterEvenIndices(mutableInts);
        System.out.println("ints no even indices = " + mutableInts);

        mutableInts = new ArrayList<>(ints);
        mutableFilterEven(mutableInts);
        System.out.println("ints without even = " + mutableInts);


        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        doReadWordsInFile("src/ru/spbu/arts/java/oop/collections/172546.txt", hashSet);
        doReadWordsInFile("src/ru/spbu/arts/java/oop/collections/172546.txt", linkedHashSet);
        doReadWordsInFile("src/ru/spbu/arts/java/oop/collections/172546.txt", treeSet);
    }

    public static List<Integer> count(int n){
        List<Integer> answer = new ArrayList<>();
        for (int i =1; i<=n; i++){
            answer.add(i);
        }
        return answer;
    }

    public static void printList(List<String> forPrint){
        System.out.println("Элементов в списке:"+ forPrint.size());
        for (String line: forPrint){
            System.out.println(line);
        }
    }

    public static void printListWithIndices(List<String> forPrint){
        System.out.println("Элементов в списке:"+ forPrint.size());
        for (int i=0; i<forPrint.size(); i++){
            System.out.println((1+i)+": "+forPrint.get(i));
        }
    }

    public static List<String> concatenateLists(List<String> first, List<String> second){
        List <String> answer = new ArrayList<>();
        answer.addAll(first);
        answer.addAll(second);
        return answer;
    }

    public static List<String> reverseList(List<String> forReverse){
        List<String> answer = new ArrayList<>();
        for (int i=forReverse.size(); i>0; i--){
            answer.add(forReverse.get(i-1));
        }
        return answer;
    }

    public static void reverseListInPlace(List<String> forReverse){
        for (int i=0; i<forReverse.size()/2; i++){
            String transition = forReverse.get(i);
            forReverse.set(i, forReverse.get(forReverse.size()-1-i));
            forReverse.set(forReverse.size()-1-i, transition);
        }
    }

    public static List<Integer> filterEvenIndices(List<Integer> ints){
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i<ints.size(); i+=2){
            answer.add(ints.get(i));
        }
        return answer;
    }

    public static List<Integer> filterEven(List<Integer> ints){
        List<Integer> answer = new ArrayList<>();
        for (int i : ints){
            if (i%2!=0){
                answer.add(i);
            }
        }
        return answer;
    }

    public static void mutableFilterEvenIndices(List<Integer> forMethod){
        for (int i = 0; i<forMethod.size(); i++){
            forMethod.remove(i);
        }
    }

    public static void mutableFilterEven (List<Integer> forMethod){
        for (int i=0; i<forMethod.size(); i++){
            if (forMethod.get(i)%2==0){
                forMethod.remove(i);
                i--;
            }
        }
    }

    private static void doReadWordsInFile(String fileForReading, Set<String> set) throws Exception {
        Path txt = Path.of(fileForReading);
        try (Scanner in = new Scanner(txt, StandardCharsets.UTF_8)) {
            while (in.hasNext()){
                set.add(in.next().toLowerCase(Locale.ROOT));
            }
            System.out.println(set);
        }
    }





}
