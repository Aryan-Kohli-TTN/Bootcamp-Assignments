package operations;
public class BusinessLogic {

    public int do_operation(int a, int b,Operation operation){
        // any business logic will come here
        /*
        here for loose coupling we are providing the type of operation already so it dont have to choose here

        * */
        return operation.perform_task(a,b);
    }

}
