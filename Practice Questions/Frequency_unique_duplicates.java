import java.util.Scanner;
class Count_key{
    int i=0,j=0,c=0,d=0,u=0;
    void key(int a[]){
        for(i=0;i<a.length;i++){
            if(a[i]!=1000){
            c=1;
            for(j=i+1;j<a.length;j++){
            if (a[j]==a[i]){
                c+=1;
                a[j]=1000;
            }}
            System.out.println("freqency of "+a[i]+" in array is "+c);
            if(c!=1){
                d+=1;
            }
            else{
                u+=1;
            }
        }}
         System.out.println("no.of repeated elements in array is "+d);
         System.out.println("no.of unique elements in array is "+u);
    } }
class Frequency_unique_duplicates{
	public static void main(String[] args) {
	    Scanner ine = new Scanner(System.in);
	    System.out.println("Enter the length of array");
	    int n=ine.nextInt();
	    int a1[]=new int[n]; 
	    int i=0;
	    System.out.println("Enter the array elments less than 1000");
	    for(i=0;i<n;i++){
	        a1[i]=ine.nextInt();
	    }
	    Count_key a11=new Count_key();
	    a11.key(a1);
	    
	    
		ine.close();
	}}
