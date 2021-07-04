public class generics{
    public static < T > void genericArray(T[] types) {
        for ( T type : types){
            System.out.print(type + " ");
        }
        System.out.println();
    }
    public static void main( String args[] )
    {
        Integer[] int_Array = { 20, 09 , 06, 28, 00 };
        String[] string_Array  = {"janamdin", "mubarak", "bhaijaan"};

        System.out.println( "the integer array is - " );
        genericArray(int_Array);

        System.out.println( "the string array is - " );
        genericArray(string_Array );
    }
}
