package di;

import javax.management.InstanceNotFoundException;

public class Client {
    public static void main(String[] args) throws InstanceNotFoundException {
        Banhxe banhxe= (Banhxe) Injection.getInstance("banhxe");
//        Banhxe banhxe = new Banhxe2();
        Xe xe = new Xe();
        xe.setBanhxe(banhxe);
        xe.run();
    }
}
