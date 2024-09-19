import java.util.*;
public class markcalculator {
    int maths, english, science, social, tamil, percentage;
    public  void marks() 
    {
        Scanner get = new Scanner(System.in);
        System.out.println("enter the mark of maths");
        maths = get.nextInt();
        System.out.println("enter the mark of Science");
        science = get.nextInt();
        System.out.println("enter the mark of English");
        english = get.nextInt();
        System.out.println("enter the mark of social");
        social = get.nextInt();
        System.out.println("enter the mark of Tamil");
        tamil = get.nextInt(); 
    }
    public void calculation () 
    {
        int sum = science + social + maths + english + tamil;
        System.out.println("the sum of all marks is" + (sum));
        int avg = sum / 5;
        percentage = (sum/500)*100;
        System.out.println("the average of your marks is "+ (avg) );
        System.out.println(percentage);
    }
    public void grade()
    {
        if(percentage<35)
        {
            System.out.println("F");
        }
        else if(percentage<50)
        {
            System.out.println("D");
        }
        else if(percentage<70)
        {
            System.out.println("c");
        }
        else if(percentage<101)
        {
            System.out.println("A");
        }
    }
 
    public static void main(String[] args) {
        markcalculator a = new markcalculator();
        a.marks();
        a.calculation();
        a.grade();


    }
}