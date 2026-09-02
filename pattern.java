// // // // // public class pattern{
// // // // //     public static void main (String args[])
// // // // //     {
// // // // //         int m = 4;
// // // // //         int n = 6;
// // // // //         for(int  i = 1; i <= m; i++){
// // // // //             for (int j = 1; j<=n; j++){
// // // // //                 System.out.print("*");
// // // // //             }
// // // // //             System.out.println();
// // // // //         }

// // // //     }

// // // // }

// // // // // // op------>  ******
// // // // //               ******
// // // // //               ******
// // // // //               ******




// // // public class pattern{
// // //     public static void main (String args[])
// // //     {
// // //         int m = 4;
// // //         int n = 5;

// // //         for(int i = 1; i <=m; i++){
// // //             for(int j = 1; j<=n; j++){
// // //                 if(i ==1 || j ==1 || i==m || j == n){
// // //                     System.out.print("*");
// // //                 }else{
// // //                     System.out.print(" ");
// // //                 }
// // //             }
// // //         System.out.println();
        
// // //         }
// // //     }
// // // }

// // // // op ----> *****
// // //             *   *
// // //             *   *
// // //             *****



// // // public class pattern {
// // //     public static void main(String args[]){

// // //         int m = 4;

// // //         for(int i = 1; i<=m; i++){
// // //             for(int j = 1; j<=i; j++){
// // //                 System.out.print("*");
// // //             }
// // //             System.out.println();
// // //         }
// // //     }
// // // }

// // // // op--->  *
// // //            **
// // //            ***
// // //            ****


// // public class pattern{
// //     public static void main(String args[]){

// //         int n = 4;

// //         for (int i = n; i>=1; i--){
// //             for (int j = 1; j<=i; j++){
// //                 System.out.print("*");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }

// // // op ----> ****
// //             ***
// //             **
// //             *



// // public class pattern{
// //     public static void main(String args[]){

// //         int n =4;

// //         for (int i =1; i <=n; i++){
// //             for (int j = 1; j<= n-i; j++){
// //                 System.out.print(" ");
// //             }
// //             for (int j = 1; j<=i; j++){
// //                 System.out.print("*");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }


// // // op ------->     *
// //                   **
// //                  ***
// //                 ****  



// public class pattern {
//     public static void main(String args[]){

//         int n = 5;

//         for (int i = 1; i <= n; i++){
//             for (int j = 1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// // // op ---------> 1 
// //                  1 2 
// //                  1 2 3 
// //                  1 2 3 4 
// //                  1 2 3 4 5 


// public class pattern{
//     public static void main(String aargs[]){

//         int n = 5;

//         for (int i = 1; i <=n; i++){
//             for(int j =1; j<=n-i+1; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


//op --------> 1 2 3 4 5 
            //    1 2 3 4 
            //    1 2 3 
            //    1 2 
            //    1 


// // ------------------Floyd's Triangle below----------------------


// public class pattern{
//     public static void main(String args[]){
//         int n = 5;
//         int num = 1;

//         for (int i = 1; i<=n; i++ ){
//             for( int j = 1; j<=i; j++){
//                 System.out.print(num+" ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }

// // op------------> 1 
//                    2 3 
//                    4 5 6 
//                    7 8 9 10 
//                    11 12 13 14 15 



// public class pattern{
//     public static void main(String args[]){

//         int n = 5;

//         for(int i = 1; i<=n; i++){
//             for (int j = 1; j<=i; j++){
//                 int sum = i+j;
//                 if( sum % 2 == 0 ){
//                     System.out.print("1 ");
//                 }else{
//                     System.out.print("0 ");
//                 }
               
//             }
//             System.out.println();
//         }
//     }
// }



// // //op---------> 1 
// //                0 1 
// //                1 0 1 
// //                0 1 0 1 
// //                1 0 1 0 1 



