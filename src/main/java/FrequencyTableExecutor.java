import java.util.concurrent.Callable;

/**
 * Created by ravi on 2/3/20.
 */
public class FrequencyTableExecutor implements Callable {
    String task;
    FrequencyTableExecutor(String name)
    {
        this.task=name;
    }
    public String call()
    {
        System.out.println("FrequencyTable is opened");
        int value = GlobalConfiguration.getConfiguration(task);
        value = value +10;
        GlobalConfiguration.setconfiguration(task,value);
        System.out.println("Updated Value is \n "+task+ " : "+value);
        return task;
    }
}
