package quizApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz {


    int correctAns = 0;
    int wrongAns  = 0;
    Scanner sc = new Scanner(System.in);
    public void logic(){
        Questions que1 = new Questions("Which package contains the Random class?","A. java.util package","B. java.lang package","C. java.awt package","D. java.io package");
        Questions que2 = new Questions("What is the extension of java code files?", "A. .txt", "B. .pdf", "C. .sql", "D. .java");
        Questions que3 = new Questions("Who invented Java Programming? ", "A. Guido van Rossum", "B. James Gosling", "C. Dennis Ritchie", "D. Bjarne Stroustrup");
        Questions que4 = new Questions("Which one of the following is not a Java feature?", "A. Object-oriented", "B. Use of pointers", "C. Portable", "D. Dynamic and Extensible");
        Questions que5 = new Questions("An interface with no fields or methods is known as a ______.", "A. Runnable Interface", "B. Marker Interface", "C. Abstract Interface", "D. CharSequence Interface");
        Questions que6 = new Questions("Which statement is true about Java?", "A. Java is a sequence-dependent programming language ", "B. Java is a code dependent programming language ", "C. Java is a platform-dependent programming language ", "D. Java is a platform-independent programming language ");
        Questions que7 = new Questions(" _____ is used to find and fix bugs in the Java programs.", "A. JVM","B. JRE","C. JDK","D. JDB");
        Questions que8 = new Questions("What is the return type of the hashCode() method in the Object class?","A. Object","B. int","C. long","D. void");
        Questions que9 = new Questions("In which process, a local variable has the same name as one of the instance variables?","A. Serialization","B. Variable Shadowing","C. Abstraction","D. Multi-threading");
        Questions que10 =new Questions("Which of the following is true about the anonymous inner class?","A. It has only methods","B. Objects can't be created","C. It has a fixed class name","D. It has no class name");
        Map<Questions,Character> hm=new HashMap<>();
        hm.put(que1, 'A');
        hm.put(que2, 'D');
        hm.put(que3, 'B');
        hm.put(que4, 'B');
        hm.put(que5, 'B');
        hm.put(que6, 'D');
        hm.put(que7, 'D');
        hm.put(que8, 'B');
        hm.put(que9, 'B');
        hm.put(que10, 'D');
        for(Map.Entry<Questions,Character> value : hm.entrySet()){
            System.out.println(value.getKey().getQuestion());
            System.out.println(value.getKey().getOpt1());
            System.out.println(value.getKey().getOpt2());
            System.out.println(value.getKey().getOpt3());
            System.out.println(value.getKey().getOpt4());

            System.out.println("Enter Your Answer: ");
            Character ans=sc.next().charAt(0);

            int cans=Character.compare(ans,value.getValue());
            if(cans==0){
                System.out.println("Correct");
                System.out.println();
                correctAns++;
            }
            else{
                System.out.println("Wrong");
                System.out.println();
                wrongAns++;
            }
        }
        System.out.println();
        System.out.println("--------Result---------");
        System.out.println("Total Questions: "+hm.size());
        System.out.println("Correct Answered Questions : "+correctAns);
        System.out.println("Wrong Answered Questions : "+wrongAns);
        int percentage=(100*correctAns)/hm.size();
        System.out.println("Percentage : "+percentage);
        if(percentage>95){
            System.out.println("Performance : Very Good");
        }
        else if(percentage<35){
            System.out.println("Performance : Very Low");
        }
        else{
            System.out.println("Performance : Medium");
        }


    }

}
