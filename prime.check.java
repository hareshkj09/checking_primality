import java.util.Scanner;
class Main {
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a positive number : ");
int x = sc.nextInt();
int n=1;
if(x==1){System.out.println("neither prime nor composite");}
else{
    for(int i=2;i<=(x/2);i++){
        if(x%i!=0){n=n+1;}
        else if(x%i==0){System.out.println("It is divisible by"+i);}
    }
    if(n==(x/2)){System.out.println("it is a prime number");}
    else{System.out.println("it is a composite number");}
}
    }
}
