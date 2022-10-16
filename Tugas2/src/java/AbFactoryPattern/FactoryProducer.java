package AbFactoryPattern;

public class FactoryProducer {
    public static AbFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("UANG")){
            return new UangFactory();
        }else if(choice.equalsIgnoreCase("KONDISI")){
            return new KondisiFactory();
        }
        return null;
    }
}
