enum Status{
    Running, Failed, Pending, Success;
}
public class index {

    public static void main(String[] args) {
        Status rStatus = Status.Running;
        System.out.println(rStatus);
        Status[] status = rStatus.values();
        // for(int i = 0; i <= 3; i++){
        //     System.out.println(status[i]);
        for(Status r : status)
        {
            System.out.println(r);
        }
    }
}
