class AlphabetsPattern
{
  public static void main(String abc[])
  {
   for(int i=1;i<5;i++)
   {
   int alphabet=65;                          //ASCII value of A
   for(int j=1;j<=i;j++)
   {
   System.out.print((char)alphabet);
   alphabet++;
   }
   System.out.println();
   }
  }
}