

public class RemoveFirst2AChars {
    public String remove(String ab) {

        String result = ab;

        if(ab.length()<=2 && ab.contains("A"))
            result = ab.replace("A","");
        else if(ab.contains("A")) {
            String firstPartOfString = ab.substring(0,2);
            String lastPartOfString = ab.substring(2,ab.length());
            result = firstPartOfString.replace("A", "") + lastPartOfString;
        }
        return result;
    }
}
