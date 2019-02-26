package JavaPractice;

public class twodimensionalarray {

	public static void main(String[] args) {
		//
        String[][] str=new String[3][5];
        System.out.println(str.length);//it will give you total number of rows-3
        System.out.println(str[0].length);//it will give you total number of columns-5
        
        str[0][0]="P";
        str[0][1]="A";
        str[0][2]="D";
        str[0][3]="I";
        str[0][4]="A";
        
        str[1][0]="Zeenat";
        str[1][1]="JAHAN";
        str[1][2]="DELHI";
        str[1][3]="INDIA";
        str[1][4]="110095";
        
        str[2][0]="Swati";
        str[2][1]="Gupta";
        str[2][2]="DELHI";
        str[2][3]="INDIA";
        str[2][4]="110095";
                
        System.out.println(str[1][2]);
        System.out.println(str[2][2]);
        System.out.println(str[2][2]);

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXUsing FOR LOOPXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        //print the values in 2d Array
        for(int row=0;row<str.length;row++)
        {
        	for(int col=0;col<str[0].length;col++)
        	{
                System.out.println(str[row][col]);

        	}
        }
     }  
}
