/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.asufian.openet.factory;

/**
 *
 * @author asufian
 */
public class FactoryProducer {
   public static AbstractFactory getFactory(FactoryType choice){  
      switch(choice){
          case STATS : return new StatsFactory();
          default : return null;
      }
   }
}
