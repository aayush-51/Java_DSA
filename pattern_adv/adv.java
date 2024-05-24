package pattern_adv;

public class adv {

    public static void hollow_rectangle(int totRows, int totCols) {
        // outer loop
        for(int i=1; i<=totRows; i++){
            // inner - colums
            for(int j=1; j<=totCols; j++){
                // cell - (i,j)
                if(i ==1 || i == totRows || j == 1 ||j==totCols){
                    // boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    


    public static void inverted_rotated_half_pyramid(int n){
        // outer 
        for(int i=1; i<=n; i++){
            //spaces
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            //starts
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }

            System.out.println();
        }
    }



    public static void inverted_half_pyramid_withNumbers(int n){
        
        // mera logic

        // int count = n;
        // for(int line=1; line<=n; line++){
        //     for(int num=1; num<=count; num++){
        //         System.out.print(num);
        //     }

        //     System.out.println();
        //     count--;
        // }

        // di's logic

        for(int line=1; line<=n; line++){
                for(int num=1; num<=(n-line+1); num++){
                    System.out.print(num);
                }
    
                System.out.println();
            }

    }



    public static void floyds_triangle(int n){
        int digit = 1;
        for(int line=1; line<=n; line++){
            for(int num=1; num<=line; num++){
                System.out.print(digit + " ");
                digit++;
            }
            System.out.println();
        }
    }



    public static void triangle_0_1(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                if( (row+col) % 2 == 0 ){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }



    public static void butterfly(int n){
        //1st half
        for(int i=1; i<=n; i++){
            //stars - i
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }

            //spaces - 2*(n-1)
            for(int space=1; space<=2*(n-i); space++){
                System.out.print(" ");
            }

            // stars - i
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }

            System.out.println();
        }

        //2nd half
        for(int i=n; i>=1; i--){
            //stars - i
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }

            //spaces - 2*(n-1)
            for(int space=1; space<=2*(n-i); space++){
                System.out.print(" ");
            }

            // stars - i
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }

            System.out.println();
        }
    }



    public static void solid_rhombus(int n){
        for(int i=1; i<=n; i++){
            //spaces - n-i
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }

            //stars - n
            for(int star=1; star<=n; star++){
                System.out.print("*");
            }

            System.out.println();
        }
    }



    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            //spaces - n-i
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }

            //hollow rectangle - stars
            for(int j=1; j<=n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    public static void main(String args[]){

        //hollow_rectangle(10, 7);

        //inverted_rotated_half_pyramid(4);

        //inverted_half_pyramid_withNumbers(5);

        //floyds_triangle(4);
        
        //triangle_0_1(5);

        // butterfly(5);

        // solid_rhombus(5);

        hollow_rhombus(5);
    }
}
