import java.io.*;
class primeAdd {
    public static void main (String args[]) throws IOException{
        int no,sum=0; 
        boolean isprime;
        System.out.println("Enter number greater than 1:");
        BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
        no=Integer.parseInt(br.readLine());
        int i,j;
        for(i=2;i<=no;i++)
        {   
            isprime=true;
            for(j=2;j<=no/2;j++)
            {   
                if(i!=j && i%j==0) {
                    isprime=false;
                    break;
                }
            }
            if(isprime) sum+=i;
        }
        System.out.println(sum);
    }
}
