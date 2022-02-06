import java.util.*;

public class Competitions {
    public static void main(String[] args) {


        String s = "God sees the sees people,god is great great,people sees the god";
        String[] words = s.split("[ ,]+");


        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }


        LinkedHashSet<String> lhSetColors =
                new LinkedHashSet<String>(Arrays.asList(words));

        //create array from the LinkedHashSet
        String[] newArray = lhSetColors.toArray(new String[lhSetColors.size()]);


        if (Arrays.toString(words).equals(Arrays.toString(newArray))) {
            System.out.println("-1");
        } else {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < newArray.length; i++) {
                sb.append(newArray[i]);
                sb.append(" ");
            }
            String str = sb.toString();
            System.out.println(str);
        }


    }


}



