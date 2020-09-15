public class Main {

    public static void main(String[] args){
       int summa = 0;
       int mult = 1;
       for (int i = 0; i <= args.length - 1; i++){
           summa += Integer.parseInt(args[i]);
           mult *= Integer.parseInt(args[i]);
       }

       System.out.println("Summa: " + summa);
       System.out.println("proizvedenie: " + mult);

    }
}
