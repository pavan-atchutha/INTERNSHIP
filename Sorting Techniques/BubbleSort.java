import java.util.Scanner;
class Bubblesort{
    int i=0,j=0,t;
    void Bubble_sort(int a[]){
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("sorted array");
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    } }
class BubbleSort{
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
	    Bubblesort a11=new Bubblesort();
	    a11.Bubble_sort(a1);
	    
	    
		ine.close();
	}}
