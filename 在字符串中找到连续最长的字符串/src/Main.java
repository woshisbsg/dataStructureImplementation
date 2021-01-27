import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String input = sc.nextLine();
            parseString(input);

        }
    }

    public static void parseString(String data){
        int max = 0;
        int counter = 0;
        StringBuffer sb = new StringBuffer();
        StringBuffer result = new StringBuffer();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < data.length(); i++){
            if(String.valueOf(data.charAt(i)).matches("[0-9]")){
                sb.append(data.charAt(i));
            }
            else {
                if(sb.length() != 0){
                    map.put(sb.toString(), sb.length());
                    sb.delete(0,sb.length());
                }
            }
        }
        if(sb.length() != 0){
            map.put(sb.toString(), sb.length());
        }
        //System.out.println(map);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        //System.out.println(list);
        List<Map.Entry<String, Integer>> resultList = new ArrayList<>();
        resultList.add(list.get(0));
        for(int i = 1; i < list.size(); i++){
            if(list.get(i-1).getValue() == list.get(i).getValue()){
                resultList.add(list.get(i));
            }
            else {
                break;
            }
        }
        if(resultList.size() == 1){
            System.out.println(resultList.get(0).getKey() + ","+resultList.get(0).getValue());
        }
        else {
            for(Map.Entry<String,Integer> temp : resultList){
                System.out.print(temp.getKey());
            }
            System.out.println("," + resultList.get(0).getValue());

        }




    }
}
