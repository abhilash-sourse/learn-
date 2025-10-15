public class patterns {
    public static void main(String[] args){
        int n = 5;
        // for(int i=0;i<=n;i++){
        //     for(int j =0;j<=i;j++){
        //         System.out.print("*");
        //     }System.out.println();
        // }

                        // 2
        // for(int i=0;i<=n;i++){
        //     for(int j =i;j<=n;j++){
        //         System.out.print("*");
        //     }System.out.println();
        // }

        
                        // 3
        // for(int i=0;i<=n;i++){
        //     for(int k =0;k<i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j = i ;j <=n;j++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }


                        // 4
        // for(int i=0;i<=n;i++){
        //     for(int k =i;k<n;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0 ;j <=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    

                    // 5

    // for(int i=0;i<=n;i++){
    //         for(int k =0;k<i;k++){
    //             System.out.print(" ");
    //         }
    //         for(int j = i;j <=n;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

                        // 6

    // for(int i=1;i<=n;i++){
    //         for(int j =1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     for(int k=1;k<=n-1;k++){
    //         for(int m = k;m<=n-1;m++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

                        // 7

    // for(int i=0;i<=n;i++){
    //         for(int k =i;k<n;k++){
    //             System.out.print(" ");
    //         }
    //         for(int j = 1 ;j <=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     for(int i=2;i<=n;i++){
    //         for(int k =1;k<i;k++){
    //             System.out.print(" ");
    //         }
    //         for(int j = i;j <=n;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }



                    // 8

        int i, z = 1;
        for( i =1;i<=n;i++){
        for(int j=n-1;j<=i;j++){
            System.out.print(" ");
        }for(int k=1;k<=z;k++){
            System.out.print("*");
        }
        z +=2;
        System.out.println();
    }
    }
    
}

