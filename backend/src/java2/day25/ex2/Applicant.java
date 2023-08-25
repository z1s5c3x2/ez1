package java2.day25.ex2;

public class Applicant<T> {
   
   public T kind;
   
   public Applicant(T kind) {
      this.kind = kind;
   }
}