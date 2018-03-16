package factoryMethod;

import java.util.Date;

public class ArrowWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("arrow - " + new Date());
    }

}
