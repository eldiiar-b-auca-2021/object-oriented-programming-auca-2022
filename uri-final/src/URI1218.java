import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class URI1218 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cases = 0;
        while (in.hasNextLine()){
            cases++;
            int N = in.nextInt();
            in.nextLine();
            ArrayList<Integer> countSize = new ArrayList<>();
            ArrayList<Character> countChar = new ArrayList<>();
            StringBuilder k = new StringBuilder();
            String line = in.nextLine();
            for (int i = 0; i < line.length(); i++){
                if(Character.isDigit(line.charAt(i))){
                   k.append(line.charAt(i));
                   i+=1;
                   k.append(line.charAt(i));
                   String m = k.toString();
                   countSize.add(Integer.parseInt(m));
                   m = "";
                   k = k.delete(0,k.length());
                }else if(Character.isLetter(line.charAt(i))){
                    countChar.add(line.charAt(i));
                }
            }
            int F = 0, M = 0, sum = 0;
            for (int i = 0; i < countSize.size(); i++){
                if (countSize.get(i).equals(N)){
                    sum++;
                    if (countChar.get(i).equals('F')){
                        F++;
                    }else if (countChar.get(i).equals('M')){
                        M++;
                    }
                }
            }
            System.out.println("Caso "+cases+":");
            System.out.println("Pares Iguais: "+sum);
            System.out.println("F: "+F);
            System.out.println("M: "+M);
            System.out.println();
            //System.out.println();
        }
    }
}
