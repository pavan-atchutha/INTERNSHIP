import java.util.Scanner;
class Find_key{
    int i=0,j=0;
    void key(int a[],int k){
        for(i=0;i<a.length;i++){
            if (k==a[i]){
                System.out.println("index of key in array is "+i);
                j=1;
                break;
            }
        }
       if(j==0){
           System.out.println("key not found in array");
       }
    } }
class Findkey{
	public static void main(String[] args) {
	    Scanner ine = new Scanner(System.in);
	    System.out.println("Enter the length of array");
	    int n=ine.nextInt();
	    int a1[]=new int[n]; 
	    int i=0;
	    System.out.println("Enter array elements");
	    for(i=0;i<n;i++){
	        a1[i]=ine.nextInt();
	    }
	    System.out.println("Enter key value");
	    int k=ine.nextInt();
	    Find_key a11=new Find_key();
	    a11.key(a1,k);
	    
	    
		ine.close();
	}}
