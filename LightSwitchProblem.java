/*
X  X    X
     X
    X
     X
        X

   X

X
         X
*/
public class LightSwitchProblem
{
   static int       MAX               = 100;
   static boolean[] lightSwitchStatus = new boolean [MAX + 1]; // I will use 1 to 100 slots of array

   public static void main (String[] args)
   {
      // Turn all switches ON
      for (int switchNum = 1; switchNum <= MAX; switchNum++)
      {
         lightSwitchStatus[switchNum] = true;
      }

      // Toggle every 2nd switch, and then every 3rd switch, etc ...
      for (int everyNSwitch = 2; everyNSwitch <= MAX; everyNSwitch++)
      {
         for (int switchNum = everyNSwitch; switchNum <= MAX; switchNum = switchNum + everyNSwitch)
         {
            lightSwitchStatus [switchNum] = !(lightSwitchStatus [switchNum]);
            //System.out.prinltn (
         }
      }

      // Display final status of the switches, 10 per line
      for (int switchNum = 1; switchNum <= MAX; switchNum++)
      {
         //System.out.print (String.format("%3d", switchNum) + ".  ");

         if (lightSwitchStatus[switchNum] == false)
            System.out.print (" ");
         else
            System.out.print ("X");

         if (switchNum % 10 == 0)
            System.out.println ();
      }

   }
}