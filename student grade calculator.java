imoport java.util.Scanner;
class grade{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("enter the 6 subject marks");
    int s1=input.nextInt();
    int s2=input.nextInt();
    int s3=input.nextInt();
    int s4=input.nextInt();
    int s5=input.nextInt();
    int s6=input.nextInt();
    int total = s1+s2+s3+s4+s5+s6;
    float per=total/6;
    System.out.println("the total marks"+total);
    System.out.println("the percentage"+per);
    if (per>=90)
      System.out.println("your grade is A");
    else if (per>=80)
      System.out.println("your grade is B");
    else if (per>=70)
      System.out.println("your grade is c");
    else if (per>=60)
      System.out.println("your grade is D");
    else if (per>=40)
     System.out.println("your grade is E");
    else 
       System.out.println("Fail");
  }
}
