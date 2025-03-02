package operations;
public class BusinessLogic {

    public int do_operation(int a, int b){
        AddOperation addOperation = new AddOperation();
//        SubractOperation subractOperation = new SubractOperation();
//        MultiplyOperation multiplyOperation = new MultiplyOperation();
        return addOperation.perform_task(a,b);
    }

}
