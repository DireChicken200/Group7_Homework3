package edu.wpi.group7;

import java.util.ArrayList;
import java.util.List;

class Player
{
   private String name;
   private List<NSF> NSFs;

   public Player()
   {
      this.name = null;
      this.NSFs = new ArrayList<NSF>();
   }
   public Player(String name)
   {
      this.name = name;
      this.NSFs = new ArrayList<NSF>();
   }

   public String getName()
   {

      return name;
   }

   public void setName(String name)
   {

      this.name = name;
   }

   public List<NSF> getNSFs()
   {

      return NSFs;
   }

   public void setNSFs(List<NSF> NSFs)
   {

      this.NSFs = NSFs;
   }

   public void listPlayerNSFs()
   {
      String printable = this.name + "\'s NSFs: ";
      for(NSF nsf : NSFs)
      {
         printable += nsf.getName() + ",";
      }
      System.out.println(printable.substring(0, printable.length() - 2));
   }

   public void addNSF(NSF nsf)
   {
      this.NSFs.add(nsf);
   }

   @Override
   public String toString()
   {

      return "Player{" + "name='" + name + '\'' + ", NSFs=" + NSFs + '}';
   }
}

