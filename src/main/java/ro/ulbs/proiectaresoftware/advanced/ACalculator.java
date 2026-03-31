package ro.ulbs.proiectaresoftware.advanced;

public abstract class ACalculator {
   protected Object state;

   public Object result(){
       return state;
   }

   public void clear(){
       this.state=null;
   }

   public abstract void init(Object value);



}
