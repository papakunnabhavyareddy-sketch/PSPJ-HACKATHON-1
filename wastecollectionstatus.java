import java.util.Scanner;
class wastecollectionstatus{
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter waste collected in kg:");
            double waste=sc.nextDouble();
            if(waste>=100){
                System.out.println("Collection target Acheived");
            }else{
                System.out.println("More waste collection required");

                }
                
            }


    }

