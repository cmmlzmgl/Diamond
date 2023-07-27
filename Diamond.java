public class Diamond {
    public static void main(String[] args) {

        for ( int i = 1; i <= 5; i++)
        {
            for(int k = i; k<5; k++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j < 2*i; j++)
            {
                System.out.print("*");
            }System.out.println();
        }
        for ( int i = 1; i <= 4; i++)
        {
            for(int k = 0; k<i; k++)
            {
                System.out.print(" ");
            }
            for(int j = 9 ; j > 2*i; j--)
            {
                System.out.print("*");
            }System.out.println();
        }


    }
}
