package cn.waqwb;

public class SimpleCalc {
    public int value;
    public void calculate(){
        value += 7;
    }
}
class MultiCalc extends SimpleCalc{
    @Override
    public void calculate() {
        value -= 3;
    }
    public void calculate(int multiplier){
        calculate();
        super.calculate();
        value += multiplier;
    }

    public static void main(String[] args) {
        MultiCalc calc = new MultiCalc();
        calc.calculate(2);
        System.out.println("value is :"+calc.value);
    }
}

