package JavaRelatedTopics;

public class FirstArrayProg {

	public static void main(String[] args) {
		
		/*
		int a[] = new int[5];
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		a[3]= 40;
		a[4]= 50;
		
		
		System.out.println(a.length);
		for(int i=0;i<=a.length;i++)
		System.out.println(a[i]);
*/		
//----------------------------------------------------------------------------------------
		
// second way of writing array related program 
		
		/*
		int a[] ={1,2,3,4};
		System.out.println(a.length);
		for(int i=0;i<=a.length;i++)
			System.out.println(a[i]);*/
		
//----------------------------------------------------------------------------------------
	/*// STRING RELATED ARRAY
            String cars[] ={"BMW","AUDI","MERCEDES BENZ", "RANGEROVER", "JAGUAR"};
            System.out.println(cars.length);
            System.out.println(cars);
            
            for(int i=0;i<cars.length;i++)
            {
            	System.out.println("cars[i]");
            }*/
//------------------------------------------------------------------------------------------
 	//2 dimensional array
            
            int arr [][]= new int[3][3];  //3 rows with 3 columns
            arr[0][0]=1;
            arr[0][1]=2;
            arr[0][2]=3;
            arr[1][0]=4;
            arr[1][1]=5;
            arr[1][2]=6;
            arr[2][0]=7;
            arr[2][1]=8;
            arr[2][2]=9;
    int row=arr.length;
    System.out.println(row);
    int column = arr.length;
    System.out.println(column);
	for(int i=0;i<row;i++){
		for(int j=0;j<column;j++){
			System.out.println(arr[i][j]+"");
		}
	}
	}

}
