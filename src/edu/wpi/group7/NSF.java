package edu.wpi.group7;

import java.util.ArrayList;
import java.util.List;

class NSF
{
   protected String name;
   protected List<Player> players;

   public NSF()
   {
      this.name = null;
      this.players = new ArrayList<Player>();
   }
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
      String printable = this.name + "\'s players: ";
      for(Player player : players)
      {
         printable += player.getName() + ",";
      }
      System.out.println(printable.substring(0, printable.length() - 1));
   }

   public void addPlayer(Player player)
   {
      players.add(player);
   }

   @Override
   public String toString()
   {

      return "NSF{" + "name='" + name + '\'' + '}';
   }
}
