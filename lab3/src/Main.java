import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    StringBuilder result = new StringBuilder();
    boolean newWord = true;

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);

      if (Character.isLetter(c)) {
        if (newWord) {
          // зміна регістру першої літери слова
          if (Character.isUpperCase(c))
            result.append(Character.toLowerCase(c));
          else
            result.append(Character.toUpperCase(c));

          newWord = false;
        } else {
          result.append(c);
        }
      } else {
        result.append(c);
        newWord = true; // наступна літера — початок нового слова
      }
    }

    System.out.println(result.toString());
  }
}