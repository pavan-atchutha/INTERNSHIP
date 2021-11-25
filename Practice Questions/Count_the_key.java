import java.util.Scanner;
class Count_key{
    int i=0,j=0,c=0;
    void key(int a[],int k){
        for(i=0;i<a.length;i++){
            if (k==a[i]){
                c+=1;
                j=1;
            }
        }
       if(j==0){
           System.out.println("key not found in array");
       }
       else{
           System.out.println("count of key in array is "+c);
       }
    } }
class Count_the_key{
	public static void main(String[] args) {
	    Scanner ine = new Scanner(System.in);
	    System.out.println("Enter the length of array");
	    int n=ine.nextInt();
	    int a1[]=new int[n]; 
	    int i=0;
	    System.out.println("Enter the array elements");
	    for(i=0;i<n;i++){
	        a1[i]=ine.nextInt();
	    }
	    System.out.println("Enter key value");
	    int k=ine.nextInt();
	    Count_key a11=new Count_key();
	    a11.key(a1,k);
	    
	    
		ine.close();
	}}
