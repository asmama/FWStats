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
