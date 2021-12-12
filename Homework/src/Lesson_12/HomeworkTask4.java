package Lesson_12;

import java.util.*;

public class HomeworkTask4 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        ArrayList inpNumList=new ArrayList(Arrays.asList((input.replaceAll(" ","")).split(",")));
        LinkedHashSet inpNumHSet=new LinkedHashSet(inpNumList);
        ArrayList resNumList=new ArrayList(inpNumHSet);

        for(int i=0;i<resNumList.size();i++){
            System.out.println(resNumList.get(i));
        }
    }
}
