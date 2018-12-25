public class GradeCuttoffs
{
    public static void main ( String[] args ) 
    {
        String[] letters = {"A","A-","B+","B","B-","C+","C","C-","D+","D","D-","F"};
        int[] cuttoffs = {95,90,87,83,80,77,73,70,67,63,60,0};
        System.out.println("Your cuttoff points are: ");
        for(int i = 0; i < letters.length; i++)
        {
            System.out.println(letters[i] + "\t" + cuttoffs[i]);
        }
    }
}