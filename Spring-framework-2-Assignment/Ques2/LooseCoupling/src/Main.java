import operations.AddOperation;
import operations.BusinessLogic;
import operations.MultiplyOperation;
import operations.SubractOperation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BusinessLogic businessLogic_1 = new BusinessLogic();
        AddOperation addOperation = new AddOperation();
        SubractOperation subractOperation = new SubractOperation();
        MultiplyOperation multiplyOperation = new MultiplyOperation();
        System.out.println(businessLogic_1.do_operation(19,12,addOperation));
        System.out.println(businessLogic_1.do_operation(19,12,subractOperation));
        System.out.println(businessLogic_1.do_operation(19,12,multiplyOperation));
    }
}