package practice;

public class question4 {
    public static void main(String[] args) {
        int [][] arr = {{1,3,5},{5,6,2},{10,50,30},{1,75,15}};
        System.out.println("Sum of all elements of each row : ");

        for(int i=0;i<4;i++){
            System.out.print("ROW "+(i+1)+" :  ");
            int sum=0;
            for(int j=0;j<3;j++){
                sum+=arr[i][j];
//                System.out.print(arr[i][j]+" ");
            }
            System.out.println(sum);
        }
        System.out.println("Sum of all elements of each Column : ");

        for(int i=0;i<3;i++){
            System.out.print("COLUMN "+(i+1)+" :  ");
            int sum=0;
            for(int j=0;j<4;j++){
                sum+=arr[j][i];
//                System.out.print(arr[i][j]+" ");
            }
            System.out.println(sum);
        }
    }
}
