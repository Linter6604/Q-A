
package JustTesting;

import javax.swing.JOptionPane;

public class Question {

    public Question(String thirdquestion, String p) {
    }
    public static void main(String[] args) {
        int score =0;

        String name=
                JOptionPane.showInputDialog("What is your name?");

        String message=
                String.format("Welcome,%s",name);
        JOptionPane.showMessageDialog(null,message);

        String message2=
                String.format("%s,Please answer the five questions below",name);
        JOptionPane.showMessageDialog(null,message2);


        String firstquestion;{
        int a;
        
          firstquestion=JOptionPane.showInputDialog("1 + 1 =" );{
        a=Integer.parseInt(firstquestion);
        if (a==2){
        JOptionPane.showMessageDialog(null,"CORRECT");
        score++;}
        
        else
        JOptionPane.showMessageDialog(null,"WRONG");}
        }
        
        String secondquestion;{

        int b;

        secondquestion=JOptionPane.showInputDialog("2 - 1 = "+" ");
        b=Integer.parseInt(secondquestion);
        if (b==1){
            JOptionPane.showMessageDialog(null,"CORRECT");
        score++;}
        
        else{
            JOptionPane.showMessageDialog(null,"WRONG");}
    }

        String thirdquestion;{
             thirdquestion=JOptionPane.showInputDialog("What letter should be fill into the blank?\n"+"Ap_le \n"+" (a)p\n "+" (b)r\n "+" (c)b\n ");

        if(thirdquestion.equals("a")){
            JOptionPane.showMessageDialog(null,"CORRECT");
        score++;}
        
        else{
            JOptionPane.showMessageDialog(null,"WRONG");}
    }
        
        String fourthquestion;{

        fourthquestion=JOptionPane.showInputDialog("Which of them is letter?\n"+" (a)1 \n "+"(b)A \n "+"(c)9\n ");
        
        if(fourthquestion.equals("b")){
            JOptionPane.showMessageDialog(null,"CORRECT");
        score++;}

        else{
            JOptionPane.showMessageDialog(null,"WRONG");}
    }
            
        String fifthquestion;
        
        fifthquestion=JOptionPane.showInputDialog("Which of them are corret?\n" + "(a)stealing money from your parents \n" + "(b) give the money you pick on the ground to the police ");
        
        if (fifthquestion.equals("b")){
            JOptionPane.showMessageDialog(null,"CORRECT");
        score++;}
        
        else{
            JOptionPane.showMessageDialog(null,"WRONG");}
        
        
          Question[]question= {
              new Question(firstquestion,"2"),
              new Question(secondquestion,"1"),
              new Question(thirdquestion,"a"),
              new Question(fourthquestion,"b"),
              new Question(fifthquestion,"b") };


            JOptionPane.showMessageDialog(null,name+","+" You got "+ score + " correct ","marks. ",JOptionPane.PLAIN_MESSAGE);

            if (score<3)
                JOptionPane.showMessageDialog(null,"You have fail the test, pls try next time.");

            else
                JOptionPane.showMessageDialog(null,"Congratulation ,You have pass the test!");
        
        }
        
    }

