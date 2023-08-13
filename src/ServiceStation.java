public class ServiceStation {
    public void check(Serviceable serviceable) {
        serviceable.doService();
    }

    public void check(Transport transport) {
        transport.setModelName("new name");
        transport.doService();
    }


}



