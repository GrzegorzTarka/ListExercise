import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// YOU GET THIS: {"Jan,30", "Adam,10", "Piotr,3", "Marek,19"} ->
// YOU NEED TO PRINT THIS "The youngest is Piotr, who is 3 years old."

public class Main {
    private static void findTheYoungestOne (Map<String, Integer> map) {
        String youngestName = " ";
        Integer youngestAge = 0;
        List <Integer> agesSorted = new ArrayList<>();
        agesSorted = map.values().stream().sorted().toList();
        youngestAge = agesSorted.get(0);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == youngestAge) {
                youngestName = entry.getKey();
            }
        }
        System.out.println("The youngest is " + youngestName + " , who is " + youngestAge + " years old.");
    }


    public static void main(String[] args) {
        List <String> namesAgeList = new ArrayList<>();
        namesAgeList = List.of("Jan,30", "Adam,10", "Piotr,3", "Marek,19");
        Map<String,Integer> nameAndAgeMap = new HashMap<>();
        List <String> namesList = new ArrayList<>();
        List <Integer> ageList = new ArrayList<>();

        for (String nameAge : namesAgeList){
            String ageAsString = " ";
            Integer ageAsInteger = 0;
            int commaPosition = nameAge.indexOf(",");

            namesList.add(nameAge.substring(0, commaPosition));
            ageAsString = nameAge.substring(commaPosition+1, nameAge.length());
            ageAsInteger = Integer.parseInt(ageAsString);
            ageList.add(ageAsInteger);
        }
        System.out.println(ageList);
        int listSize = namesList.size();
        for (int i = 0; i< listSize; i++){
            nameAndAgeMap.put(namesList.get(i), ageList.get(i));
        }
        findTheYoungestOne(nameAndAgeMap);
    }
}
