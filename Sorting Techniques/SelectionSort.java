import java.util.Scanner;
class Selectionsort{
    int i=0,j=0,t;
    void Selection_sort(int a[]){
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    t=a[j];
                    a[j]=a[i];
                    a[i]=t;
                }
            }
        }
        System.out.println("sorted array");
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    } }
class SelectionSort{
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
	    Selectionsort a11=new Selectionsort();
	    a11.Selection_sort(a1);
	    
	    
		ine.close();
	}}
