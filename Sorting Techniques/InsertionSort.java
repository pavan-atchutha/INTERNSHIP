import java.util.Scanner;
class Insertionsort{
    int i=0,j=0,t;
    void Insertion_sort(int a[]){
        for(i=1;i<a.length;i++){
		t=a[i];
		j=i;
		while(j>0 && a[j-1]>=t){
			a[j]=a[j-1];
		        --j;
                }
		a[j]=t;
        }
        System.out.println("sorted array");
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    } }
class InsertionSort{
	public static void main(String[] args) {
	    Scanner ine = new Scanner(System.in);
	    System.out.println("Enter the length of array");
	    int n=ine.nextInt();
	    int a1[]=new int[n]; 
	    int j=0,i=0;
	    System.out.println("Enter array elements");
	    for(i=0;i<n;i++){
	        a1[i]=ine.nextInt();
	    }
	    Insertionsort a11=new Insertionsort();
	    a11.Insertion_sort(a1);
	    
	    
		ine.close();
	}}
