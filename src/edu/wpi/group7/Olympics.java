package edu.wpi.group7;

import java.util.ArrayList;

public class Olympics
{
   public static void main(String[] args)
   {
      NSF[] nsfArray = new NSF[5];

      for(int i = 0; i < 5; i++)
      {
         nsfArray[i] = new NSF();
         nsfArray[i].setName("NSF_" + i++);
      }

      Player[] playerArray = new Player[15];

      for(int i = 0; i < 15; i++)
      {
         playerArray[i] = new Player();
         playerArray[i].setName("player_" + i++);
      }

      int i = 0;
      for(NSF nsf : nsfArray)
      {
         nsf.addPlayer(playerArray[i++]);
         nsf.addPlayer(playerArray[i++]);
         nsf.addPlayer(playerArray[i++]);
      }

      playerArray[0].addNSF(nsfArray[0]);
      playerArray[0].addNSF(nsfArray[1]);

      playerArray[1].addNSF(nsfArray[1]);
      playerArray[1].addNSF(nsfArray[2]);

      playerArray[2].addNSF(nsfArray[3]);
      playerArray[2].addNSF(nsfArray[4]);

      NOC[] nocArray = new NOC[2];

      i = 0;
      for(NOC noc : nocArray)
      {
         noc.setName("NOC_" + i++);
      }

      ArrayList<NSF> firstThree = new ArrayList<>();
      firstThree.add(nsfArray[0]);
      firstThree.add(nsfArray[1]);
      firstThree.add(nsfArray[2]);

      nocArray[0].setNSFs(firstThree);

      ArrayList<NSF> remainingTwo = new ArrayList<>();
      remainingTwo.add(nsfArray[3]);
      remainingTwo.add(nsfArray[4]);

      nocArray[1].setNSFs(remainingTwo);

      ArrayList<NOC> nocs = new ArrayList<NOC>();
      nocs.add(nocArray[0]);
      nocs.add(nocArray[1]);

      ROC roc = new ROC("ROC_0", nocs);

      System.out.println("f.)");
      for(NSF nsf : nsfArray)
      {
        nsf.listNSFPlayers();
      }
      System.out.println("g.)");
      playerArray[0].listPlayerNSFs();
      playerArray[2].listPlayerNSFs();
      System.out.println("h.)");
      System.out.println(roc.countPlayersInNOCNSFs());
      System.out.println("i.)");
      System.out.println(roc.countNSFs());
   }
}