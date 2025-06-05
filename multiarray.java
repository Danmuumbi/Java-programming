public class multiarray {
    public static void main(String [] args){
        // int[][] multi_array = {{1,2,3,4},{5,6,7,8}};

        // for(int i = 0; i < multi_array.length; i++)
        for(int i = 1; i <= 3; i++){
            // for(int j = 0; j < multi_array[i].length; j ++)
            for(int j = 1; j <= 3; j ++){
                // System.out.println(multi_array[i][j]);
                if ( i == 2 && j == 2) {
                    break;
                    // continue;
                    
                    
                }
                System.out.println(i + " " + j);
            }
        }
    }
    
}
