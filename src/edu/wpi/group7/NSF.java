package edu.wpi.group7;

import java.util.ArrayList;
import java.util.List;

class NSF
{
   protected String name;
   protected List<Player> players;

   public NSF(String name)
   {
      this.name = name;
      this.players = new ArrayList<Player>();
   }

   public String getName()
   {

      return name;
   }

   public void setName(String name)
   {

      this.name = name;
   }

   public List<Player> getPlayers()
   {

      return players;
   }

   public void setPlayers(List<Player> players)
   {

      this.players = players;
   }

   public void listNSFPlayers()
   {
      String printable = this.toString() + "\'s players: ";
      for(Player player : players)
      {
         printable += player.getName() + ",";
      }
      System.out.println(printable.substring(0, printable.length() - 2));
   }

   public void addPlayer(Player player)
   {

   }

   @Override
   public String toString()
   {

      return this.name;
   }
}
