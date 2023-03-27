package GenericMethod;

public class Main {
    public static void main(String[]args){
        Digital digitalOne=new Digital(20,50,30,35,25);
        Digital digitalTwo=new Digital(50,26,21,28,27);
        Digital digitalThree=new Digital(45,40,20,30,22);
        Digital total=first(digitalOne,digitalTwo,digitalThree);
        System.out.println(" Digital Point " + total.scoreCalculation());
        Verbal verbalOne=new Verbal(25,18,27,21,45);
        Verbal verbalTwo=new Verbal(28,25,17,14,42);
        Verbal verbalThree=new Verbal(35,12,22,29,38);
        Verbal totalVerbal=first(verbalOne,verbalTwo,verbalThree);
        System.out.println(" Verbal Point " + totalVerbal.scoreCalculation());

    }
    public static <E extends Applicant> E first (E e1, E e2, E e3){
        if(e1.scoreCalculation()> e2.scoreCalculation() && e1.scoreCalculation()> e3.scoreCalculation()){
            return e1;
        }
        if(e2.scoreCalculation()> e1.scoreCalculation() && e2.scoreCalculation()> e3.scoreCalculation()){
            return e2;
        }
        if(e3.scoreCalculation()> e2.scoreCalculation() && e3.scoreCalculation()> e1.scoreCalculation()){
            return e3;
        }else {
            return e1;
        }
    }
}
