package edu.wpi.group7;

import java.util.List;

class Player
{
   private String name;
   private List<NSF> NSFs;

   public Player(String name)
   {
      this.name = name;
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

   }

   public void addNSF(NSF nsf)
   {

   }
}

